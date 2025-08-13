import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class pythonCaller{


public pythonCaller(){


pC();
}


public void pC(){

try
{
ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", "start", "python", "consend.py");
Process process = pb.start();
ProcessBuilder pb2 = new ProcessBuilder("cmd.exe", "/c", "start", "python", "readmsg.py");
Process process2 = pb2.start();
}
catch (IOException e) {e.printStackTrace();}
}
}