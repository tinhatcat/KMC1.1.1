import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths; 
import java.util.stream.Stream;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import java.nio.file.StandardOpenOption;
import java.security.NoSuchAlgorithmException;
import java.math.BigInteger;
import java.io.IOException;
import java.lang.StringBuilder;
import java.security.MessageDigest;
import java.awt.event.KeyEvent;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Clipboard;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class whoIs{

String strBothHash;

String userDirectory = System.getProperty("user.home");
int nuke;


public whoIs() throws FileNotFoundException,IOException{

try
{
wI();
}
catch (IOException e78){e78.printStackTrace();}}


synchronized public void wI() throws FileNotFoundException,IOException{

Path file1 = Paths.get("localplayer.txt");
Path file2 = Paths.get("Program_Files/lastplayerledger.log");

try
{
String str69 = Files.readString(file2);
long mismatchIndex = Files.mismatch(file1, file2);

if (mismatchIndex == -1L)
{
////System.out.println("   And you (" + str69 + " ) hashed the block :D");
////System.out.println("");

try
{
getPHash();
cleanBlock();
}
catch (Exception e79){}
} 

int p = str69.length();


if (mismatchIndex != -1L&&p<17)
{

////System.out.println("");
////System.out.println("   But you did not hash the block...");
////System.out.println("");
////System.out.println("      " + str69 + "'s" + " new block hash is...");
////System.out.println("");
//Thread.sleep(3000);
wait(7000);

try
{
catchNewLines();
cleanChat();
cleanChat2();
cleanChat3();
cleanChat4();
cleanHash();
}
catch (Exception e79){}
}
file1 = null;file2 = null;str69 = null;
} 
catch (Exception e) {System.err.println("Error comparing files: " + e.getMessage());}
new PrintWriter("Program_Files/lastplayer.log").close();
}


public void getPHash(){

////System.out.println("Getting your block hash...");
////System.out.println("");
Path path = Paths.get("Program_Files/lastblockledger.log");
Path path2 = Paths.get("Program_Files/lastblockhash.log");
Path path3 = Paths.get("privatekey.txt");
////Path path4 = Paths.get("Program_Files/ledger_final.log");

try
{
String str3 = Files.readString(path);
String str4 = Files.readString(path3);
String strBoth = str3 + str4;
String strBoth2;

for (int j = 1; j <= 2002; j++)
{
strBoth2 = toHexString(getSHA(strBoth));
strBoth = strBoth2;

if(j == 2002)
{
//Files.writeString(path2, strBoth,StandardCharsets.UTF_8);
Files.writeString(path2, strBoth);

////Files.writeString(path4, " " + strBoth,StandardCharsets.UTF_8, StandardOpenOption.APPEND);
}
}
str3 = null;
str4 = null;
path = null;
path2 = null;
path3 = null;
////path4 = null;
}
catch (NoSuchAlgorithmException e) {System.out.println("Exception thrown for incorrect algorithm: " + e);}
catch (IOException ex) {System.out.println("Exception thrown for IO: " + ex);}
}


public static String toHexString(byte[] hash){
BigInteger number = new BigInteger(1, hash);
StringBuilder hexString = new StringBuilder(number.toString(16));
while (hexString.length() < 64)
{hexString.insert(0, '0');}
return hexString.toString();}


public static byte[] getSHA(String input) throws NoSuchAlgorithmException, IOException{
MessageDigest md = MessageDigest.getInstance("SHA-256");
return md.digest(input.getBytes(StandardCharsets.UTF_8));}


public void cleanBlock() throws InterruptedException,AWTException,FileNotFoundException,IOException{

Path path420 = Paths.get("Program_Files/lastblockhash.log");
String str420 = Files.readString(path420);
Pattern pattern = Pattern.compile("[a-zA-Z0-9 \t]*");
Matcher matcher = pattern.matcher(str420);

if (matcher.matches())
{
////System.out.println("Hash is valid :)");
////System.out.println("the hash = " + str420);
newBlock();

wait(5500);

catchNewLines();
cleanChat();
cleanChat2();
cleanChat3();
cleanChat4();
cleanHash();

} 

else
{
////System.out.println("Dont play b");
cleanHash2();
}
str420 = null;
path420 = null;
}


synchronized public void newBlock()throws InterruptedException, AWTException, IOException{
//Thread.sleep(100);
wait(100);
String myString2 = new String(Files.readAllBytes(Paths.get("Program_Files/lastblockhash.log")));
////System.out.println("the hash that should print... = "+myString2);
//Thread.sleep(200);
wait(200);
StringSelection stringSelection = new StringSelection(myString2);
//Thread.sleep(200);
wait(200);
Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
//Thread.sleep(200);
wait(200);
clipboard.setContents(stringSelection, null);
//Thread.sleep(200);
wait(200);
Robot r1 = new Robot();
r1.keyPress(KeyEvent.VK_T);
//Thread.sleep(10);
wait(10);
r1.keyRelease(KeyEvent.VK_T);
//Thread.sleep(300);
wait(300);
r1.keyPress(KeyEvent.VK_CONTROL);
//Thread.sleep(10);
wait(10);
r1.keyPress(KeyEvent.VK_V);
//Thread.sleep(10);
wait(10);
r1.keyRelease(KeyEvent.VK_V);
//Thread.sleep(10);
wait(10);
r1.keyRelease(KeyEvent.VK_CONTROL);
//Thread.sleep(300);
wait(300);
r1.keyPress(KeyEvent.VK_ENTER);
//Thread.sleep(10);
wait(10);
r1.keyRelease(KeyEvent.VK_ENTER);
//Thread.sleep(200);
wait(200);
clipboard = null;
stringSelection = null;
myString2 = null;
r1 = null;
}


public void cleanChatA() throws IOException{

//Reader reader = new InputStreamReader(new FileInputStream("../latest.log"),"UTF-8");
////Reader reader = new InputStreamReader(new FileInputStream("../latest.log"));
Reader reader = new InputStreamReader(new FileInputStream(userDirectory+"/AppData/Roaming/.minecraft/logs/latest.log"));


BufferedReader fin = new BufferedReader (reader);
//Writer writer = new OutputStreamWriter(new FileOutputStream("Program_Files/latestcopy3.log"), "UTF-8");
Writer writer = new OutputStreamWriter(new FileOutputStream("Program_Files/latestcopy3.log"));

BufferedWriter fout = new BufferedWriter(writer);

try
{
String sa;
String s;

while((sa=fin.readLine())!=null)
{
s = sa.trim();
fout.write(s.replaceAll("\\ufffd",""));fout.newLine();}
fin.close();
fout.close();}
catch (IOException e889) {};
}


public void catchNewLines() throws IOException{

new PrintWriter("Program_Files/latestcopy3.log").close();
File f279 = new File("Program_Files/latestcopy3.log");
//Reader reader8 = new InputStreamReader(new FileInputStream("../latest.log"),"UTF-8");
////Reader reader8 = new InputStreamReader(new FileInputStream("../latest.log"));
Reader reader8 = new InputStreamReader(new FileInputStream(userDirectory+"/AppData/Roaming/.minecraft/logs/latest.log"));


BufferedReader fin8 = new BufferedReader (reader8);
FileWriter ftw8 = new FileWriter(f279,true);
BufferedWriter fout8 = new BufferedWriter(ftw8);

try
{
String sa8;
String s8;

while((sa8=fin8.readLine())!=null)
{
s8 = sa8.trim();
fout8.write(s8.replaceAll("\\ufffd",""));
fout8.newLine();
}

if((s8=fin8.readLine())==null)
{
fin8.close();
fout8.close();
reader8.close();
ftw8.close();
s8=null;
sa8=null;
}

else
{
fout8.write(s8.replaceAll("\\ufffd",""));
fout8.newLine();

while((s8=fin8.readLine())!=null)
{
fout8.write(s8.replaceAll("\\ufffd",""));
fout8.newLine();
}
fin8.close();
fout8.close();
reader8.close();
ftw8.close();
s8=null;
sa8=null;
}
}
catch (IOException e890) {};
}


public void cleanChat() throws FileNotFoundException,IOException{

File inputFile33 = new File("Program_Files/latestcopy3.log");
new PrintWriter("Program_Files/otherplayerhash.log").close();
File tempFile33 = new File("Program_Files/otherplayerhash.log");
BufferedReader reader33 = new BufferedReader(new FileReader(inputFile33));
BufferedWriter writer33 = new BufferedWriter(new FileWriter(tempFile33, true));
String currentLine33;

while((currentLine33 = reader33.readLine()) != null) 
{
String trimmedLine33 = currentLine33.trim();
int count = trimmedLine33.length() - trimmedLine33.replace("<", "").length();

if(count > 1) continue;

else if(count == 0) continue;

writer33.write(currentLine33 + System.getProperty("line.separator"));
currentLine33 = null;trimmedLine33 = null;}
writer33.close(); 
reader33.close(); 
inputFile33 = null;
tempFile33 = null;
}


public void cleanChat2() throws FileNotFoundException,IOException{

new PrintWriter("Program_Files/otherplayerhash2.log").close();
Path path12 = Paths.get("Program_Files/otherplayerhash.log");
String outputFile2 = "Program_Files/otherplayerhash2.log";

try 
//(Stream<String> lines = Files.lines(path12, StandardCharsets.UTF_8).map(String->String.substring(39)))
(Stream<String> lines = Files.lines(path12).map(String->String.substring(39)))

{
lines.filter(line->Character.isWhitespace(line.charAt(0))).forEach(line -> 
{

try
{
Files.write(Paths.get(outputFile2),(line + System.getProperty("line.separator")).getBytes(),StandardOpenOption.CREATE, StandardOpenOption.APPEND);} 
catch (IOException e) {e.printStackTrace();}
catch (StringIndexOutOfBoundsException e2) {}
});
}
catch (StringIndexOutOfBoundsException e2) {}
path12 = null;
}


public void cleanChat3() throws FileNotFoundException,IOException{

new PrintWriter("Program_Files/otherplayerhash3.log").close();
Path path12 = Paths.get("Program_Files/otherplayerhash2.log");
Path path13 = Paths.get("Program_Files/otherplayerhash3.log");

try
{
String str12 = Files.readString(path12);
//Files.writeString(path13, str12.replaceAll("<","").replaceAll(">",""),StandardCharsets.UTF_8);
Files.writeString(path13, str12.replaceAll("<","").replaceAll(">",""));

str12 = null;
path12 = null;
path13 = null;
}
catch (FileNotFoundException e) {System.out.println("FileNotFoundException" + e);}
catch (IOException ex) {System.out.println("Exception thrown for IO: " + ex);}
}


public void cleanChat4() throws FileNotFoundException,IOException{

new PrintWriter("Program_Files/lastblockhash.log").close();
Path path16 = Paths.get("Program_Files/lastplayerledger.log");
String str16 = Files.readString(path16);
File inputFile33 = new File("Program_Files/otherplayerhash3.log");
File tempFile33 = new File("Program_Files/lastblockhash.log");
BufferedReader reader33 = new BufferedReader(new FileReader(inputFile33));
BufferedWriter writer33 = new BufferedWriter(new FileWriter(tempFile33, true));
String currentLine33;

currentLine33 = reader33.readLine();

if(currentLine33.startsWith(str16)==true)

writer33.write(currentLine33.replaceAll(str16, ""));
currentLine33 = null;
writer33.close(); 
reader33.close(); 
inputFile33 = null;
tempFile33 = null;
str16 = null;
path16 = null;
}


public void cleanHash() throws FileNotFoundException,IOException{

Path path420 = Paths.get("Program_Files/lastblockhash.log");
String str420 = Files.readString(path420);
//String Spaced3 = " ";
////System.out.println(str420);
str420 = str420.replace("t", "").replace("T", "");
Files.writeString(path420, str420);
Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");
Matcher matcher = pattern.matcher(str420.substring(1));
//nuke=0;
if (matcher.matches()&&str420.length()<66) 
{
System.out.println("hash length less than 65");
cleanChat5();
}
else 
{
System.out.println("Hash length too long for ledger");
//cleanHash2();
new PrintWriter("Program_Files/lastblockhash.log").close();
}
str420 = null;
}


public void cleanHash2() throws FileNotFoundException,IOException{

String filePath2 = "Program_Files/ledger_final.log";
Path path19 = Paths.get("Program_Files/lastblockhash.log");
String str19 = Files.readString(path19);
String str19a = str19.substring(0,64);
//System.out.println("str19a"+str19a);

try (FileWriter writer2 = new FileWriter(filePath2, true)) 
{
writer2.write(str19a);
//System.out.println("str19a"+str19a);
} 
catch (IOException e) {e.printStackTrace();}
str19 = null;
str19a = null;
filePath2 = null;
path19 = null;
}


public void cleanChat5() throws FileNotFoundException,IOException{

String filePath = "Program_Files/ledger_final.log";
Path path18 = Paths.get("Program_Files/lastblockhash.log");
String str18 = Files.readString(path18);

String str18a = str18.substring(0,64);
try (FileWriter writer = new FileWriter(filePath, true)) 
{
writer.write(str18a);
} 
catch (IOException e) {e.printStackTrace();}
filePath = null;
str18 = null;
path18 = null;
}
}