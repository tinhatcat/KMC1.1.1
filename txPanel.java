import java.io.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.math.BigInteger;
import java.lang.StringBuilder;
import java.lang.String;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class txPanel extends JFrame implements ActionListener {

int r = 0;
int wrap = 0;
String PNameSync2;
String PNameSync3;
private static final long serialVersionUID = 2427596200598150517L;
String txHash;
String sBothHash;
String txHasha;
String sBothHasha;
String sBoth;
String ssBoth;
String transHash;
String NewPublicKey;
Path p1 = Paths.get("first_block_mined.log");
Path p2 = Paths.get("privatekey.txt");
Path PlayerBalance = Paths.get("player_balance.log");
Path PlayerBlocksMined = Paths.get("player_blocks_mined.log");
Path PlayerTxSent = Paths.get("player_txs.log");
Path PlayerWallet = Paths.get("wallet_address.log");
Path LatestBlockP = Paths.get("Program_Files/lastblockledger.log");
Path LatestPlayerP = Paths.get("Program_Files/lastplayerledger.log");
Path LatestBlockHashP = Paths.get("Program_Files/lastblockhash.log");
Path LatestTxsP = Paths.get("Program_Files/latestTxs4.log");
Path CHashP = Paths.get("ledger_KMC/consensus_HASH.log");
Path LocalPlayer = Paths.get("localplayer.txt");
File file1 = new File("ledger_KMC/player_info.log");
File file2 = new File("wallet_address.log");
File file3 = new File("player_balance.log");
File file4 = new File("player_txs.log");
File file5 = new File("publickey.log");
File file6 = new File("localplayer.txt");
private JPanel panel;
private JLabel label2i,CHash,LatestTxs,latestLabela,latestLabelb,LatestBlock,LatestPlayer,LatestBlockHash,Label1,Label2,Label3,userLabela,userLabelb,userLabel, userLabel2, userLabel3,userLabel4,userLabel5,TxHashLabel,SecretInputLabel;
private JTextField wrapOutput,Amount,RWallet,Gas,txNoHash;
private JButton getWrapHash,getTxHash,cancelButton,refreshButton,wrapMinButton,wrapMaxButton;
private JTextArea CHashJ,LatestTxsJ,LatestPlayerJ,LatestBlockHashJ,LatestBlockJ,Balance,TxSent,Wallet,TxHashField,SecretInputField;
JMenu menu, submenu;  
JMenuItem i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14;  


public txPanel() {

Image icon = Toolkit.getDefaultToolkit().getImage("icon3.png");
setIconImage(icon);

try
{
getPlayersInfo2();
}
catch(IOException ioexc1){}

try
{
new PrintWriter("Program_Files/txPanel.log").close();
}
catch(IOException yaMom){}

        userLabela = new JLabel("   *Player Info*");
        userLabelb = new JLabel("");
        userLabel = new JLabel("             Wallet address");
        Wallet = new JTextArea();
        userLabel2 = new JLabel("             Balance");
        Balance = new JTextArea();
        userLabel3 = new JLabel("             Tx's Sent");
        TxSent = new JTextArea();
        userLabel4 = new JLabel("   *Tx Panel*");
        userLabel5 = new JLabel("Send all txs through Minecraft server. ");
wrapOutput = new JTextField();
LatestBlock = new JLabel("            Block");
LatestBlockJ = new JTextArea();
LatestPlayer = new JLabel("            Player");
LatestPlayerJ = new JTextArea();
LatestBlockHash = new JLabel("            Hash");
LatestBlockHashJ = new JTextArea();
LatestTxs = new JLabel("    Pending Txs");
LatestTxsJ = new JTextArea();
CHash = new JLabel("    Ledger Consensus");
CHashJ = new JTextArea();
        latestLabela = new JLabel("   *Latest Block Info*");
        latestLabelb = new JLabel("");
        Amount = new JTextField();
        RWallet = new JTextField();
        Gas = new JTextField();
        Label1 = new JLabel("             Amount to send");
        Label2 = new JLabel("             Receiving wallet");
        Label3 = new JLabel("             Gas (1KMC min)");
        getWrapHash = new JButton("$KMC wrap tx");
        wrapMinButton = new JButton("Wrap 10 KMCoin blocks = 640 KMC");
        wrapMaxButton = new JButton("Wrap 67 KMCoin blocks = 4288 KMC");
        TxHashLabel = new JLabel("    tx hash");
        TxHashField = new JTextArea();
        SecretInputLabel = new JLabel("    secret input");
        SecretInputField = new JTextArea();
        txNoHash = new JTextField(15);
        getTxHash = new JButton("KMCoin tx");
        cancelButton = new JButton("Exit KMCoin");
        refreshButton = new JButton("Refresh");
        getTxHash.addActionListener(this);
        cancelButton.addActionListener(this);
        refreshButton.addActionListener(this);
        getWrapHash.addActionListener(this);
        wrapMinButton.addActionListener(this);
        wrapMaxButton.addActionListener(this);
        panel = new JPanel(new GridLayout(19, 2));
        panel.add(userLabela);
        panel.add(userLabelb);
        panel.add(userLabel);
        panel.add(Wallet);
        panel.add(userLabel2);
        panel.add(Balance);
        panel.add(userLabel3);
        panel.add(TxSent);
        panel.add(userLabel4);
        panel.add(userLabel5);
        panel.add(Label1);
        panel.add(Amount);
        panel.add(Label2);
        panel.add(RWallet);
        panel.add(Label3);
        panel.add(Gas);
        panel.add(getTxHash);
        panel.add(txNoHash);
panel.add(wrapMinButton);
panel.add(wrapMaxButton);
panel.add(TxHashLabel);
panel.add(TxHashField);
panel.add(SecretInputLabel);
panel.add(SecretInputField);
panel.add(latestLabela);
panel.add(latestLabelb);
panel.add(LatestBlock);
panel.add(LatestBlockJ);
panel.add(LatestPlayer);
panel.add(LatestPlayerJ);
panel.add(LatestBlockHash);
panel.add(LatestBlockHashJ);
panel.add(LatestTxs);
panel.add(LatestTxsJ);
panel.add(CHash);
panel.add(CHashJ);
        panel.add(refreshButton);
        panel.add(cancelButton);
        add(panel, BorderLayout.CENTER);
        setTitle("KMCoin");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);

try
{
String PlayerBalanceS = Files.readString(PlayerBalance);
Balance.setText(PlayerBalanceS);
String TxSentS = Files.readString(PlayerTxSent);
TxSent.setText(TxSentS);
String PlayerWalletS = Files.readString(PlayerWallet);
Wallet.setText(PlayerWalletS);
PlayerBalanceS =null;
TxSentS =null;
PlayerWalletS =null;
}
catch (IOException ex3456qq) {System.out.println("Exception thrown for IO: " + ex3456qq);}


try
{
String LatestBlockS = Files.readString(LatestBlockP);
LatestBlockJ.setText(LatestBlockS);
String LatestPlayerS = Files.readString(LatestPlayerP);
LatestPlayerJ.setText(LatestPlayerS);
String LatestBlockHashS = Files.readString(LatestBlockHashP);
LatestBlockHashJ.setText(LatestBlockHashS);
String CHashS = Files.readString(CHashP);
CHashJ.setText(CHashS);
String LatestTxsS = Files.readString(LatestTxsP);
String LatestTxsSc = LatestTxsS.replaceAll("[\\[\\]]","").replaceAll("Render thread/INFO: CHAT <","").substring(9);
LatestTxsJ.setText(LatestTxsSc);
LatestBlockS=null;
LatestPlayerS=null;
LatestBlockHashS=null;
LatestTxsS=null;
LatestTxsSc=null;
CHashS=null;
}
catch (IOException ex3456qqq) {System.out.println("Exception thrown for IO: " + ex3456qqq);}
}


public void refreshPanel(){

try
{
String PlayerBalanceS = Files.readString(PlayerBalance);
Balance.setText(PlayerBalanceS);
Balance.repaint();
String TxSentS = Files.readString(PlayerTxSent);
TxSent.setText(TxSentS);
TxSent.repaint();
String PlayerWalletS = Files.readString(PlayerWallet);
Wallet.setText(PlayerWalletS);
Wallet.repaint();
}
catch (IOException ex3456qq) {System.out.println("Exception thrown for IO: " + ex3456qq);}
}


public void actionPerformed(ActionEvent e) {

if (e.getSource() == refreshButton)
{
dispose();

try(FileWriter writer2abcd3 = new FileWriter("Program_Files/txPanel.log"))
{
char character2abcd3 = 'x';
writer2abcd3.write(character2abcd3);
}
catch (IOException e69abcd3){System.out.println("An error occurred: " + e69abcd3.getMessage());}
}


if (e.getSource() == getWrapHash)
{

try
{
wrap=1;
generateTxHash();
getTxStuff();
}
catch(IOException exc1){}
}


if (e.getSource() == wrapMinButton)
{

try
{
wrap=1;
generateTxHash();
// Handle the hash file logic
handleHashFiles();
// Update the hash fields
updateHashFields();
getTxStuffMin();
}
catch(IOException exc1){}
}

if (e.getSource() == wrapMaxButton)
{

try
{
wrap=1;
generateTxHash();
// Handle the hash file logic
handleHashFiles();
// Update the hash fields
updateHashFields();
getTxStuffMax();
}
catch(IOException exc1){}
}

if (e.getSource() == getTxHash)
{

try
{
generateTxHash();
getTxStuff();
}
catch(IOException exc1){}
}

else 
if (e.getSource() == cancelButton)
{
System.exit(0);
dispose();
}
}


public void generateTxHash()throws IOException, UnsupportedEncodingException, FileNotFoundException{

String fString = Files.readString(LocalPlayer);
String fString2= fString.substring(1);
String cL1;
String aTxs;
BufferedReader buff1 = new BufferedReader(new FileReader(file1));

while((cL1 = buff1.readLine()) != null) 
{

if(cL1.equals(fString2))
{
buff1.readLine();
buff1.readLine();
aTxs = buff1.readLine();
int txs = Integer.parseInt(aTxs);
int rem = txs % 1000;

if(rem != 0)
{
rem++;
int iteration = 2002 - rem;

try
{
int batch = txs / 1000;

if(batch==0)
{
String s1 = Files.readString(p1);
String s2 = Files.readString(p2);
sBoth = s1 + s2;

for (int h = 1; h <= iteration; h++)
{
sBothHash = toHexString(getSHA(sBoth));
sBoth = sBothHash;
}
s1 = null;
s2 = null;
fString=null;
fString2=null;
cL1=null;
aTxs=null;
}

else
{
String s1 = Files.readString(p1);
String s2 = Files.readString(p2);
String sBoth = s1 + s2 + batch;

for (int g = 1; g <= iteration; g++)
{
sBothHash = toHexString(getSHA(sBoth));
sBoth = sBothHash;
}
s1 = null;
s2 = null;
}
txHash = sBothHash;
sBothHash = null;
}
catch (NoSuchAlgorithmException e) {System.out.println("Exception thrown for incorrect algorithm: " + e);}
catch (IOException ex) {System.out.println("Exception thrown for IO: " + ex);}
fString=null;
fString2=null;
cL1=null;
aTxs=null;
}

if(rem == 0 && txs != 0)
{
int batch = txs / 1000;
int lastBatch = batch - 1;

try
{
String s3 = Files.readString(p1);
String s4 = Files.readString(p2);

if(lastBatch==0)
{
String sBotha = s3 + s4;

for (int e = 1; e <= 1001; e++)
{
sBothHasha = toHexString(getSHA(sBotha));
sBotha = sBothHasha;
}
transHash = sBothHasha;
s3 = null;
s4 = null;
fString=null;
fString2=null;
cL1=null;
aTxs=null;
}

else
{
String sBotha = s3 + s4 + lastBatch;

for (int f = 1; f <= 1001; f++)
{
sBothHasha = toHexString(getSHA(sBotha));
sBotha = sBothHasha;
}
transHash = sBothHasha;
s3 = null;
s4 = null;
fString=null;
fString2=null;
cL1=null;
aTxs=null;
}
String s5 = Files.readString(p1);
String s6 = Files.readString(p2);
String ssBoth = s5 + s6 + batch;

for (int m = 1; m <= 2002; m++)
{
sBothHash = toHexString(getSHA(ssBoth));
ssBoth = sBothHash;
}
NewPublicKey = sBothHash;
s5 = null;
s4 = null;
String s7 = Files.readString(p1);
String s8 = Files.readString(p2);
ssBoth = s7 + s8 + batch;

for (int n = 1; n <= 2001; n++)
{
sBothHash = toHexString(getSHA(ssBoth));
ssBoth = sBothHash;
}
txHash = ssBoth;
s7 = null;
s8 = null;
}
catch (NoSuchAlgorithmException ea) {System.out.println("Exception thrown for incorrect algorithm: " + ea);}
catch (IOException exa) {System.out.println("Exception thrown for IO: " + exa);}
}

if(rem == 0 && txs == 0)
{

try
{
String s9 = Files.readString(p1);
String s10 = Files.readString(p2);
ssBoth = s9 + s10;

for (int p = 1; p <= 2001; p++)
{
sBothHash = toHexString(getSHA(ssBoth));
ssBoth = sBothHash;
}
txHash = ssBoth;
////System.out.println("Your first transaction hash is: " + txHash);
s9 = null;
s10 = null;
}
catch (NoSuchAlgorithmException eb) {System.out.println("Exception thrown for incorrect algorithm: " + eb);}
catch (IOException exb) {System.out.println("Exception thrown for IO: " + exb);}
sBothHash=null;
ssBoth=null;
fString=null;
fString2=null;
cL1=null;
aTxs=null;
}
}

else
{

}
}
buff1.close();
}


public void getTxStuff()throws IOException{

////System.out.println("");
////System.out.println("Here is your tx info...");
////System.out.println("");
String SAmount = Amount.getText();
////System.out.println("Send Amount = " + SAmount);
String SRWallet = RWallet.getText();
////System.out.println("Receiving Wallet = " + SRWallet);
String SGas = Gas.getText();
////System.out.println("Gas = " + SGas);

if(Files.readString(PlayerWallet).length()!=0)
{
String SSWallet = Files.readString(PlayerWallet).substring(1);

Path txp = Paths.get("localplayer.txt");
String TxPlayer =  Files.readString(txp);
String TxPlayerS = TxPlayer.substring(1);

if(wrap==1)
{
//Below prepares transaction for Discord input
//txNoHash.setText("<" + TxPlayerS + "> " + SSWallet + "&" + SAmount + "_" + "21000001" + "," + SGas + "$" + txHash + "~" + "KMC" + "%" + NewPublicKey + ";");
////Below prepares transaction for Minecraft server input
txNoHash.setText(SSWallet + "&" + SAmount + "_" + "21000001" + "," + SGas + "$" + txHash + "~" + "KMC" + "%" + NewPublicKey + ";");
}

else
{
//Below prepares transaction for Discord input
//txNoHash.setText("<" + TxPlayerS + "> " + SSWallet + "&" + SAmount + "_" + SRWallet + "," + SGas + "$" + txHash + "~" + transHash + "%" + NewPublicKey + ";");
////Below prepares transaction for Minecraft server input
txNoHash.setText(SSWallet + "&" + SAmount + "_" + SRWallet + "," + SGas + "$" + txHash + "~" + transHash + "%" + NewPublicKey + ";");
txp=null;
TxPlayer=null;
TxPlayerS=null;
}
}

else
{
System.out.println("!sync in discord or mine a block");
}
wrap=0;
txHash = null;
transHash = null;
NewPublicKey = null;
SAmount = null;
SRWallet = null;
SGas = null;
}


public void getTxStuffMin()throws IOException{

if(Files.readString(PlayerWallet).length()!=0)
{
String SSWallet = Files.readString(PlayerWallet).substring(1);

Path txp = Paths.get("localplayer.txt");
String TxPlayer =  Files.readString(txp);
String TxPlayerS = TxPlayer.substring(1);

//Below prepares transaction for Discord input
//txNoHash.setText("<" + TxPlayerS + "> " + SSWallet + "&" + "1000000000000000" + "_" + "21000001" + "," + "69" + "$" + txHash + "~" + "KMC" + "%" + NewPublicKey + ";");
////Below prepares transaction for Minecraft server input
txNoHash.setText(SSWallet + "&" + "1000000000000000" + "_" + "21000001" + "," + "69" + "$" + txHash + "~" + "KMC" + "%" + NewPublicKey + ";");
txp=null;
TxPlayer=null;
TxPlayerS=null;
}

else
{
System.out.println("!sync in discord or mine a block");
}
wrap=0;
txHash = null;
transHash = null;
NewPublicKey = null;
}


public void getTxStuffMax()throws IOException{

if(Files.readString(PlayerWallet).length()!=0)
{
String SSWallet = Files.readString(PlayerWallet).substring(1);
Path txp = Paths.get("localplayer.txt");
String TxPlayer =  Files.readString(txp);
String TxPlayerS = TxPlayer.substring(1);
//Below prepares transaction for Discord input
//txNoHash.setText("<" + TxPlayerS + "> " + SSWallet + "&" + "6700000000000000" + "_" + "21000001" + "," + "69" + "$" + txHash + "~" + "KMC" + "%" + NewPublicKey + ";");
////Below prepares transaction for Minecraft server input
txNoHash.setText(SSWallet + "&" + "6700000000000000" + "_" + "21000001" + "," + "69" + "$" + txHash + "~" + "KMC" + "%" + NewPublicKey + ";");
txp=null;
TxPlayer=null;
TxPlayerS=null;
}

else
{
System.out.println("!sync in discord or mine a block");
}
wrap=0;
txHash = null;
transHash = null;
NewPublicKey = null;

}


public void handleHashFiles() throws IOException {
    Path secretInputPath = Paths.get("secret_input.log");
    Path lastTxHashPath = Paths.get("lastTxHash.log");
    
    // Check if the newly generated hash is different from what's in secret_input.log
    boolean hashChanged = true;
    if (Files.exists(secretInputPath) && Files.size(secretInputPath) > 0) {
        String currentSecretInput = Files.readString(secretInputPath);
        if (txHash != null && txHash.equals(currentSecretInput)) {
            hashChanged = false;
        }
    }
    
    // Only update files if hash has changed
    if (hashChanged) {
        // If secret_input.log exists and has content, copy it to lastTxHash.log
        if (Files.exists(secretInputPath) && Files.size(secretInputPath) > 0) {
            String secretInputContent = Files.readString(secretInputPath);
            Files.writeString(lastTxHashPath, secretInputContent, StandardCharsets.UTF_8);
        }
        
        // Save the newly generated hash to secret_input.log (overwrite)
        if (txHash != null) {
            Files.writeString(secretInputPath, txHash, StandardCharsets.UTF_8);
        }
    }
}

public void updateHashFields() throws IOException {
    Path secretInputPath = Paths.get("secret_input.log");
    Path lastTxHashPath = Paths.get("lastTxHash.log");
    
    // Populate tx hash field from lastTxHash.log
    if (Files.exists(lastTxHashPath) && Files.size(lastTxHashPath) > 0) {
        String lastTxHashContent = Files.readString(lastTxHashPath);
        TxHashField.setText(lastTxHashContent);
    }
    
    // Populate secret input field from secret_input.log
    if (Files.exists(secretInputPath) && Files.size(secretInputPath) > 0) {
        String secretInputContent = Files.readString(secretInputPath);
        SecretInputField.setText(secretInputContent);
    }
}


public static byte[] getSHA(String input) throws NoSuchAlgorithmException, IOException{
MessageDigest md = MessageDigest.getInstance("SHA-256");
return md.digest(input.getBytes(StandardCharsets.UTF_8));}


public static String toHexString(byte[] hash){
BigInteger number = new BigInteger(1, hash);
StringBuilder hexString = new StringBuilder(number.toString(16));
while (hexString.length() < 64)
{hexString.insert(0, '0');}
return hexString.toString();}



public void getPlayersInfo2() throws IOException, FileNotFoundException{

File iFile102 = new File("ledger_KMC/player_info.log");
BufferedReader reader102 = new BufferedReader(new FileReader(iFile102));
String cL102;
String WalletSyncAt;
String WalletSync;
String BalanceSync;
String TxsSync;

while((cL102 = reader102.readLine()) != null)
{

if(cL102.equals(PNameSync3))
{
r++;
WalletSyncAt = reader102.readLine();
WalletSync = WalletSyncAt;
BalanceSync = reader102.readLine();
TxsSync = reader102.readLine();
Path p123n = Paths.get("wallet_address.log");
Path p123h = Paths.get("player_balance.log");
Path p123j = Paths.get("player_txs.log");

try
{
Files.writeString(p123n,WalletSync,StandardCharsets.UTF_8);
Files.writeString(p123h,BalanceSync,StandardCharsets.UTF_8);
Files.writeString(p123j,TxsSync,StandardCharsets.UTF_8);
Files.writeString(p123j,TxsSync,StandardCharsets.UTF_8);
}
catch (IOException ex) {System.out.print("Invalid Path");}
reader102.close();
p123n = null;
p123h = null;
p123j = null;
iFile102 =null;
cL102 = null;
WalletSyncAt= null;
WalletSync= null;
BalanceSync= null;
TxsSync= null;
}
}

if(r==0)
{
////System.out.println("Player must mine a block to obtain a wallet address and then be placed on player_info");
}
}

}