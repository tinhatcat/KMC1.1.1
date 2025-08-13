import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths; 
import java.util.stream.Stream;
import java.lang.String;
import java.nio.file.StandardOpenOption;


public class getBlocks{


public getBlocks() throws FileNotFoundException,IOException{

try
{
gB();
}
catch (IOException e78){e78.printStackTrace();}
}
	

public void gB() throws FileNotFoundException,IOException{

new PrintWriter("Program_Files/latestblock.log").close();
Path path12 = Paths.get("latestcopy.log");
String outputFile2 = "Program_Files/latestblocks.log";
String outputFile2a = "Program_Files/latestblock.log";
String outputFile3 = "Program_Files/lastblock.log";

//try (Stream<String> lines = Files.lines(path12, StandardCharsets.UTF_8).map(String::trim))
try (Stream<String> lines = Files.lines(path12).map(String::trim))

{
lines.filter(line->Character.isWhitespace(line.charAt(41))
&Character.isUpperCase(line.charAt(44))
&Character.isUpperCase(line.charAt(45))
&Character.isUpperCase(line.charAt(46))
&Character.isWhitespace(line.charAt(48))

&line.contains(".")

&Character.isDigit(line.charAt(49))).forEach(line -> 
{

try
{
Files.write(Paths.get(outputFile2),(System.lineSeparator() + line).getBytes(),StandardOpenOption.CREATE, StandardOpenOption.APPEND);
Files.write(Paths.get(outputFile3),(line).getBytes(),StandardOpenOption.CREATE, StandardOpenOption.APPEND);
Files.write(Paths.get(outputFile2a),(line).getBytes(),StandardOpenOption.CREATE, StandardOpenOption.APPEND);
} 
catch (IOException e789) {e789.printStackTrace();}
catch (StringIndexOutOfBoundsException e7892) {}
});
}
catch (StringIndexOutOfBoundsException e78912) {}
path12 = null;
}
}
