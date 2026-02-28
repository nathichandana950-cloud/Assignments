import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWordsInFile {
    public static void main(String[] args) {
        
        int wordCount = 0;   
        
        try {
           
            FileReader fr = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(fr);
            
            String line;
            
            while ((line = br.readLine()) != null) {
                

                String[] words = line.split(" ");
 
                wordCount = wordCount + words.length;
            }
            
            br.close();  
            
            System.out.println("Total Words: " + wordCount);
            
        } catch (IOException e) {
            System.out.println("File not found or error reading file.");
        }
    }
}
