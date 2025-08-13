import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption; 

public class backupLedger{


public backupLedger() throws IOException{

try
{
bL();
}
catch (Exception eb311){}
}


public void bL() {

Path source69 = Paths.get("ledger_KMC/ledger_current.txt"); // Replace with your source file path
Path target69 = Paths.get("ledger_KMC/ledger_currentCOPY.txt"); // Replace with your target file path
Path source269 = Paths.get("ledger_KMC/player_info.log"); // Replace with your source file path
Path target269 = Paths.get("ledger_KMC/player_infoCOPY.log"); // Replace with your target file path

try
{
Files.copy(source69, target69, StandardCopyOption.REPLACE_EXISTING);
//System.out.println("File copied successfully!");
Files.copy(source269, target269, StandardCopyOption.REPLACE_EXISTING);
//System.out.println("File2 copied successfully!");
}
catch (IOException e){System.err.println("Error copying file: " + e.getMessage());}

source69 = null;
target69 = null;
source269 = null;
target269 = null;
}
}