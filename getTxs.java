import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths; 
import java.util.stream.Stream;
import java.lang.String;
import java.nio.file.StandardOpenOption;


public class getTxs{


////File file11 = new File("ledger_KMC/player_info.log");
File file12 = new File("wallet_address.log");
File file13 = new File("player_balance.log");
File file14 = new File("player_txs.log");
File file15 = new File("publickey.log");
File file16 = new File("localplayer.txt");
Path PlayerBalance1 = Paths.get("player_balance.log");
Path PlayerBlocksMined1 = Paths.get("player_blocks_mined.log");
Path PlayerTxSent1 = Paths.get("player_txs.log");
Path PlayerWallet1 = Paths.get("wallet_address.log");
Path LocalPlayer1 = Paths.get("localplayer.txt");


public getTxs() throws FileNotFoundException,IOException{

try
{
gT();
}
catch (IOException e78){e78.printStackTrace();}
}


public void gT() throws FileNotFoundException,IOException{	 

//Path path11 = Paths.get("latestcopy.log");
Path path11 = Paths.get("outputTx.txt");
String outputFile11 = "Program_Files/latestTxs.log";
String st1 = "$";
String st2 = "~";
String st3 = "%";
String st4 = ";";
String st5 = ",";
String st6 = "_";
String st7 = "&";
   		
//try (Stream<String> lines = Files.lines(path11, StandardCharsets.UTF_8).map(String::trim))
try (Stream<String> lines = Files.lines(path11).map(String::trim))

{
lines.filter(line->Character.isWhitespace(line.charAt(32))
&Character.isUpperCase(line.charAt(35))
&Character.isUpperCase(line.charAt(36))
&Character.isUpperCase(line.charAt(37))
&line.contains(st1)
&line.contains(st2)
&line.contains(st3)
&line.contains(st4)
&line.contains(st5)
&line.contains(st6)
&line.contains(st7)).forEach(line -> 
{

try
{
Files.write(Paths.get(outputFile11),(line + System.lineSeparator()).getBytes(),StandardOpenOption.CREATE, StandardOpenOption.APPEND);
} 
catch (IOException e) {e.printStackTrace();}


catch (StringIndexOutOfBoundsException e2) {}
});


}
catch (StringIndexOutOfBoundsException e2) {}
path11 = null;
}
}