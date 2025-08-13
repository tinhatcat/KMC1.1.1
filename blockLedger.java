import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths; 
import java.util.stream.Stream;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import java.nio.file.StandardOpenOption;


public class blockLedger{


public blockLedger() throws FileNotFoundException,IOException{

try
{
bL();
}
catch (IOException e78){e78.printStackTrace();}
}
	

public void bL() throws FileNotFoundException,IOException{

File file = new File("Program_Files/lastblock.log");

if (file.exists() && file.length() == 0)
{
file = null;
} 

else
{
////System.out.println("");
////System.out.println("TheKittyMine 1000 Years!");
////System.out.println("");
////System.out.println("New block created!!! (BlockNo.UUID.Solution.NewHash.OldHash.GameTime.GameDay)");

try{
new PrintWriter("Program_Files/lastblockledger.log").close();
file = null;
bLF();
}
catch (IOException e78){e78.printStackTrace();}
}
}


public void bLF() throws FileNotFoundException,IOException{

Path path13 = Paths.get("Program_Files/lastblock.log");
String outputFile5 = "Program_Files/lastblockledger.log";
String outputFile6 = "Program_Files/ledger_final.log";

try (Stream<String> lines = Files.lines(path13, StandardCharsets.UTF_8).map(String->String.substring(49)))
{
lines.filter(line->Character.isDigit(line.charAt(0))).forEach(line ->
{

try
{
Files.write(Paths.get(outputFile5),(line).getBytes(),StandardOpenOption.CREATE, StandardOpenOption.APPEND);
File file = new File("Program_Files/ledger_final.log");

if (file.exists() && file.length() != 0)
{
Files.write(Paths.get(outputFile6),(" " + line.trim()).getBytes(), StandardOpenOption.CREATE,StandardOpenOption.APPEND);
}

else
{
Files.write(Paths.get(outputFile6),(line).getBytes(),StandardOpenOption.CREATE, StandardOpenOption.APPEND);}
} 
catch (IOException e) {e.printStackTrace();}
catch (StringIndexOutOfBoundsException e9) {}
});
}
catch (StringIndexOutOfBoundsException e9) {}
////Path path23 = Paths.get("Program_Files/lastblockledger.log");
////String str23 = Files.readString(path23);
////System.out.println("");
////System.out.println(str23);
////System.out.println("");
path13 = null;
////path23 = null;
////str23 = null;
}
}