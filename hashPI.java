import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.lang.StringBuilder;


public class hashPI{


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
Path p113 = Paths.get("ledger_KMC/player_info_unformatted.log");
Path p114 = Paths.get("ledger_KMC/player_info_HASH.log");

try
{
String s113 = Files.readString(p113);
String s113Hash = toHexString(getSHA(toHexString(getSHA(s113))));
Files.writeString(p114, s113Hash,StandardCharsets.UTF_8);
////System.out.println("player_info_HASH = " + s113Hash);
s113Hash=null;
s113=null;
}
catch (NoSuchAlgorithmException exca113) {System.out.println("Exception thrown for incorrect algorithm: " + exca113);}
catch (IOException exce113) {System.out.println("Exception thrown for IO: " + exce113);}
p113=null;
p114=null;
}
}
