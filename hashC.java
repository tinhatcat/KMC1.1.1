import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.lang.StringBuilder;


public class hashC{


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
Path h0 = Paths.get("ledger_KMC/ledgerhashes_HASH.log");
Path h1 = Paths.get("ledger_KMC/player_info_HASH.log");
Path h2 = Paths.get("ledger_KMC/ledger_current_HASH.log");
Path h3 = Paths.get("ledger_KMC/consensus_HASH.log");

try
{
String lhH = Files.readString(h0);
String piH = Files.readString(h1);
String lcH = Files.readString(h2);
String cHash = toHexString(getSHA(toHexString(getSHA(lhH + piH + lcH))));
Files.writeString(h3, cHash,StandardCharsets.UTF_8);
////System.out.println("consensus_HASH = " + cHash);
lhH=null;
piH=null;
lcH=null;
}
catch (NoSuchAlgorithmException exca1113) {System.out.println("Exception thrown for incorrect algorithm: " + exca1113);}
catch (IOException exce1113) {System.out.println("Exception thrown for IO: " + exce1113);}
h0=null;
h1=null;
h2=null;
h3=null;
}
}
