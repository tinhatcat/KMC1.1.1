import java.io.*;


public class reformatPI{


public reformatPI() throws FileNotFoundException,IOException{

try
{
rPI();
}
catch (Exception e11){}
}


public void eND(){}


public void rPI() throws FileNotFoundException,IOException{

File iF133 = new File("ledger_KMC/player_info.log");
File tF133 = new File("ledger_KMC/player_info_unformatted.log");
BufferedReader r133 = new BufferedReader(new FileReader(iF133));
BufferedWriter w133 = new BufferedWriter(new FileWriter(tF133));
String c133;

while((c133 = r133.readLine()) != null)
{
//String t133 = c133;
w133.write(c133.replace("\n", " "));
//t133 = null;
}
c133 = null;
tF133 = null;
iF133 = null;
w133.close(); 
r133.close(); 
}
}