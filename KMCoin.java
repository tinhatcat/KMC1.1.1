import java.io.*;    


public class KMCoin{

public static String filePathY = "ledger_KMC/player_info.txt";

public static int mode;
private copyLatestSync c1;
private copyLatest c2;
private getChat c3;
private getBlocks c4;
private getPlayers c5;
private blockLedger c6;
private playerLedger c7;
private whoIs c8;
private reFormatLedger c9;
private TransactionProcessor c10;
private ProcessTxsB c11;
private updateBlockBal c12;
private txPanel c12a;
private makeLedger c13;
//private top100 c14;
private top5 c14;
private hashLC c15;
private reformatPI c16;
private hashPI c17;
private appendLHash c18;
private buildLedger c19;
private hashLH c20;
private hashC c21;
private appendCHash c22;
private copySync c23;
private KMCoin2 c24;
private getPlayerInfo3 c25;
private copyTxs c26;
private discordM c27;
private readySend c28;
private CheckC4 c29;
private backupLedger c30;
private backupTxs c31;
private pythonCaller c32;

synchronized public void firstMethod() throws IOException, InterruptedException, Exception{

while(true)
{
setC24(new KMCoin2());
setC24(null);
break;
}
}


synchronized public void waitMethod() throws IOException, InterruptedException, Exception{
	
while(true)
{

try
{

new PrintWriter("Program_Files/ledger_final.log").close();

wait(500);
setC1(new copyLatestSync());
setC1(null);
setC2(new copyLatest());
setC2(null);
setC3(new getChat());
setC3(null);
setC4(new getBlocks());
setC4(null);
setC5(new getPlayers());
setC5(null);
setC6(new blockLedger());
setC6(null);
setC7(new playerLedger());
setC7(null);

File file = new File("Program_Files/lastplayer.log");

if (file.exists() && file.length() != 0) 
{
setC8(new whoIs());
setC8(null);
}
file = null;

setC9(new reFormatLedger());
setC9(null);

try
{
File file79c = new File("Program_Files/mode.log");

if (file79c.exists() && file79c.length() !=0)
{
//setC10(new getTxs());
//setC10(null);
setC10(new TransactionProcessor());
setC10(null);
}
file79c = null;
}
catch (Exception e1790c){}

try
{
File file79b = new File("Program_Files/mode.log");

if (file79b.exists() && file79b.length() ==0)
{

new PrintWriter("Program_Files/lastblock.log").close();
}
file79b = null;
}
catch (Exception e1790b){}
new PrintWriter("Program_Files/otherplayerhash3.log").close();
break;
}
catch (Exception e9){
e9.printStackTrace();
}
break;
}
}


synchronized public void waitMethod2() throws IOException, InterruptedException, Exception{

wait(500);

try
{

while(true)
{

try
{
File file79 = new File("Program_Files/latestTxs.log");

if (file79.exists() && file79.length() !=0)
{
////System.out.println("");
////System.out.println("found a tx!");
setC11(new ProcessTxsB());
setC11(null);
}
file79 = null;
}
catch (Exception e1790){}

try
{
File file73 = new File("Program_Files/txPanel.log");

if (file73.exists() && file73.length() !=0)
{
setC25(new getPlayerInfo3());
setC25(null);
setC12a(new txPanel());
setC12a(null);
new PrintWriter("Program_Files/txPanel.log").close();
}
file73 = null;
}
catch (Exception e1790){}

try
{
File file731 = new File("Program_Files/lastblock.log");

if (file731.exists() && file731.length() !=0)
{



//For player version working from download directory and browser
String userDirectory = System.getProperty("user.home");
File fileToDelete = new File(userDirectory+"/Downloads/output.txt");

        if (fileToDelete.exists()) {
            if (fileToDelete.delete()) {
                //System.out.println("File deleted successfully: " + fileToDelete.getName());
            } else {
                //System.out.println("Failed to delete the file: " + fileToDelete.getName());
            }
        } else {
            //System.out.println("File does not exist: " + fileToDelete.getName());
        }



//For player version working from download directory and browser
File fileToDelete2 = new File(userDirectory+"/Downloads/output(1).txt");

        if (fileToDelete2.exists()) {
            if (fileToDelete2.delete()) {
                //System.out.println("File deleted successfully: " + fileToDelete2.getName());
            } else {
                //System.out.println("Failed to delete the file: " + fileToDelete2.getName());
            }
        } else {
            //System.out.println("File does not exist: " + fileToDelete2.getName());
        }


//For player version working from download directory and browser
File fileToDelete3 = new File(userDirectory+"/Downloads/output(2).txt");

        if (fileToDelete3.exists()) {
            if (fileToDelete3.delete()) {
                //System.out.println("File deleted successfully: " + fileToDelete3.getName());
            } else {
                //System.out.println("Failed to delete the file: " + fileToDelete3.getName());
            }
        } else {
            //System.out.println("File does not exist: " + fileToDelete3.getName());
        }



////////////////////////////////
setC30(new backupLedger());
setC30(null);
////////////////////////////////

setC12(new updateBlockBal());
setC12(null);
setC13(new makeLedger());
setC13(null);
//setC14(new top100());
//setC14(null);
setC14(new top5());
setC14(null);
new PrintWriter("ledger_KMC/ledger_current_HASH.log").close();
setC15(new hashLC());
setC15(null);
setC16(new reformatPI());
setC16(null);
new PrintWriter("ledger_KMC/player_info_HASH.log").close();
setC17(new hashPI());
setC17(null);
File ledgerCurrent = new File("ledger_KMC/ledger_current.txt");
long ledgerCurrentLength = ledgerCurrent.length();

if (ledgerCurrent.exists() && ledgerCurrentLength>=100000000)
{
setC18(new appendLHash());
setC18(null);
setC19(new buildLedger());
setC19(null);
new PrintWriter("ledger_KMC/ledger_current.txt").close();
ledgerCurrent = null;
}
new PrintWriter("ledger_KMC/ledgerhashes_HASH.log").close();
setC20(new hashLH());
setC20(null);

new PrintWriter("ledger_KMC/consensus_HASH.log").close();
setC21(new hashC());
setC21(null);
setC22(new appendCHash());
setC22(null);
file731 = null;
new PrintWriter("Program_Files/lastblock.log").close();

////Copy latestTxs4 to discordC.txt here for discord message

new PrintWriter("discordC.txt").close();
new PrintWriter("discordM.txt").close();

setC26(new copyTxs());
setC26(null);

setC31(new backupTxs());
setC31(null);

////Now copy lastblockledger + lastplayerledger + lastblockhash + discordC
//Not yet + consensus_HASH will append in hashC and move closing file there also

setC27(new discordM());
setC27(null);

////here change readySend.txt file for python so all file changes to be sent are complete

setC28(new readySend());
setC28(null);

new PrintWriter("Program_Files/latestTxs4.log").close();
}
}
catch (Exception e117){}
new PrintWriter("Program_Files/latestTxs.log").close();
new PrintWriter("Program_Files/latestTxs2.log").close();
new PrintWriter("Program_Files/latestTxs3.log").close();

////Here we read the discord output each loop to check for matching block consensus
////Write a "0" "synced.txt" and test for its existence.
////If the file has text, then it means the player needs to check output.txt for a matching hash
////When a player reads a single matching hash, they change unsynced to a "1"
////Every time a player sees a matching hash they increment "synced.txt"
////When "synced.txt" is 2 or greater, clear the file to indicate a matching consensus
//setC30(new backupLedger());
//setC30(null);

setC29(new CheckC4());
setC29(null);

////////////////////////////////
//write a file to indicate player needs to resync with last block
//include needed above methods to rebuild ledger

try
{
File file7312 = new File("Program_Files/resync.log");

if (file7312.exists() && file7312.length() !=0)
{
File file73121 = new File("Program_Files/latestTxs.log");

if (file73121.exists() && file73121.length() !=0)
{
setC11(new ProcessTxsB());
setC11(null);
}

setC30(new backupLedger());
setC30(null);
setC12(new updateBlockBal());
setC12(null);
setC13(new makeLedger());
setC13(null);
//setC14(new top100());
//setC14(null);
setC14(new top5());
setC14(null);
new PrintWriter("ledger_KMC/ledger_current_HASH.log").close();
setC15(new hashLC());
setC15(null);
setC16(new reformatPI());
setC16(null);
new PrintWriter("ledger_KMC/player_info_HASH.log").close();
setC17(new hashPI());
setC17(null);
File ledgerCurrent = new File("ledger_KMC/ledger_current.txt");
long ledgerCurrentLength = ledgerCurrent.length();

if (ledgerCurrent.exists() && ledgerCurrentLength>=100000000)
{
setC18(new appendLHash());
setC18(null);
setC19(new buildLedger());
setC19(null);
new PrintWriter("ledger_KMC/ledger_current.txt").close();
ledgerCurrent = null;
}
new PrintWriter("ledger_KMC/ledgerhashes_HASH.log").close();
setC20(new hashLH());
setC20(null);
new PrintWriter("ledger_KMC/consensus_HASH.log").close();
setC21(new hashC());
setC21(null);
setC22(new appendCHash());
setC22(null);
file7312 = null;
new PrintWriter("Program_Files/resync.log").close();
new PrintWriter("Program_Files/lastblock.log").close();
new PrintWriter("Program_Files/latestTxs4.log").close();
}
}
catch (Exception e91192){e91192.printStackTrace();}
break;
}
}
catch (Exception e9119){e9119.printStackTrace();}
}


synchronized public void waitMethod3() throws IOException, InterruptedException, Exception{

while(true)
{

try
{
setC23(new copySync());
setC23(null);
break;
}
catch (Exception e9119ab){e9119ab.printStackTrace();}
}
}


public static void main(String[] args)throws FileNotFoundException {

mode=0;

while(mode==0)
{
String folderPath = "Program_Files";
File newFolder = new File(folderPath);

String folderPath2 = "ledger_KMC";
File newFolder2 = new File(folderPath2);

try
{
newFolder.mkdir();
newFolder2.mkdir();

     File file = new File("privatekey.txt");
     File file2 = new File("latestcopy.log");
     File file3 = new File("localplayer.txt");
     File file4 = new File("Program_Files/latestchat.log");
     File file6 = new File("Program_Files/latestblocks.log");
     File file7 = new File("Program_Files/latestplayers.log");
     File file8 = new File("Program_Files/lastblock.log");
     File file9 = new File("Program_Files/lastblockledger.log");
     File file10 = new File("Program_Files/ledger_final.log");
     File file11 = new File("Program_Files/lastplayer.log");
     File file12 = new File("Program_Files/lastplayerledger.log");
     File file13 = new File("Program_Files/lastblockhash.log");
     File file14 = new File("Program_Files/otherplayerhash.log");
     File file15 = new File("Program_Files/otherplayerhash2.log");
     File file16 = new File("Program_Files/otherplayerhash3.log");
     File file17 = new File("Program_Files/latestcopy2.log");
     File file18 = new File("Program_Files/latestcopy3.log");
     File file19 = new File("Program_Files/lastledgerhash.log");
     File file20 = new File("Program_Files/ledger_formatted.log");
     File file21 = new File("Program_Files/hash.log");
     File file22 = new File("Program_Files/hash2.log");
     File file23 = new File("Program_Files/mode.log");
     File file24 = new File("ledger_KMC/ledger_current.txt");
     File file24a = new File("Program_Files/latest_block.log");
     File file24b = new File("latestcopyA.log");
     File file24c = new File("nextBlockLines.log");
     File file24d = new File("Program_Files/startloop.log");
     File file24e = new File("Program_Files/syncCopy.log");
     File file24f = new File("Program_Files/syncCopy2.log");
     File file24g = new File("Program_Files/startloop2.log");
File file581 = new File("Help.txt");
File file33aba = new File("ledger_KMC/player_info.log");
file.createNewFile();
file2.createNewFile();
file3.createNewFile();
file4.createNewFile();
file6.createNewFile();
file7.createNewFile();
file8.createNewFile();
file9.createNewFile();
file10.createNewFile();
file11.createNewFile();
file12.createNewFile();
file13.createNewFile();
file14.createNewFile();
file15.createNewFile();
file16.createNewFile();
file17.createNewFile();
file18.createNewFile();
file19.createNewFile();
file20.createNewFile();
file21.createNewFile();
file22.createNewFile();
file23.createNewFile();
file24.createNewFile();
file24a.createNewFile();
file24b.createNewFile();
file24c.createNewFile();
file24d.createNewFile();
file24e.createNewFile();
file24f.createNewFile();
file24g.createNewFile();
file581.createNewFile();
file33aba.createNewFile();
}
catch (IOException ex) {System.out.print("Invalid Path");}

    ////System.out.println("        ");
    ////System.out.println("~Welcome to TheKittyMine 0.6.9~");
    ////System.out.println("        ");
    ////System.out.println("       /\\             /\\       ");
    ////System.out.println("      /#^\\           / ^\\      ");
    ////System.out.println("     /#/ \\\\_________/ /*\\\\     ");
    ////System.out.println("    /#/   \\  ~~~~~~~~    \\\\     ");
    ////System.out.println("   (#           ~~~~       )    ");
    ////System.out.println("  (#   \\ -[(0)] --- [(0)]-\\ )   ");
    ////System.out.println(" (#                          )        ");
    ////System.out.println("(##    -------  \\`/   ----   )      PoW meets PoG");
    ////System.out.println(" (##  ---------      -------)     *   Bees cats dogs");
    ////System.out.println("  ###    ---   \\___   --- )    *       Kitties my fav");
    ////System.out.println("    ###                 )   *             But i luv em all");
    ////System.out.println("       ####          )          ");
    ////System.out.println("           ########            ");
    ////System.out.println("        ");

new PrintWriter("Program_Files/startloop.log").close();
new PrintWriter("Program_Files/startloop2.log").close();
new PrintWriter("Program_Files/mode.log").close();
new PrintWriter("Program_Files/latestblocks.log").close();
new PrintWriter("Program_Files/latestchat.log").close();
new PrintWriter("Program_Files/resync.log").close();
new PrintWriter("Program_Files/discordM.txt").close();
new PrintWriter("Program_Files/discordC.txt").close();
new PrintWriter("output.txt").close();

try
{
new helpMe();
}
catch (IOException e791212){e791212.printStackTrace();}

new PrintWriter("Program_Files/startloop2.log").close();

mode=1;

try
{
try
{
try
{
KMCoin object4 = new KMCoin();
object4.firstMethod();
object4=null;

}
catch(IOException tammy){};
}
catch(InterruptedException tammy1){};
}
catch(Exception tammy2){};

break;
}

{


while(mode==2)
{

}

while(mode==3)
{


try
{

File fileLoop2 = new File("Program_Files/startloop2.log");

if (fileLoop2.exists() && fileLoop2.length() !=0)
{

mode=3;

new syncPanel();
}

new PrintWriter("Program_Files/startloop2.log").close();
new PrintWriter("wallet_address.log").close();
new PrintWriter("player_balance.log").close();
new PrintWriter("player_blocks_mined.log").close();
new PrintWriter("player_txs.log").close();
new PrintWriter("Program_Files/mode.log").close();
new PrintWriter("Program_Files/startloop.log").close();
new PrintWriter("Program_Files/lastblock.log").close();
new PrintWriter("Program_Files/latestcopy.log").close();
new PrintWriter("Program_Files/lastblockhash.log").close();
new PrintWriter("Program_Files/lastblockledger.log").close();
new PrintWriter("Program_Files/lastledgerhash.log").close();
new PrintWriter("Program_Files/lastplayer.log").close();
new PrintWriter("Program_Files/lastplayerledger.log").close();
new PrintWriter("Program_Files/latest_block.log").close();
new PrintWriter("Program_Files/latestblock.log").close();
new PrintWriter("Program_Files/latestblocks.log").close();
new PrintWriter("Program_Files/latestchat.log").close();
new PrintWriter("Program_Files/latestplayers.log").close();
new PrintWriter("Program_Files/ledger_final.log").close();
new PrintWriter("Program_Files/ledger_formatted.log").close();
new PrintWriter("Program_Files/otherplayerhash.log").close();
new PrintWriter("Program_Files/syncCopy.log").close();
new PrintWriter("Program_Files/syncCopy2.log").close();
new PrintWriter("Program_Files/latestTxsA.log").close();
new PrintWriter("Program_Files/latestcopy.log").close();
new PrintWriter("Program_Files/latestcopyA.log").close();
new PrintWriter("../latest.log").close();
new PrintWriter("nextBlockLines.log").close();

}
catch (Exception e79121){e79121.printStackTrace();}
}

while(true)
{
try
{
File file691ab = new File("Program_Files/startloop.log");

if (file691ab.exists() && file691ab.length() !=0)
{

try
{
KMCoin object = new KMCoin();
object.waitMethod();object=null;
System.gc();
}
catch (InterruptedException e79){e79.printStackTrace();}
catch (IOException e80){}
catch (Exception e81){}

try
{
File file691 = new File("Program_Files/mode.log");

if (file691.exists() && file691.length() !=0)
{
KMCoin object2 = new KMCoin();
object2.waitMethod2();object2=null;
System.gc();
}
file691 = null;
}
catch (Exception e1101){}

}

else
{


try
{
File filetammy = new File("Program_Files/mode.log");

if (filetammy.exists() && filetammy.length() !=0)
{
KMCoin object3 = new KMCoin();
object3.waitMethod3();object3=null;
Thread.sleep(500);
System.gc();
}
}
catch(Exception tammy5){}

}
file691ab = null;
}
catch (Exception e1101ab){}

try
{
Thread.sleep(500);
}
catch(InterruptedException mara2){}

}


}


}


public copyLatestSync getC1() {
	return c1;
}


public void setC1(copyLatestSync c1) {
	this.c1 = c1;
}


public copyLatest getC2() {
	return c2;
}


public void setC2(copyLatest c2) {
	this.c2 = c2;
}


public getChat getC3() {
	return c3;
}


public void setC3(getChat c3) {
	this.c3 = c3;
}

public getBlocks getC4() {
	return c4;
}

public void setC4(getBlocks c4) {
	this.c4 = c4;
}

public getPlayers getC5() {
	return c5;
}

public void setC5(getPlayers c5) {
	this.c5 = c5;
}

public blockLedger getC6() {
	return c6;
}

public void setC6(blockLedger c6) {
	this.c6 = c6;
}

public playerLedger getC7() {
	return c7;
}

public void setC7(playerLedger c7) {
	this.c7 = c7;
}

public whoIs getC8() {
	return c8;
}

public void setC8(whoIs c8) {
	this.c8 = c8;
}
public reFormatLedger getC9() {
	return c9;
}

public void setC9(reFormatLedger c9) {
	this.c9 = c9;
}

public TransactionProcessor getC10() {
	return c10;
}

public void setC10(TransactionProcessor c10) {
	this.c10 = c10;
}

public ProcessTxsB getC11() {
	return c11;
}

public void setC11(ProcessTxsB c11) {
	this.c11 = c11;
}

public txPanel getC12a() {
	return c12a;
}

public void setC12a(txPanel c12a) {
	this.c12a = c12a;
}

public updateBlockBal getC12() {
	return c12;
}

public void setC12(updateBlockBal c12) {
	this.c12 = c12;
}

public makeLedger getC13() {
	return c13;
}

public void setC13(makeLedger c13) {
	this.c13 = c13;
}

//public top100 getC14() {
public top5 getC14() {
	return c14;
}

//public void setC14(top100 c14) {
public void setC14(top5 c14) {
	this.c14 = c14;
}

public hashLC getC15() {
	return c15;
}

public void setC15(hashLC c15) {
	this.c15 = c15;
}

public reformatPI getC16() {
	return c16;
}

public void setC16(reformatPI c16) {
	this.c16 = c16;
}

public hashPI getC17() {
	return c17;
}

public void setC17(hashPI c17) {
	this.c17 = c17;
}

public appendLHash getC18() {
	return c18;
}

public void setC18(appendLHash c18) {
	this.c18 = c18;
}

public buildLedger getC19() {
	return c19;
}

public void setC19(buildLedger c19) {
	this.c19 = c19;
}

public hashLH getC20() {
	return c20;
}

public void setC20(hashLH c20) {
	this.c20 = c20;
}

public hashC getC21() {
	return c21;
}

public void setC21(hashC c21) {
	this.c21 = c21;
}

public appendCHash getC22() {
	return c22;
}

public void setC22(appendCHash c22) {
	this.c22 = c22;
}

public copySync getC23() {
	return c23;
}

public void setC23(copySync c23) {
	this.c23 = c23;
}


public KMCoin2 getC24() {
	return c24;
}

public void setC24(KMCoin2 c24) {
	this.c24 = c24;
}


public getPlayerInfo3 getC25() {
	return c25;
}

public void setC25(getPlayerInfo3 c25) {
	this.c25 = c25;
}


public copyTxs getC26() {
	return c26;
}

public void setC26(copyTxs c26) {
	this.c26 = c26;
}

public discordM getC27() {
	return c27;
}

public void setC27(discordM c27) {
	this.c27 = c27;
}

public readySend getC28() {
	return c28;
}

public void setC28(readySend c28) {
	this.c28 = c28;
}

public CheckC4 getC29() {
	return c29;
}

public void setC29(CheckC4 c29) {
	this.c29 = c29;
}

public backupLedger getC30() {
	return c30;
}

public void setC30(backupLedger c30) {
	this.c30 = c30;
}

public backupTxs getC31() {
	return c31;
}

public void setC31(backupTxs c31) {
	this.c31 = c31;
}

public pythonCaller getC32() {
	return c32;
}

public void setC32(pythonCaller c32) {
	this.c32 = c32;
}

}