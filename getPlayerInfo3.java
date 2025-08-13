import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.lang.String;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;


public class getPlayerInfo3{

public static String filePathY = "ledger_KMC/player_info.txt";

int r = 0;
String PNameSync2;
String PNameSync3;
File tempFile12345h = new File("player_balance.log");
File tempFile12345j = new File("player_txs.log");
File tempFile12345n = new File("wallet_address.log");

String windowsFilePath = "ledger_KMC/player_info.txt";
String unixFilePath = "ledger_KMC/player_info.log";

public getPlayerInfo3(){

r=0;

try
{

new PrintWriter("player_balance.log").close();
new PrintWriter("player_txs.log").close();
new PrintWriter("wallet_address.log").close();

}
catch(FileNotFoundException fnfe){}

try
{
//System.out.println(" getPlayerInfo3");
gPI2();
gPI();
}
catch(Exception mara){}

}


    public static void convertFile(String windowsFilePath, String unixFilePath) {
        try (BufferedReader readerfml = new BufferedReader(new FileReader(windowsFilePath));
             BufferedWriter writerfml = new BufferedWriter(new FileWriter(unixFilePath))) {

            String line;
            while ((line = readerfml.readLine()) != null) {
                //writer.write(line);
                writerfml.write(line+"\n");
            }
readerfml.close();
writerfml.close();
        } catch (IOException efml) {
            efml.printStackTrace();
        }
    }


public void gPI2() throws IOException, FileNotFoundException{

//System.out.println("gPI2()");

while(true)
{
////File file33aa = new File("ledger_KMC/player_info.log");
File file33a = new File(filePathY);
Path file33ab = Paths.get(filePathY);
Path file33 = Paths.get("ledger_KMC/player_info.log");

if(file33a.exists())
{
System.out.println("player_info txt is in directory...");


        try {

            Files.delete(file33);

            System.out.println("OG File deleted successfully!");
        } catch (IOException e23) {
            e23.printStackTrace();}


        try {



convertFile(windowsFilePath, unixFilePath);



            System.out.println("File copied successfully!");
        } catch (Exception e) {
            e.printStackTrace();}



        try {

            Files.delete(file33ab);

            System.out.println("File deleted successfully!");
file33ab = null;
        } catch (IOException e33ab) {
            e33ab.printStackTrace();}



}
else
{
file33ab = null;
file33a = null;
file33 = null;
}
file33ab = null;
file33a = null;
file33 = null;
break;
}
}



public void gPI() throws IOException, FileNotFoundException{

//System.out.println("gPI()");

Path p123n = Paths.get("wallet_address.log");
Path p123h = Paths.get("player_balance.log");
Path p123j = Paths.get("player_txs.log");
Path p123k = Paths.get("localplayer.txt");


File iFile102 = new File("ledger_KMC/player_info.log");
BufferedReader reader102 = new BufferedReader(new FileReader(iFile102));
String cL102;
String WalletSyncAt;
String WalletSync;
String BalanceSync;
String TxsSync;
String lPLayer;
String lPLayer2;

lPLayer = Files.readString(p123k);
lPLayer2 = lPLayer.substring(1);

//System.out.println("lPLayer" + lPLayer);

while((cL102 = reader102.readLine()) != null)
{


//System.out.println("cL102" + cL102);

if(cL102.equals(lPLayer2))
{
r++;
WalletSyncAt = reader102.readLine();
WalletSync = WalletSyncAt;
BalanceSync = reader102.readLine();
TxsSync = reader102.readLine();

//System.out.println("BalanceSync if" + BalanceSync);

try
{
//Files.writeString(p123n,WalletSync,StandardCharsets.UTF_8);
Files.writeString(p123n,WalletSync);
//Files.writeString(p123h,BalanceSync,StandardCharsets.UTF_8);
Files.writeString(p123h,BalanceSync);
//Files.writeString(p123j,TxsSync,StandardCharsets.UTF_8);
Files.writeString(p123j,TxsSync);
//System.out.println("Written?");

}
catch (IOException ex) {System.out.print("Invalid Path");}
}
}
reader102.close();
p123n = null;
p123h = null;
p123j = null;
p123k = null;
iFile102 =null;
cL102 = null;
WalletSyncAt= null;
WalletSync= null;
BalanceSync= null;
TxsSync= null;
lPLayer = null;
lPLayer2 = null;

if(r==0)
{
////System.out.println("Player must mine a block to obtain a wallet address and then be placed on player_info");
}
}
}