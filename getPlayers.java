import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths; 
import java.util.stream.Stream;
import java.lang.String;
import java.nio.file.StandardOpenOption;


public class getPlayers{


public getPlayers() throws FileNotFoundException,IOException{

try
{
gP();
}
catch (IOException e78){e78.printStackTrace();}
}


public void gP() throws FileNotFoundException,IOException{	
 
Path path12 = Paths.get("latestcopy.log");
String outputFile2 = "Program_Files/latestplayers.log";
String outputFile7 = "Program_Files/lastplayer.log";

//try (Stream<String> lines = Files.lines(path12, StandardCharsets.UTF_8).map(String::trim))
try (Stream<String> lines = Files.lines(path12).map(String::trim))

{
lines.filter(line->Character.isWhitespace(line.charAt(41))
&Character.isUpperCase(line.charAt(44))
&Character.isUpperCase(line.charAt(45))
&Character.isUpperCase(line.charAt(46))
&Character.isWhitespace(line.charAt(48))
&Character.isSpaceChar(line.charAt(49))).forEach(line -> 
{

try
{
Files.write(Paths.get(outputFile2),(System.lineSeparator() + line).getBytes(),StandardOpenOption.CREATE, StandardOpenOption.APPEND);
Files.write(Paths.get(outputFile7),(line).getBytes(),StandardOpenOption.CREATE, StandardOpenOption.APPEND);
} 
catch (IOException e) {e.printStackTrace();}
catch (StringIndexOutOfBoundsException e2) {}
});
}
catch (StringIndexOutOfBoundsException e2) {}
path12 = null;
}
}
