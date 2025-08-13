import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.lang.StringBuilder;


public class printHash {


public static byte[] getSHA(String input) throws NoSuchAlgorithmException, IOException{

MessageDigest md = MessageDigest.getInstance("SHA-256");
return md.digest(input.getBytes(StandardCharsets.UTF_8));
}

public static String toHexString(byte[] hash){

BigInteger number = new BigInteger(1, hash);
StringBuilder hexString = new StringBuilder(number.toString(16));

while (hexString.length() < 64)
{
hexString.insert(0, '0');
}
return hexString.toString();
}

{
Path path = Paths.get("privatekey.txt");

try
{
String str3 = Files.readString(path);
Files.writeString(path, toHexString(getSHA(toHexString(getSHA(str3)))),StandardCharsets.UTF_8);
}
catch (NoSuchAlgorithmException e) {System.out.println("Exception thrown for incorrect algorithm: " + e);}
catch (IOException ex) {System.out.println("Exception thrown for IO: " + ex);}
}
}
