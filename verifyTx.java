import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths; 
import java.lang.String;


public class verifyTx{

File file11a = new File("ledger_KMC/player_info.log");
Path LocalPlayer1a = Paths.get("localplayer.txt");


public void verifyTx2()throws IOException, UnsupportedEncodingException, FileNotFoundException{

String f1String = Files.readString(LocalPlayer1a);
String f1String2= f1String.substring(1);
String cL2;
BufferedReader buff2 = new BufferedReader(new FileReader(file11a));

while((cL2 = buff2.readLine()) != null) 
{

if(cL2.equals(f1String2))
{
buff2.close();
file11a=null;
LocalPlayer1a=null;
f1String=null;
f1String2=null;
cL2=null;
break;
}

else
{
file11a=null;
LocalPlayer1a=null;
f1String=null;
f1String2=null;
cL2=null;
break;
}
}
file11a=null;
LocalPlayer1a=null;
f1String=null;
f1String2=null;
cL2=null;
}
}