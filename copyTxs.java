import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.io.*;

public class copyTxs {

        String sourceFilePath = "processed_txs.log";
        String destinationFilePath = "discordC.txt";

public copyTxs(){

try
{

//cT();
copyFileCharacterByCharacter(sourceFilePath, destinationFilePath);
}
catch (Exception kitty1){}
}


public void cT() throws FileNotFoundException, IOException{

//File why = new File("discordC.txt");

Reader r4what = new InputStreamReader(new FileInputStream("processed_txs.log"));

BufferedReader fin4what = new BufferedReader (r4what);
FileWriter fwhy = new FileWriter("discordC.txt");
BufferedWriter fwwhy = new BufferedWriter(fwhy);

try
{

String what;
String whatwhy;

String finChar = ">";


while((what=fin4what.readLine())!=null)
{
System.out.println(what);
int index = what.indexOf(finChar);
whatwhy = what.substring(index + 1);
fwwhy.write(whatwhy);
//fwwhy.write(what);
}

//fwhy.close();
//fwwhy.close();
finChar=null;
what=null;
whatwhy=null;

}
catch (IOException whytry) {}

fin4what.close();
fwhy.close();
fwwhy.close();

}

//}

public void cT2() {

Path source = Paths.get("processed_txs.log");
Path destination = Paths.get("discordC.txt");
try
{
Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
//System.out.println("File copied successfully!");
}
catch (IOException e) {e.printStackTrace();}
}






public static void copyFileCharacterByCharacter(String sourceFilePath, String destinationFilePath) {
try (BufferedReader reader = new BufferedReader(new FileReader(sourceFilePath));
BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFilePath)))
{

String line;
String line2;
String index = "> ";

while ((line = reader.readLine()) != null)
{
int where = line.indexOf(index);
line2 = line.substring(where+2);
System.out.println(line2);
System.out.println(where);
writer.write(" " + line2);
}

line=null;
line2=null;
index=null;
reader.close();
writer.close();

sourceFilePath=null;
destinationFilePath=null;
}
catch(IOException e){System.err.println("An error occurred: " + e.getMessage());}


}

}

