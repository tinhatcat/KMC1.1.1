import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;

public class getFirstBlock {
    
    // Pattern to match 64-character hexadecimal string
    private static final Pattern HEX_PATTERN = Pattern.compile("^[a-fA-F0-9]{64}$");
    


public getFirstBlock(){

try
{
gFB();
}
catch (Exception e311){}
}


    public void gFB() {
try {
            // Read the target player name from localplayer.txt (remove leading space)
            String targetPlayer = Files.readString(Paths.get("localplayer.txt")).trim();
            if (targetPlayer.startsWith(" ")) {
                targetPlayer = targetPlayer.substring(1);
            }
            
            if (targetPlayer.isEmpty()) {
                System.out.println("No player name found in localplayer.txt");
                return;
            }
            
            // Read the entire ledger file as a single string
            String data = Files.readString(Paths.get("ledger_KMC/ledger_current.txt"));
            
            if (data == null || data.trim().isEmpty()) {
                System.out.println("Player has not minted their private key with a valid hash");
                return;
            }
            
            // Split the data by spaces to get all tokens
            String[] tokens = data.trim().split("\\s+");
            
            // Process tokens to find block-playername-hash pattern for our target player
            for (int i = 0; i < tokens.length - 2; i++) {
                String potentialBlock = tokens[i];
                String potentialPlayerName = tokens[i + 1];
                String potentialHash = tokens[i + 2];
                
                // Check if this is our target player and has a valid hash
                if (potentialPlayerName.equals(targetPlayer) && 
                    HEX_PATTERN.matcher(potentialHash).matches()) {
                    // Valid condition met - write block to file
                    writeBlockToFile(potentialBlock);
                    return; // Exit immediately after first successful write
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        
        // If we reach here, no valid hash was found
        System.out.println("Player has not minted their private key with a valid hash");
    }
    
    private void writeBlockToFile(String block) {
        try (FileWriter writer = new FileWriter("first_block_mined.log", false)) { // false = overwrite
            writer.write(block);
            System.out.println("First block mined written to file: " + block);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
