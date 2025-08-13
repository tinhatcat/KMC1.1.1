import java.io.IOException;
import java.io.*;


public class copyLatestSync{


public copyLatestSync() throws IOException{

try
{
cLS();
new PrintWriter("Program_Files/syncCopy2.log").close();

}
catch (IOException e79){e79.printStackTrace();}
}


public void cLS() throws IOException{

new PrintWriter("latestcopyA.log").close();
//Reader readerS = new InputStreamReader(new FileInputStream("Program_Files/syncCopy2.log"),"UTF-8");
Reader readerS = new InputStreamReader(new FileInputStream("Program_Files/syncCopy2.log"));

BufferedReader finS = new BufferedReader (readerS);
//Writer writerS = new OutputStreamWriter(new FileOutputStream("latestcopyA.log"),"UTF-8");
Writer writerS = new OutputStreamWriter(new FileOutputStream("latestcopyA.log"));

BufferedWriter foutS = new BufferedWriter(writerS);

try
{
String sS;

while((sS=finS.readLine())!=null)
{
foutS.write(sS.replaceAll("\\ufffd",""));foutS.newLine();
}
finS.close();
foutS.close();
}
catch (IOException eS) {};
}
}