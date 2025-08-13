import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.lang.String;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import java.awt.Image;
import java.nio.file.StandardCopyOption;


public class syncPanel extends JFrame implements ActionListener {
	
private static final long serialVersionUID = -6064086166669645075L;
public static int mode;
int r = 0;
String PNameSync2;
String PNameSync3;
File tempFile12345h = new File("player_balance.log");
File tempFile12345j = new File("player_txs.log");
File tempFile12345n = new File("wallet_address.log");
private JPanel panel2;
private JLabel syncLabel,syncLabel2,syncLabel3,syncLabel4;
private JButton cancelButton2,helpButton2,readyButton2;
JMenu menu, submenu;  
JMenuItem j1, j2, j3, j4, j5, j6, j7;  


public syncPanel(){

            Image icon2 = Toolkit.getDefaultToolkit().getImage("icon3.png");
            setIconImage(icon2);

syncLabel = new JLabel("  1. Do command '!sync' in discord channel - download files");
syncLabel2 = new JLabel("  2. Files are moved to KMC directory with download.");
syncLabel3 = new JLabel("  3. When complete, click 'Ready'.");
syncLabel4 = new JLabel("  * Player must sync for wrappings *");
readyButton2 = new JButton("Ready");
cancelButton2 = new JButton("Cancel");
helpButton2 = new JButton("Help");
readyButton2.addActionListener(this);
cancelButton2.addActionListener(this);
helpButton2.addActionListener(this);
panel2 = new JPanel(new GridLayout(6, 2));
panel2.add(syncLabel);
panel2.add(syncLabel2);
panel2.add(syncLabel3);
panel2.add(syncLabel4);
panel2.add(readyButton2);
panel2.add(cancelButton2);
////panel2.add(helpButton2);
add(panel2, BorderLayout.CENTER);
setTitle("KMCoin Sync");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(375, 200);
setVisible(true);
}


public void actionPerformed(ActionEvent e2){

Path file33x = Paths.get(System.getProperty("user.home")+"/Downloads/player_info.log");
Path file33z = Paths.get(System.getProperty("user.home")+"/Downloads/player_info.txt");
Path file33zy = Paths.get(System.getProperty("user.home")+"/Downloads/ledger_current.log");
Path file33xy = Paths.get(System.getProperty("user.home")+"/Downloads/ledger_current.txt");

File PItxt = new File(System.getProperty("user.home")+"/Downloads/player_info.txt");
File PIlog = new File(System.getProperty("user.home")+"/Downloads/player_info.log");
File LCtxt = new File(System.getProperty("user.home")+"/Downloads/ledger_current.txt");
File LClog = new File(System.getProperty("user.home")+"/Downloads/ledger_current.log");

if (e2.getSource() == readyButton2)
{

try
{

if(PItxt.exists() && PItxt.length() != 0)
{
convertFile();
}

if(PIlog.exists() && PIlog.length() != 0)
{
convertFileA();
}

if(LClog.exists() && LClog.length() != 0)
{
copyLedgerCurrentLog();
}


if(LCtxt.exists() && LCtxt.length() != 0)
{
copyLedgerCurrentTxt();
}
//System.out.println("Downloaded files copied successfully!!!");
}
catch (Exception e) {e.printStackTrace();}

if(PIlog.exists() && PIlog.length() != 0)
{
try
{
Files.delete(file33x);
//System.out.println("Downloaded files deleted successfully!!!");
}
catch (Exception ez) {}
}

if(PItxt.exists() && PItxt.length() != 0)
{
try
{
Files.delete(file33z);
}
catch (Exception ez1) {}
}

if(LClog.exists() && LClog.length() != 0)
{
try
{
Files.delete(file33zy);
}
catch (Exception ez2) {}
}

if(LCtxt.exists() && LCtxt.length() != 0)
{
try
{
Files.delete(file33xy);
}
catch (Exception ez3) {}
}

mode=4;

System.out.println(mode);

//new PrintWriter("syncMe.log").close();

try(FileWriter writer2ab1 = new FileWriter("Program_Files/startloop.log"))
{
char character2ab1 = 'S';
writer2ab1.write(character2ab1);
}
catch (IOException e69ab1){System.out.println("An error occurred: " + e69ab1.getMessage());}


file33x = null;
file33z = null;
file33zy = null;
file33xy = null;

PItxt = null;
PIlog = null;
LCtxt = null;
LClog = null;


dispose();
}

if (e2.getSource() == cancelButton2)
{
dispose();
System.exit(0);
}
}


    public static void convertFile() {

        try (BufferedReader readerfml1 = new BufferedReader(new FileReader(System.getProperty("user.home")+"/Downloads/player_info.txt"));
             BufferedWriter writerfml1 = new BufferedWriter(new FileWriter("ledger_KMC/player_info.log"))) {

            String line;
            while ((line = readerfml1.readLine()) != null) {
                //writer.write(line);
                writerfml1.write(line+"\n"); // Use system-dependent line separator, which will be LF on Unix
            }
readerfml1.close();
writerfml1.close();
line=null;
        } catch (IOException efml1) {
            //efml1.printStackTrace();
        }
    }


public static void convertFileA() {

        try (BufferedReader readerfml2 = new BufferedReader(new FileReader(System.getProperty("user.home")+"/Downloads/player_info.log"));
             BufferedWriter writerfml2 = new BufferedWriter(new FileWriter("ledger_KMC/player_info.log"))) {

            String line2;
            while ((line2 = readerfml2.readLine()) != null) {
                //writer.write(line2);
                writerfml2.write(line2+"\n"); // Use system-dependent line separator, which will be LF on Unix
            }
readerfml2.close();
writerfml2.close();
line2=null;
        } catch (IOException efml1) {
            efml1.printStackTrace();
        }
    }




public static void copyLedgerCurrentLog() {

//String LCurrent = 
Path source = Paths.get(System.getProperty("user.home")+"/Downloads/ledger_current.log");
Path destination = Paths.get("ledger_KMC/ledger_current.txt");

try {
// Copy the file, replacing the destination if it exists and copying attributes
Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES);
//System.out.println("File copied successfully!");
source=null;
destination=null;
}
catch (IOException et) {System.err.println("Error copying file: " + et.getMessage());}
    }


public static void copyLedgerCurrentTxt() {

//String LCurrent = 
Path source2 = Paths.get(System.getProperty("user.home")+"/Downloads/ledger_current.txt");
Path destination2 = Paths.get("ledger_KMC/ledger_current.txt");

try {
// Copy the file, replacing the destination if it exists and copying attributes
Files.copy(source2, destination2, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES);
//System.out.println("File copied successfully!");
source2=null;
destination2=null;
}
catch (IOException e) {System.err.println("Error copying file: " + e.getMessage());}
    }

}