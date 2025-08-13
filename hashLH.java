import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.lang.StringBuilder;


public class hashLH{


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
Path p1113 = Paths.get("ledger_KMC/ledgerhashes.log");
Path p1114 = Paths.get("ledger_KMC/ledgerhashes_HASH.log");
try
{
String s1113 = Files.readString(p1113);
String s1113Hash = toHexString(getSHA(toHexString(getSHA(s1113))));
Files.writeString(p1114, s1113Hash,StandardCharsets.UTF_8);
////System.out.println("ledgerhashes_HASH = " + s1113Hash);
s1113=null;
s1113Hash=null;
}
catch (NoSuchAlgorithmException exca1113) {System.out.println("Exception thrown for incorrect algorithm: " + exca1113);}
catch (IOException exce1113) {System.out.println("Exception thrown for IO: " + exce1113);}
p1113=null;
p1114=null;
}
}
