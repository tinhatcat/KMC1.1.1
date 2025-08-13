import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.io.FileWriter;


public class discordM {


public discordM(){

try
{
dM();
}
catch (Exception kitty1){}
}


public void dM() throws IOException{

String filepathD = "discordM.txt";
String blockD = "Program_Files/lastblockledger.log";
String playerD = "Program_Files/lastplayerledger.log";
String playerhashD = "Program_Files/lastblockhash.log";
String txD = "discordC.txt";
String chashD = "ledger_KMC/consensus_HASH.log";

try(FileWriter fw = new FileWriter(filepathD, true))
{
String blockDS = Files.readString(Paths.get(blockD));
String playerDS = Files.readString(Paths.get(playerD));
String playerhashDS = Files.readString(Paths.get(playerhashD));
String txDS = Files.readString(Paths.get(txD));
String chashDS = Files.readString(Paths.get(chashD));
//fw.write(blockDS+playerDS+playerhashDS+txDS+" ="+chashDS+" ");
fw.write(blockDS+playerDS+playerhashDS+txDS+" ="+chashDS);

blockDS=null;
playerDS=null;
playerhashDS=null;
txDS=null;
chashDS=null;
fw.close();
}
filepathD=null;
blockD=null;
playerD=null;
playerhashD=null;
txD=null;
chashD=null;
}
}