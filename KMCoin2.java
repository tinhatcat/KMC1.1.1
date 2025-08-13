import java.io.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.lang.String;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class KMCoin2 extends JFrame implements ActionListener {
	
private static final long serialVersionUID = -6064086166669645075L;
public static int mode;
int r = 0;
String PNameSync2;
String PNameSync3;
File tempFile12345h = new File("player_balance.log");
File tempFile12345j = new File("player_txs.log");
File tempFile12345n = new File("wallet_address.log");
private JPanel panel;
private JLabel userLabel, passwordLabel,label;
private JTextField usernameField;
private JPasswordField passwordField;
private JButton loginButtonMining, loginButtonSyncing, cancelButton,Help;
JMenu menu, submenu;  
JMenuItem i1, i2, i3, i4, i5, i6, i7;  


public KMCoin2(){

Image icon3 = Toolkit.getDefaultToolkit().getImage("icon3.png");
setIconImage(icon3);
userLabel = new JLabel("Player Name:");
passwordLabel = new JLabel("Password:");
//messageLabel = new JLabel();
usernameField = new JTextField(15);
passwordField = new JPasswordField(15);
loginButtonMining = new JButton("Mining Only");
loginButtonSyncing = new JButton("Sync with Chain");
cancelButton = new JButton("Cancel");
Help = new JButton("Help");
loginButtonMining.addActionListener(this);
loginButtonSyncing.addActionListener(this);
cancelButton.addActionListener(this);
Help.addActionListener(this);
panel = new JPanel(new GridLayout(4, 2));
panel.add(userLabel);
panel.add(usernameField);
panel.add(passwordLabel);
panel.add(passwordField);
panel.add(loginButtonMining);
panel.add(loginButtonSyncing);
panel.add(cancelButton);
panel.add(Help);
add(panel, BorderLayout.CENTER);
setTitle("KMCoin Login");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(350, 200);
setVisible(true);
}


public void actionPerformed(ActionEvent e){

mode=2;

String username = usernameField.getText();
String password = new String(passwordField.getPassword());  
     
if (e.getSource() == loginButtonSyncing)
{

mode=3;

try
{

new syncPanel();

}
catch (Exception syncMePlz){}

try(FileWriter writer = new FileWriter("Program_Files/mode.log"))
{
char character = 'S';
writer.write(character);
}
catch (IOException e69){System.out.println("An error occurred: " + e69.getMessage());}

////new pythonCaller();

try
{
     File file = new File("privatekey.txt");
     File file2 = new File("latestcopy.log");
     File file3 = new File("localplayer.txt");
     File file4 = new File("Program_Files/latestchat.log");
     File file6 = new File("Program_Files/latestblocks.log");
     File file7 = new File("Program_Files/latestplayers.log");
     File file8 = new File("Program_Files/lastblock.log");
     File file9 = new File("Program_Files/lastblockledger.log");
     File file10 = new File("Program_Files/ledger_final.log");
     File file11 = new File("Program_Files/lastplayer.log");
     File file12 = new File("Program_Files/lastplayerledger.log");
     File file13 = new File("Program_Files/lastblockhash.log");
     File file14 = new File("Program_Files/otherplayerhash.log");
     File file15 = new File("Program_Files/otherplayerhash2.log");
     File file16 = new File("Program_Files/otherplayerhash3.log");
     File file17 = new File("Program_Files/latestcopy2.log");
     File file18 = new File("Program_Files/latestcopy3.log");
     File file19 = new File("Program_Files/lastledgerhash.log");
     File file20 = new File("Program_Files/ledger_formatted.log");
     File file21 = new File("Program_Files/hash.log");
     File file22 = new File("Program_Files/hash2.log");
     File file23 = new File("wallet_address.log");
     File file31 = new File("Program_Files/mode.log");
     File file32 = new File("ledger_KMC/ledgerhashes.log");
     //File file33 = new File("ledger_KMC/player_info.log");
     File file34 = new File("Program_Files/ledgertemp.log");
     File file35 = new File("Program_Files/ledgertempformatted.log");
     File file36 = new File("ledger_KMC/player_info_temp.log");
     File file37 = new File("Program_Files/ledgertempformattedNotx.log");
     File file38 = new File("Program_Files/ledgertempnotx.log");
     File file39 = new File("Program_Files/ledgertx_total.log");
     File file40 = new File("player_balance.log");
     File file41 = new File("player_txs.log");
     File file42 = new File("player_blocks_mined.log");
     File file43 = new File("Program_Files/ledgertx.log");
     File file44 = new File("Program_Files/latestTxs.log");
     File file45 = new File("Program_Files/latestTxs2.log");
     File file46 = new File("publickey.log");
     File file47 = new File("first_block_mined.log");
     File file48 = new File("Program_Files/latestTxs3.log");
     File file49 = new File("Program_Files/latestTxs4.log");
     File file50 = new File("Program_Files/latestTxs5.log");
     File file51 = new File("ledger_KMC/ledger_current_HASH.log");
     File file52 = new File("ledger_KMC/player_info_HASH.log");
     File file53 = new File("ledger_KMC/player_info_unformatted.log");
     File file54 = new File("ledger_KMC/ledgerhashes_HASH.log");
     File file55 = new File("ledger_KMC/consensus_HASH.log");
     File file56 = new File("Program_Files/txPanel.log");
     File file57 = new File("ledger_KMC/wrapped.log");
     File file58 = new File("discordC.txt");
     File file59 = new File("Program_Files/readySend.txt");
     File file60 = new File("discordM.txt");
     File file61 = new File("Program_Files/synced.txt");
     File file62 = new File("ledger_KMC/ledger_currentCOPY.txt");
     File file63 = new File("ledger_KMC/player_infoCOPY.log");
     File file64 = new File("Program_Files/latestTxs4COPY.log");
     File file65 = new File("Program_Files/resync.log");
     File file66 = new File("Program_Files/syncing.txt");

file.createNewFile();
file2.createNewFile();
file3.createNewFile();
file4.createNewFile();
file6.createNewFile();
file7.createNewFile();
file8.createNewFile();
file9.createNewFile();
file10.createNewFile();
file11.createNewFile();
file12.createNewFile();
file13.createNewFile();
file14.createNewFile();
file15.createNewFile();
file16.createNewFile();
file17.createNewFile();
file18.createNewFile();
file19.createNewFile();
file20.createNewFile();
file21.createNewFile();
file22.createNewFile();
file23.createNewFile();
file31.createNewFile();
file32.createNewFile();
//file33.createNewFile();
file34.createNewFile();
file35.createNewFile();
file36.createNewFile();
file37.createNewFile();
file38.createNewFile();
file39.createNewFile();
file40.createNewFile();
file41.createNewFile();
file42.createNewFile();
file43.createNewFile();
file44.createNewFile();
file45.createNewFile();
file46.createNewFile();
file47.createNewFile();
file48.createNewFile();
file49.createNewFile();
file50.createNewFile();
file51.createNewFile();
file52.createNewFile();
file53.createNewFile();
file54.createNewFile();
file55.createNewFile();
file56.createNewFile();
file57.createNewFile();
file58.createNewFile();
file59.createNewFile();
file60.createNewFile();
file61.createNewFile();
file62.createNewFile();
file63.createNewFile();
file64.createNewFile();
file65.createNewFile();
file66.createNewFile();
}
catch (IOException g) {System.out.println("An error occurred: " + g.getMessage());}
Path path
= Paths.get("privatekey.txt");
Path path2
= Paths.get("localplayer.txt");

try
{
Files.writeString(path, password,StandardCharsets.UTF_8);
Files.writeString(path2," "+username,StandardCharsets.UTF_8);
}
catch (IOException ex) {System.out.print("Invalid Path");}
new printHash();
path=null;
path2=null;

try
{
dispose();
new PrintWriter("Program_Files/lastplayerledger.log").close();
new PrintWriter("Program_Files/lastblock.log").close();
new PrintWriter("Program_Files/otherplayerhash.log").close();
new PrintWriter("Program_Files/latestplayers.log").close();
new PrintWriter("Program_Files/lastplayer.log").close();
}
catch (IOException exex) {System.out.print("Invalid stuff");}

try(FileWriter writer2ab = new FileWriter("Program_Files/startloop2.log"))
{
char character2ab = 'S';
writer2ab.write(character2ab);
}
catch (IOException e69ab){System.out.println("An error occurred: " + e69ab.getMessage());}

Path PNameSync = Paths.get("localplayer.txt");

try
{
PNameSync2 = Files.readString(PNameSync);
PNameSync3 = PNameSync2.substring(1);
////System.out.println("You claim to be "+ PNameSync3 + ". Welcome to TheKittyMine!");
PNameSync2 = null;
}
catch (IOException ioe2) {System.out.println("Exception thrown for IO: " + ioe2);}

try
{
getPlayersInfo();
}
catch(IOException ioexc1){}

try(FileWriter writer2abc = new FileWriter("Program_Files/txPanel.log"))
{
char character2abc = 'x';
writer2abc.write(character2abc);
}
catch (IOException e69abc){System.out.println("An error occurred: " + e69abc.getMessage());}


}

if (e.getSource() == loginButtonMining)
{
////System.out.print("");
////System.out.print("Only mining, set!");

mode=6;

new miningPanel();

try(FileWriter writer2ab2 = new FileWriter("Program_Files/startloop.log"))
{
char character2ab2 = 'S';
writer2ab2.write(character2ab2);
}
catch (IOException e69ab2){System.out.println("An error occurred: " + e69ab2.getMessage());}

try
{
Path path = Paths.get("privatekey.txt");
Path path2 = Paths.get("localplayer.txt");
Files.writeString(path, password,StandardCharsets.UTF_8);
Files.writeString(path2," "+username,StandardCharsets.UTF_8);
path = null;
path2 = null;
}
catch (IOException ex) {System.out.print("Invalid Path");}

new printHash();
dispose();
}

else 
if (e.getSource() == cancelButton)
{
System.exit(0);
dispose();
}

if (e.getSource() == Help)
{

File file58 = new File("Help.txt");

if (file58.exists())
{

try
{
Desktop.getDesktop().open(file58);
}
catch (IOException e58){e58.printStackTrace();}
}

else
{

}

}
}


public void getPlayersInfo() throws IOException, FileNotFoundException{

r=0;

Path p123n = Paths.get("wallet_address.log");
Path p123h = Paths.get("player_balance.log");
Path p123j = Paths.get("player_txs.log");

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


try
{
Files.writeString(p123n,WalletSync,StandardCharsets.UTF_8);
Files.writeString(p123h,BalanceSync,StandardCharsets.UTF_8);
Files.writeString(p123j,TxsSync,StandardCharsets.UTF_8);
}
catch (IOException ex) {System.out.print("Invalid Path");}
}
reader102.close();
}
p123n = null;
p123h = null;
p123j = null;
iFile102 =null;
cL102 = null;
WalletSyncAt= null;
WalletSync= null;
BalanceSync= null;
TxsSync= null;

if(r==0)
{
////System.out.println("Player must mine a block to obtain a wallet address and then be placed on player_info");
}
}
}