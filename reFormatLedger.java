import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.math.BigInteger;


public class reFormatLedger{

Path path = Paths.get("localplayer.txt");


public reFormatLedger() throws FileNotFoundException,IOException{

try
{
File file73 = new File("Program_Files/lastblock.log");

if (file73.exists() && file73.length() !=0)
{
rFL();
rFL2();
file73 = null;
}

else
{
eND();
file73 = null;
}
}
catch (Exception e11){}
}


public void eND(){}


public void rFL() throws FileNotFoundException,IOException{

new PrintWriter("Program_Files/ledger_formatted.log").close();
File inputFile33 = new File("Program_Files/ledger_final.log");
File tempFile33 = new File("Program_Files/ledger_formatted.log");
BufferedReader reader33 = new BufferedReader(new FileReader(inputFile33));
BufferedWriter writer33 = new BufferedWriter(new FileWriter(tempFile33, true));
String currentLine33;

while((currentLine33 = reader33.readLine()) != null)
{

//System.out.println("currentLine33 from reformat" + currentLine33);

//String trimmedLine33 = currentLine33;
writer33.write(currentLine33.replace(" ", "\n"));
//trimmedLine33 = null;
}
currentLine33 = null;
tempFile33 = null;
inputFile33 = null;
writer33.close(); 
reader33.close(); 
}


public void rFL2() throws FileNotFoundException,IOException{

File inputFile34 = new File("Program_Files/ledger_formatted.log");
File tempFile34 = new File("Program_Files/hash2.log");
BufferedReader reader34 = new BufferedReader(new FileReader(inputFile34));
BufferedWriter writer34 = new BufferedWriter(new FileWriter(tempFile34, true));
String currentLine34;
BigInteger Reward1  = new BigInteger("100000000000000");
BigInteger Reward2  = new BigInteger("50000000000000");
BigInteger Reward3  = new BigInteger("25000000000000");
BigInteger Reward4  = new BigInteger("12500000000000");
BigInteger Reward5  = new BigInteger("6250000000000");
BigInteger Reward6  = new BigInteger("3125000000000");
BigInteger Reward7  = new BigInteger("1562500000000");
BigInteger Reward8  = new BigInteger("781250000000");
BigInteger Reward9  = new BigInteger("390625000000");
BigInteger Reward10 = new BigInteger("195312500000");
BigInteger FinalBalance  = new BigInteger("0");
//int Block = 0;
//int TotalBlocks = 0;
String nextLine34;

while((currentLine34 = reader34.readLine()) != null) 
{
char charToFind = '.';
String trimmedLine34 = currentLine34;
String BlockNumber;
int index = trimmedLine34.indexOf(charToFind);

if (trimmedLine34.contains(String.valueOf(charToFind)))
{
BlockNumber = currentLine34.substring(0, index);
int BlockNo = Integer.parseInt(BlockNumber);


//System.out.println("if trimmedLine34.contains period Block Number" + BlockNumber);

try
{
String str4 = Files.readString(path);
nextLine34 = reader34.readLine();
String PlayerName = nextLine34;
String PlayerNameTest = " " + PlayerName;

if(PlayerNameTest.equals(str4))
{
//TotalBlocks = Block+=1;


//System.out.println("PlayerNameTest.equals localplayertxt(str4)" + PlayerNameTest);



Path path74 = Paths.get("wallet_address.log");

try
{
File file74 = new File("wallet_address.log");

if (file74.exists() && file74.length() ==0)
{
//Files.writeString(path74, BlockNumber,StandardCharsets.UTF_8);
Files.writeString(path74, BlockNumber);

System.out.println("if wallet file exists and non zero Block Number" + BlockNumber);



}
file74 = null;
}
catch (Exception e74){}

if(BlockNo<2100001)
{FinalBalance = FinalBalance.add(Reward1);

//System.out.println("if Block Number less than reward" + Reward1);


}

if(2100001<=BlockNo&&BlockNo<4200001)
{FinalBalance = FinalBalance.add(Reward2);}

if(4200001<=BlockNo&&BlockNo<6300001)
{FinalBalance = FinalBalance.add(Reward3);}

if(6300001<=BlockNo&&BlockNo<8400001)
{FinalBalance = FinalBalance.add(Reward4);}

if(8400001<=BlockNo&&BlockNo<10500001)
{FinalBalance = FinalBalance.add(Reward5);}

if(10500001<=BlockNo&&BlockNo<12600001)
{FinalBalance = FinalBalance.add(Reward6);}

if(12600001<=BlockNo&&BlockNo<14700001)
{FinalBalance = FinalBalance.add(Reward7);}

if(14700001<=BlockNo&&BlockNo<16800001)
{FinalBalance = FinalBalance.add(Reward8);}

if(16800001<=BlockNo&&BlockNo<18900001)
{FinalBalance = FinalBalance.add(Reward9);}

if(18900001<=BlockNo&&BlockNo<21000001)
{FinalBalance = FinalBalance.add(Reward10);}
}
str4 = null;
}
catch (IOException ex) {System.out.println("Exception thrown for IO: " + ex);}
}

else
{

}
}

if((currentLine34 = reader34.readLine()) == null)
{
////System.out.println("");
writer34.close();
reader34.close();
}
inputFile34 = null;
tempFile34 = null;
nextLine34 = null;
currentLine34 = null;
reader34.close(); 
writer34.close(); 
Reward1  = null;
Reward2  = null;
Reward3  = null;
Reward4  = null;
Reward5  = null;
Reward6  = null;
Reward7  = null;
Reward8  = null;
Reward9  = null;
Reward10 = null;
FinalBalance = null;
}
}