import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.math.BigInteger;

public class top5 {

    Path pPIw = Paths.get("ledger_KMC/player_info.log");

    public top5() throws FileNotFoundException, IOException {
        tFive();
    }

    public void tFive() throws FileNotFoundException, IOException {
        String endOfName = "> ";
        String hamp = "&";
        String und = "_";
        String comm = ",";
        String tild = "~";
        String semi = ";";

        File input44 = new File("Program_Files/latestTxs4.log");
        File tempFile44 = new File("ledger_KMC/ledger_current.txt");
        File processedFile = new File("processed_txs.log");
        
        try (BufferedReader reader44 = new BufferedReader(new FileReader(input44));
             BufferedWriter writer44 = new BufferedWriter(new FileWriter(tempFile44, true));
             BufferedWriter processedWriter = new BufferedWriter(new FileWriter(processedFile, false))) {
            
            String cL44;
            int transactionCount = 0;
            boolean wrappingTransactionProcessed = false;
            
            // Minimum amount threshold for wrapping transactions (1 quadrillion)
            BigInteger minimumWrappingAmount = new BigInteger("1000000000000000");
            
            // Process exactly 5 transactions, allowing only one wrapping transaction
            while ((cL44 = reader44.readLine()) != null && transactionCount < 5) {
                // Parse transaction components
                int iend = cL44.indexOf(endOfName);
                int ihamp = cL44.indexOf(hamp);
                int iund = cL44.indexOf(und);
                int icomm = cL44.indexOf(comm);
                int itild = cL44.indexOf(tild);
                int isemi = cL44.indexOf(semi);
                
                String SName = cL44.substring(41, iend);
                String SAmount = cL44.substring(ihamp + 1, iund);
                String RWallet = cL44.substring(iund + 1, icomm);
                String SGas = cL44.substring(icomm + 1, cL44.indexOf("$"));
                String TransHash = cL44.substring(itild + 1, cL44.indexOf("%"));
                
                // Check if this is a wrapping transaction
                boolean isWrappingTx = TransHash.startsWith("KMC") && RWallet.equals("21000001");
                
                if (isWrappingTx && wrappingTransactionProcessed) {
                    // Skip this wrapping transaction - we already processed one
                    continue;
                }
                
                // Check if wrapping transaction meets minimum amount threshold
                if (isWrappingTx) {
                    BigInteger txAmount = new BigInteger(SAmount);
                    if (txAmount.compareTo(minimumWrappingAmount) < 0) {
                        // Skip this wrapping transaction - amount is below threshold
                        continue;
                    }
                }
                
                // Process this transaction
                processTransaction(cL44, SName, SAmount, RWallet, SGas, writer44, isemi, isWrappingTx);
                
                // Write the full original transaction line to processed_txs.log
                processedWriter.write(cL44 + "\n");
                transactionCount++;
                
                if (isWrappingTx) {
                    wrappingTransactionProcessed = true;
                }
            }
        }
        
        updateTxPanelFiles();
    }

    private void processTransaction(String cL44, String SName, String SAmount, String RWallet, String SGas, BufferedWriter writer44, int isemi, boolean isWrappingTx) throws IOException {
        // Write transaction to ledger
        String WriteTx = cL44.substring(cL44.indexOf("> ") + 2, isemi + 1);
        writer44.write(WriteTx + " ");
        
        // If this is a wrapped transaction, also write it to wrapped_official.log
        if (isWrappingTx) {
            // Convert amount to Solana format (divide by 100 million for 6 decimal places)
            BigInteger originalAmount = new BigInteger(SAmount);
            BigInteger solanaAmount = originalAmount.divide(new BigInteger("100000000")).multiply(new BigInteger("64"));
            
            // Replace the original amount with the Solana-formatted amount in the transaction string
            String solanaWriteTx = WriteTx.replace("&" + SAmount + "_", "&" + solanaAmount.toString() + "_");
            
            try (BufferedWriter wrappedWriter = new BufferedWriter(new FileWriter("wrapped_official.log", false))) {
                wrappedWriter.write(solanaWriteTx + " ");
            }
        }
        
        // Update sender balance
        updateSenderBalance(SName, SAmount, SGas);
        
        // Update receiver balance
        updateReceiverBalance(RWallet, SAmount);
    }

    private void updateSenderBalance(String SName, String SAmount, String SGas) throws IOException {
        try (BufferedReader reader100 = new BufferedReader(new FileReader("ledger_KMC/player_info.log"))) {
            String cL100;
            while ((cL100 = reader100.readLine()) != null) {
                if (cL100.equals(SName)) {
                    String SWalletPIat = reader100.readLine();
                    String BalancePI = reader100.readLine();
                    
                    BigInteger BalancePIb = new BigInteger(BalancePI);
                    BigInteger AmountSent = new BigInteger(SAmount);
                    BigInteger GasBurned = new BigInteger(SGas);
                    BigInteger TotalDeduction = AmountSent.add(GasBurned);
                    BigInteger NewBalancePI = BalancePIb.subtract(TotalDeduction);
                    
                    String pPIw100 = Files.readString(pPIw);
                    Files.writeString(pPIw, pPIw100.replace(
                        SName + "\n" + SWalletPIat + "\n" + BalancePI,
                        SName + "\n" + SWalletPIat + "\n" + NewBalancePI));
                    break;
                }
            }
        }
    }

    private void updateReceiverBalance(String RWallet, String SAmount) throws IOException {
        String RWalletAt = "@" + RWallet;
        
        try (BufferedReader reader101 = new BufferedReader(new FileReader("ledger_KMC/player_info.log"))) {
            String cL101;
            while ((cL101 = reader101.readLine()) != null) {
                if (cL101.equals(RWalletAt)) {
                    String BalanceRx = reader101.readLine();
                    
                    BigInteger BalanceRxBi = new BigInteger(BalanceRx);
                    BigInteger AmountRxBi = new BigInteger(SAmount);
                    BigInteger NewBalanceRx = BalanceRxBi.add(AmountRxBi);
                    
                    String pPIw101 = Files.readString(pPIw);
                    Files.writeString(pPIw, pPIw101.replace(
                        "\n" + RWalletAt + "\n" + BalanceRx,
                        "\n" + RWalletAt + "\n" + NewBalanceRx));
                    break;
                }
            }
        }
    }

    public void updateTxPanelFiles() throws IOException, FileNotFoundException {
        Path upPI = Paths.get("localplayer.txt");
        String PNameUp = Files.readString(upPI);
        String PNameUpS = PNameUp.substring(1);
        
        try (BufferedReader reader103 = new BufferedReader(new FileReader("ledger_KMC/player_info.log"))) {
            String cL103;
            while ((cL103 = reader103.readLine()) != null) {
                if (cL103.equals(PNameUpS)) {
                    String WalletUp = reader103.readLine();
                    String BalanceUp = reader103.readLine();
                    String TxsUp = reader103.readLine();
                    
                    Path p1234n = Paths.get("wallet_address.log");
                    Path p1234h = Paths.get("player_balance.log");
                    Path p1234j = Paths.get("player_txs.log");
                    
                    Files.writeString(p1234n, WalletUp);
                    Files.writeString(p1234h, BalanceUp);
                    Files.writeString(p1234j, TxsUp);
                    break;
                }
            }
        }
    }
}