import java.io.IOException;
import java.io.*;


public class copyLatest{


File f79 = new File("latestcopyA.log");
File f792 = new File("latestcopy.log");
File f793 = new File("nextBlockLines.log");
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
   		

public copyLatest() throws IOException{

try
{
cL();
cL2();
cL3();
}
catch (IOException e79){e79.printStackTrace();}
}


public void cL() throws IOException{

//Reader reader4 = new InputStreamReader(new FileInputStream("nextBlockLines.log"),"UTF-8");
Reader reader4 = new InputStreamReader(new FileInputStream("nextBlockLines.log"));

BufferedReader fin4 = new BufferedReader (reader4);
FileWriter ftw4 = new FileWriter(f79,true);
BufferedWriter fout4 = new BufferedWriter(ftw4);

try
{
String sa4;
String s4;

while((sa4=fin4.readLine())!=null)
{
s4 = sa4.trim();
fout4.write(s4.replaceAll("\\ufffd",""));
fout4.newLine();
}
reader4.close();
fin4.close();
ftw4.close();
fout4.close();
s4=null;
sa4=null;
}
catch (IOException eio4) {};
}


public void cL2() throws IOException{

String userDirectory = System.getProperty("user.home");
        //System.out.println("User directory: " + userDirectory);

new PrintWriter("nextBlockLines.log").close();
//Reader reader = new InputStreamReader(new FileInputStream("../latest.log"),"UTF-8");
////Reader reader = new InputStreamReader(new FileInputStream("../latest.log"));
Reader reader = new InputStreamReader(new FileInputStream(userDirectory+"/AppData/Roaming/.minecraft/logs/latest.log"));



BufferedReader fin = new BufferedReader (reader);
FileWriter ftw = new FileWriter(f79,true);
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


public void cL3() throws IOException{

new PrintWriter("latestcopy.log").close();
//Reader reader2 = new InputStreamReader(new FileInputStream("latestcopyA.log"),"UTF-8");
Reader reader2 = new InputStreamReader(new FileInputStream("latestcopyA.log"));
BufferedReader fin2 = new BufferedReader (reader2);
FileWriter ftw2 = new FileWriter(f792,true);
BufferedWriter fout2 = new BufferedWriter(ftw2);
FileWriter ftw3 = new FileWriter(f793,true);
BufferedWriter fout3 = new BufferedWriter(ftw3);
g=0;

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
noTime = s2.substring(10);
length2 = s2.length();
s2L = s2.replace(periods, "");
length3 = s2L.length();
differ = length2 - length3;

if(differ==6&&noTime.startsWith(blockSieve))
{
g++;
}

if(g==0)
{
fout2.write(s2.replaceAll("\\ufffd",""));
fout2.newLine();
}

else
{

}

if(g>=0&&s2.contains(st12)&&s2.contains(st22)&&s2.contains(st32)&&s2.contains(st42)&&s2.contains(st52)&&s2.contains(st62)&&s2.contains(st72))
{
fout3.write(s2.replaceAll("\\ufffd",""));
fout3.newLine();
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
fout3.close();
ftw3.close();
s2=null;
s3=null;
s2L=null;
blockSieve=null;
periods=null;
}
catch(IOException excc) {};
}
}
