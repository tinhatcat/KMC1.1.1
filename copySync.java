import java.io.IOException;
import java.io.*;


public class copySync{


File f23a = new File("Program_Files/syncCopy.log");
File f23b = new File("Program_Files/syncCopy2.log");
int length2;
int length3;
int differ;
int g;
String noTime;
String st12 = "$";
String st22 = "~";
String st32 = "%";
String st42 = ";";
String st52 = ",";
String st62 = "_";
String st72 = "&";
   		

public copySync() throws IOException{

try
{
cS2();
cS3();
}
catch (IOException e79){e79.printStackTrace();}
}


public void cS2() throws IOException{

String userDirectory = System.getProperty("user.home");
        //System.out.println("User directory: " + userDirectory);

//Reader reader = new InputStreamReader(new FileInputStream("../latest.log"),"UTF-8");
////Reader reader = new InputStreamReader(new FileInputStream("../latest.log"));
Reader reader = new InputStreamReader(new FileInputStream(userDirectory+"/AppData/Roaming/.minecraft/logs/latest.log"));


BufferedReader fin = new BufferedReader (reader);
FileWriter ftw = new FileWriter(f23a,true);
BufferedWriter fout = new BufferedWriter(ftw);

try
{
String sa;
String s;

while((sa=fin.readLine())!=null)
{
s = sa.trim();
fout.write(s.replaceAll("\\ufffd",""));
fout.newLine();
}

if((s=fin.readLine())==null)
{
//new PrintWriter("../latest.log").close();
new PrintWriter(userDirectory+"/AppData/Roaming/.minecraft/logs/latest.log").close();
fin.close();
fout.close();
reader.close();
ftw.close();
s=null;
sa=null;
}

else
{
fout.write(s.replaceAll("\\ufffd",""));
fout.newLine();

while((s=fin.readLine())!=null)
{
fout.write(s.replaceAll("\\ufffd",""));
fout.newLine();
}
//new PrintWriter("../latest.log").close();
new PrintWriter(userDirectory+"/AppData/Roaming/.minecraft/logs/latest.log").close();
fin.close();
fout.close();
reader.close();
ftw.close();
s=null;
sa=null;
}
}
catch (IOException e) {};
}


public void cS3() throws IOException{

//Reader reader2 = new InputStreamReader(new FileInputStream("Program_Files/syncCopy.log"),"UTF-8");
Reader reader2 = new InputStreamReader(new FileInputStream("Program_Files/syncCopy.log"));

BufferedReader fin2 = new BufferedReader (reader2);
FileWriter ftw2 = new FileWriter(f23b,true);
BufferedWriter fout2 = new BufferedWriter(ftw2);

try
{
String s2L;
String s2;
String s3;
String periods = ".";
String blockSieve = " [Render thread/INFO]: [System] [CHAT] ";

while((s3=fin2.readLine())!=null)
{
s2 = s3.trim();

if(s2.length()>10)
{
noTime = s2.substring(10);
}

length2 = s2.length();
s2L = s2.replace(periods, "");
length3 = s2L.length();
differ = length2 - length3;

if(differ==6&&noTime.startsWith(blockSieve))
{
new PrintWriter("Program_Files/syncCopy2.log").close();
////Maybe below fixes the block showing issue during sync when a block is found before syncing
////new PrintWriter("latestcopyA.log").close();
}

else
{
fout2.write(s2.replaceAll("\\ufffd",""));
fout2.newLine();
}
}
fin2.close();
fout2.close();
ftw2.close();
reader2.close();
s2=null;
s3=null;
s2L=null;
blockSieve=null;
periods=null;

noTime=null;

new PrintWriter("Program_Files/syncCopy.log").close();
}
catch(IOException excc) {};
}
}
