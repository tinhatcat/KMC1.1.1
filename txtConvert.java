import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class txtConvert {

String windowsFilePath = "player_info.txt";
String unixFilePath = "player_info.log";


public txtConvert(){

convertFile(windowsFilePath, unixFilePath);

}


public static void convertFile(String windowsFilePath, String unixFilePath){

try (BufferedReader readerg = new BufferedReader(new FileReader(windowsFilePath));
BufferedWriter writerg = new BufferedWriter(new FileWriter(unixFilePath)))
{
String lineg;
while ((lineg = readerg.readLine()) != null)
{
writerg.write(lineg+"\n");
}
readerg.close();
writerg.close();

}
catch (IOException ey) {ey.printStackTrace();}
}
}