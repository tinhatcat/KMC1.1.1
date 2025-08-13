import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
 

public class appendLHash{


public appendLHash() throws FileNotFoundException,IOException{

try
{
aLH();
}
catch (Exception e211){}
}


public void aLH() throws FileNotFoundException,IOException{

String fP11 = "ledger_KMC/ledgerhashes.log";
String fP12 = "ledger_KMC/ledger_current_HASH.log";

try(FileWriter wR11 = new FileWriter(fP11, true))
{
String ct11 = Files.readString(Paths.get(fP12));
wR11.write(ct11 + " ");
ct11=null;
}
catch (IOException eoi1){System.err.println("An error occurred: " + eoi1.getMessage());}
fP11=null;
fP12=null;
}
}
