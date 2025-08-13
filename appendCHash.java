import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
 

public class appendCHash{


public appendCHash() throws FileNotFoundException,IOException{

try
{
aCH();
}
catch (Exception e311){}
}


public void aCH() throws FileNotFoundException,IOException{

String fP311 = "ledger_KMC/ledger_current.txt";
String fP312 = "ledger_KMC/consensus_HASH.log";

try(FileWriter wR311 = new FileWriter(fP311, true))
{
String ct311 = Files.readString(Paths.get(fP312));
wR311.write("=" + ct311 + " ");
ct311=null;
}
catch (IOException eoi31){System.err.println("An error occurred: " + eoi31.getMessage());}
fP311=null;
fP312=null;
}
}
