import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.io.*; 

public class TransactionProcessor {

    //This gets from python discord bot
    //private static final String INPUT_FILE = "outputTx.txt";

////This gets from discord COM bookmarklet
//String userDirectory = System.getProperty("user.home");
//private final String INPUT_FILE = userDirectory+"/Downloads/outputTx.txt";

//This is to use Minecraft chat
private final String INPUT_FILE = "latestcopy.log";







    private static final String OUTPUT_FILE = "Program_Files/latestTxs.log";


    //////This is removed for Minecraft Txs (changed to "")
    private static final String LOG_PREFIX = "";
    //private static final String LOG_PREFIX = "[00:00:00] [Render thread/INFO]: [CHAT] ";
    
    // Transaction markers that must all be present
    private static final String[] TRANSACTION_MARKERS = {"$", "~", "%", ";", ",", "_", "&"};
    
    public TransactionProcessor() throws IOException {
        processTransactions();
    }
    
    /**
     * Process transactions from input file and write valid ones to output file
     */
    private void processTransactions() throws IOException {
        Path inputPath = Paths.get(INPUT_FILE);
        Path outputPath = Paths.get(OUTPUT_FILE);
        
        // Check if input file exists
        if (!Files.exists(inputPath)) {
            //System.err.println("Input file not found: " + INPUT_FILE);
            return;
        }
        
        try {
            // Ensure output directory exists
            Files.createDirectories(outputPath.getParent());
            
            // Read all lines from input file
            List<String> lines = Files.readAllLines(inputPath);
            
            // Process each line
            StringBuilder output = new StringBuilder();
            for (String line : lines) {
                if (isValidTransaction(line)) {
                    String formattedLine = LOG_PREFIX + line + System.lineSeparator();
                    output.append(formattedLine);
                    System.out.println("Found a tx = " + line);
                }
            }
            
            // Write all valid transactions to output file
            if (output.length() > 0) {
                Files.write(outputPath, output.toString().getBytes(), 
                           StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            }
            
        } catch (IOException e) {
            System.err.println("Error processing transactions: " + e.getMessage());
            throw e;
        } finally {
            // Clear the input file
            clearInputFile();
        }
    }
    
    /**
     * Check if a line contains all required transaction markers
     */
    private boolean isValidTransaction(String line) {
        if (line == null || line.trim().isEmpty()) {
            return false;
        }
        
        // Check if line contains all required markers
        for (String marker : TRANSACTION_MARKERS) {
            if (!line.contains(marker)) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Clear the input file contents
     */
private void clearInputFile() {

//File fileToDelete = new File(userDirectory+"/Downloads/outputTx.txt");

//        if (fileToDelete.exists()) {
//            if (fileToDelete.delete()) {
//                //System.out.println("File deleted successfully: " + fileToDelete.getName());
//            } else {
//                //System.out.println("Failed to delete the file: " + fileToDelete.getName());
//            }
//        } else {
//            //System.out.println("File does not exist: " + fileToDelete.getName());
//        }

}


   // private void clearInputFile() {
        //try {
            //new PrintWriter(userDirectory+"/Downloads/outputTx.txt").close();
            //Path inputPath = Paths.get(INPUT_FILE);
            //Files.write(inputPath, new byte[0], 
            //           StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
       // } catch (IOException e) {
      //      System.err.println("Warning: Could not clear input file: " + e.getMessage());
      //  }
  //  }
}