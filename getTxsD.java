import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths; 
import java.util.stream.Stream;
import java.lang.String;
import java.nio.file.StandardOpenOption;
import java.nio.charset.StandardCharsets;


public class getTxsD{

File file16 = new File("localplayer.txt");


public getTxsD() throws FileNotFoundException,IOException{

try
{
gT();
}
catch (IOException e78){e78.printStackTrace();}
}


public void gT() throws FileNotFoundException,IOException{	 

String st1 = "$";
String st2 = "~";
String st3 = "%";
String st4 = ";";
String st5 = ",";
String st6 = "_";
String st7 = "&";
   		
File inputFile6a = new File("outputTx.txt");
File tempFile6a = new File("Program_Files/latestTxs.log");

try
{
BufferedReader reader6a = new BufferedReader(new FileReader(inputFile6a));
BufferedWriter writer6a = new BufferedWriter(new FileWriter(tempFile6a));
String currentLine6a;
//reader6a.readLine();
//currentLine6a = reader6a.readLine();


while((currentLine6a = reader6a.readLine()) != null)
{
if(currentLine6a.contains(st1)&&currentLine6a.contains(st2)&&currentLine6a.contains(st3)&&currentLine6a.contains(st4)&&currentLine6a.contains(st5)&&currentLine6a.contains(st6)&&currentLine6a.contains(st7))
{
writer6a.write("[00:00:00] [Render thread/INFO]: [CHAT] " + currentLine6a + System.getProperty("line.separator"));
System.out.println("Found a tx =" + currentLine6a);
}
}
reader6a.close();
writer6a.close();
}
catch (IOException e1bce){}

new PrintWriter("outputTx.txt").close();
}
}