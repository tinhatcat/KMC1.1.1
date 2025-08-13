import java.io.*;
 

public class helpMe{


public helpMe() throws FileNotFoundException,IOException{

try
{
hMe();
}
catch (Exception e3121){}
}


public void hMe() throws FileNotFoundException,IOException{

new PrintWriter("Help.txt").close();
String fP3111 = "Help.txt";

try(FileWriter bw58 = new FileWriter(fP3111, true))
{

bw58.write("If this is your first time running KMCoin please read.");
bw58.write("\n");
bw58.write("\n");
bw58.write("\n");
bw58.write("To be minted on the ledger and player_info page a");
bw58.write("\n");
bw58.write("new player must run KMCoin while mining any block.");
bw58.write("\n");
bw58.write("This block and the private key created by the player's");
bw58.write("\n");
bw58.write("password may never be changed once this block is mined.");
bw58.write("\n");
bw58.write("To check if a player has been added to the player_info");
bw58.write("\n");
bw58.write("page, see 'Sync with Chain' below. Once a player is added");
bw58.write("\n");
bw58.write("to the this page, they never have to run KMCoin again to");
bw58.write("\n");
bw58.write("receive block rewards.");
bw58.write("\n");
bw58.write("\n");
bw58.write("\n");
bw58.write("Mining Only");
bw58.write("\n");
bw58.write("\n");
bw58.write("Use Player Name as seen in the Minecraft server.");
bw58.write("\n");
bw58.write("Leave Minecraft open as full screen or windowed.");
bw58.write("\n");
bw58.write("This mode will not output any block information.");
bw58.write("\n");
bw58.write("It will write the player's hash to ledger_current");
bw58.write("\n");
bw58.write("and update their balance to players running KMCoin.");
bw58.write("\n");
bw58.write("\n");
bw58.write("\n");
bw58.write("Sync with Chain");
bw58.write("\n");
bw58.write("\n");
bw58.write("To sync with chain do command !sync in the kmcbot-chat");
bw58.write("\n");
bw58.write("located in the discord channel at discord.gg/thekittymine");
bw58.write("\n");
bw58.write("Download the files and click 'Ready'.");
bw58.write("\n");

}
catch (IOException eoi311){System.err.println("An error occurred: " + eoi311.getMessage());}
fP3111=null;
}
}