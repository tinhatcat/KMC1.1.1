import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption; 

public class backupTxs{


public backupTxs() throws IOException{

try
{
bT();
}
catch (Exception eb311){}
}


public void bT() {

Path source69 = Paths.get("Program_Files/latestTxs4.log"); // Replace with your source file path
Path target69 = Paths.get("Program_Files/latestTxs4COPY.log"); // Replace with your target file path
try
{
Files.copy(source69, target69, StandardCopyOption.REPLACE_EXISTING);
System.out.println("File copied successfully!");

}
catch (IOException e){System.err.println("Error copying file: " + e.getMessage());}

source69 = null;
target69 = null;
}
}