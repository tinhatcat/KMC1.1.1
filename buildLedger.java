import java.io.BufferedReader;
import java.io.IOException; 
import java.io.*;
import java.io.File;
import java.security.NoSuchAlgorithmException;
import java.math.BigInteger;


public class buildLedger{


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
BigInteger MiningBal  = new BigInteger("0");
BigInteger NewThisPB  = new BigInteger("0");
File directory = new File("ledger_KMC/KMC1");
File directory2 = new File("ledger_KMC/KMC2");
File directory3 = new File("ledger_KMC/KMC3");
File directory4 = new File("ledger_KMC/KMC4");
File directory5 = new File("ledger_KMC/KMC5");
File directory6 = new File("ledger_KMC/KMC6");
File directory7 = new File("ledger_KMC/KMC7");
File directory8 = new File("ledger_KMC/KMC8");
File directory9 = new File("ledger_KMC/KMC9");
File directory10= new File("ledger_KMC/KMC10");
File directory11= new File("ledger_KMC/KMC11");
File directory12= new File("ledger_KMC/KMC12");
int b;


public buildLedger()throws IOException, NoSuchAlgorithmException{

bL();
}


public void bL()throws IOException, NoSuchAlgorithmException{

//Reader readerr = new InputStreamReader(new FileInputStream("ledger_KMC/ledger_current.txt"),"UTF-8");
Reader readerr = new InputStreamReader(new FileInputStream("ledger_KMC/ledger_current.txt"));

BufferedReader finr = new BufferedReader (readerr);

if (directory.isDirectory())
{

for(int k1 = 0; k1 <= 99;)
{
File[] files = directory.listFiles();
File file = files [k1];
long fileSizeInBytes = file.length();

if(fileSizeInBytes>= 100000000&&b==0)
{
k1++;
}

else
{
Writer writerr = new OutputStreamWriter(new FileOutputStream(file),"UTF-8");
BufferedWriter foutw = new BufferedWriter(writerr);

try
{
String sr;

while((sr=finr.readLine())!=null)
{
foutw.write(sr.replaceAll("\\ufffd",""));foutw.newLine();
}
finr.close();
foutw.close();
sr=null;
}
catch (IOException er1) {};
b++;
break;
}
file = null;
}
directory = null;
}


if (directory2.isDirectory()&&b==0)
{

for(int k2 = 0; k2 <= 99;)
{
File[] files2 = directory2.listFiles();
File file2 = files2 [k2];
long fileSizeInBytes2 = file2.length();
if(fileSizeInBytes2>= 100000000&&b==0)
{
k2++;
}

else
{
Writer writerr = new OutputStreamWriter(new FileOutputStream(file2),"UTF-8");
BufferedWriter foutw = new BufferedWriter(writerr);

try
{
String sr;

while((sr=finr.readLine())!=null)
{
foutw.write(sr.replaceAll("\\ufffd",""));foutw.newLine();
}
finr.close();
foutw.close();
sr=null;
}
catch (IOException er2) {};
b++;
break;
}
file2 = null;
}
directory2 = null;
}


if (directory3.isDirectory()&&b==0)
{

for(int k3 = 0; k3 <= 99;)
{
File[] files = directory3.listFiles();
File file3 = files [k3];
long fileSizeInBytes3 = file3.length();

if(fileSizeInBytes3>= 100000000&&b==0)
{
k3++;
}

else
{
Writer writerr = new OutputStreamWriter(new FileOutputStream(file3),"UTF-8");
BufferedWriter foutw = new BufferedWriter(writerr);

try
{
String sr;

while((sr=finr.readLine())!=null)
{
foutw.write(sr.replaceAll("\\ufffd",""));foutw.newLine();
}
finr.close();
foutw.close();
sr=null;
}
catch (IOException er3) {};
b++;
break;
}
file3 = null;
}
directory3 = null;
}


if (directory4.isDirectory()&&b==0)
{

for(int k4 = 0; k4 <= 99;)
{
File[] files = directory4.listFiles();
File file4 = files [k4];
long fileSizeInBytes4 = file4.length();

if(fileSizeInBytes4>= 100000000&&b==0)
{
k4++;
}

else
{
Writer writerr = new OutputStreamWriter(new FileOutputStream(file4),"UTF-8");
BufferedWriter foutw = new BufferedWriter(writerr);

try
{
String sr;

while((sr=finr.readLine())!=null)
{
foutw.write(sr.replaceAll("\\ufffd",""));foutw.newLine();
}
finr.close();
foutw.close();
sr=null;
}
catch (IOException er4) {};
b++;
break;
}
file4 = null;
}
directory4 = null;
}


if (directory5.isDirectory()&&b==0)
{

for(int k5 = 0; k5 <= 99;)
{
File[] files = directory5.listFiles();
File file5 = files [k5];
long fileSizeInBytes5 = file5.length();

if(fileSizeInBytes5>= 100000000&&b==0)
{
k5++;
}

else
{
Writer writerr = new OutputStreamWriter(new FileOutputStream(file5),"UTF-8");
BufferedWriter foutw = new BufferedWriter(writerr);

try
{
String sr;

while((sr=finr.readLine())!=null)
{
foutw.write(sr.replaceAll("\\ufffd",""));foutw.newLine();
}
finr.close();
foutw.close();
sr=null;
}
catch (IOException er5) {};
b++;
break;
}
file5 = null;
}
directory5 = null;
}


if (directory6.isDirectory()&&b==0)
{

for(int k6 = 0; k6 <= 99;)
{
File[] files = directory6.listFiles();
File file6 = files [k6];
long fileSizeInBytes6 = file6.length();

if(fileSizeInBytes6>= 100000000&&b==0)
{
k6++;
}

else
{
Writer writerr = new OutputStreamWriter(new FileOutputStream(file6),"UTF-8");
BufferedWriter foutw = new BufferedWriter(writerr);

try
{
String sr;

while((sr=finr.readLine())!=null)
{
foutw.write(sr.replaceAll("\\ufffd",""));foutw.newLine();
}
finr.close();
foutw.close();
sr=null;
}
catch (IOException er6) {};
b++;
break;
}
file6 = null;
}
directory6 = null;
}


if (directory7.isDirectory()&&b==0)
{

for(int k7 = 0; k7 <= 99;)
{
File[] files = directory7.listFiles();
File file7 = files [k7];
long fileSizeInBytes7 = file7.length();

if(fileSizeInBytes7>= 100000000&&b==0)
{
k7++;
}

else
{
Writer writerr = new OutputStreamWriter(new FileOutputStream(file7),"UTF-8");
BufferedWriter foutw = new BufferedWriter(writerr);

try
{
String sr;

while((sr=finr.readLine())!=null)
{
foutw.write(sr.replaceAll("\\ufffd",""));foutw.newLine();
}
finr.close();
foutw.close();
sr=null;
}
catch (IOException er7) {};
b++;
break;
}
file7 = null;
}
directory7 = null;
}


if (directory8.isDirectory()&&b==0)
{

for(int k8 = 0; k8 <= 99;)
{
File[] files = directory8.listFiles();
File file8 = files [k8];
long fileSizeInBytes8 = file8.length();

if(fileSizeInBytes8>= 100000000&&b==0)
{
k8++;
}

else
{
Writer writerr = new OutputStreamWriter(new FileOutputStream(file8),"UTF-8");
BufferedWriter foutw = new BufferedWriter(writerr);

try
{
String sr;

while((sr=finr.readLine())!=null)
{
foutw.write(sr.replaceAll("\\ufffd",""));foutw.newLine();
}
finr.close();
foutw.close();
sr=null;
}
catch (IOException er8) {};
b++;
break;
}
file8 = null;
}
directory8 = null;
}


if (directory9.isDirectory()&&b==0)
{

for(int k9 = 0; k9 <= 99;)
{
File[] files = directory9.listFiles();
File file9 = files [k9];
long fileSizeInBytes9 = file9.length();

if(fileSizeInBytes9>= 100000000&&b==0)
{
k9++;
}

else
{
Writer writerr = new OutputStreamWriter(new FileOutputStream(file9),"UTF-8");
BufferedWriter foutw = new BufferedWriter(writerr);

try
{
String sr;

while((sr=finr.readLine())!=null)
{
foutw.write(sr.replaceAll("\\ufffd",""));foutw.newLine();
}
finr.close();
foutw.close();
sr=null;
}
catch (IOException er9) {};
b++;
break;
}
file9 = null;
}
directory9 = null;
}


if (directory10.isDirectory()&&b==0)
{

for(int k10 = 0; k10 <= 99;)
{
File[] files = directory10.listFiles();
File file10 = files [k10];
long fileSizeInBytes10 = file10.length();

if(fileSizeInBytes10>= 100000000&&b==0)
{
k10++;
}

else
{
Writer writerr = new OutputStreamWriter(new FileOutputStream(file10),"UTF-8");
BufferedWriter foutw = new BufferedWriter(writerr);

try
{
String sr;

while((sr=finr.readLine())!=null)
{
foutw.write(sr.replaceAll("\\ufffd",""));foutw.newLine();
}
finr.close();
foutw.close();
sr=null;
}
catch (IOException er10) {};
b++;
break;
}
file10 = null;
}
directory10 = null;
}


if (directory11.isDirectory()&&b==0)
{

for(int k11 = 0; k11 <= 99;)
{
File[] files = directory11.listFiles();
File file11 = files [k11];
long fileSizeInBytes11 = file11.length();

if(fileSizeInBytes11>= 100000000&&b==0)
{
k11++;
}

else
{
Writer writerr = new OutputStreamWriter(new FileOutputStream(file11),"UTF-8");
BufferedWriter foutw = new BufferedWriter(writerr);

try
{
String sr;

while((sr=finr.readLine())!=null)
{
foutw.write(sr.replaceAll("\\ufffd",""));foutw.newLine();
}
finr.close();
foutw.close();
sr=null;
}
catch (IOException er11) {};

b++;
break;
}
file11 = null;
}
directory11 = null;
}


if (directory12.isDirectory()&&b==0)
{

for(int k12 = 0; k12 <= 99;)
{
File[] files = directory12.listFiles();
File file12 = files [k12];
long fileSizeInBytes12 = file12.length();

if(fileSizeInBytes12>= 100000000&&b==0)
{
k12++;
}

else
{
Writer writerr = new OutputStreamWriter(new FileOutputStream(file12),"UTF-8");
BufferedWriter foutw = new BufferedWriter(writerr);

try
{
String sr;

while((sr=finr.readLine())!=null)
{
foutw.write(sr.replaceAll("\\ufffd",""));foutw.newLine();
}
finr.close();
foutw.close();
sr=null;
}
catch (IOException er12) {};
b++;
break;
}
file12 = null;
}
directory12 = null;
}

else
{

}
}
}