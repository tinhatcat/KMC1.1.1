import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.lang.StringBuilder;


public class hashLC{


public static byte[] getSHA(String input) throws NoSuchAlgorithmException, IOException{
MessageDigest md = MessageDigest.getInstance("SHA-256");
return md.digest(input.getBytes(StandardCharsets.UTF_8));}


public static String toHexString(byte[] hash){
BigInteger number = new BigInteger(1, hash);
StringBuilder hexString = new StringBuilder(number.toString(16));
while (hexString.length() < 64)
{hexString.insert(0, '0');}
return hexString.toString();}

{
Path p13 = Paths.get("ledger_KMC/ledger_current.txt");
Path p14 = Paths.get("ledger_KMC/ledger_current_HASH.log");

try
{
String s13 = Files.readString(p13);
String s13Hash = toHexString(getSHA(toHexString(getSHA(s13))));
Files.writeString(p14, s13Hash,StandardCharsets.UTF_8);
////System.out.println("ledger_current_HASH = " + s13Hash);
s13=null;
s13Hash=null;
}
catch (NoSuchAlgorithmException exca13) {System.out.println("Exception thrown for incorrect algorithm: " + exca13);}
catch (IOException exce13) {System.out.println("Exception thrown for IO: " + exce13);}
p13=null;
p14=null;
}
}
