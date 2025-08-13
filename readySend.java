import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class readySend {

public readySend(){

try
{
rS();
}
catch (Exception kitty2){}
}

public void rS() {
        Path source = Paths.get("ledger_KMC/consensus_HASH.log");
        Path destination = Paths.get("Program_Files/readySend.txt");
        try {
            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
            //System.out.println("File copied successfully!!!");
        } catch (IOException ecat) {
            ecat.printStackTrace();
        }
source=null;
destination=null;
    }

}