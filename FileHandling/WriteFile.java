import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("sample.txt"); 

        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Hello Java");
        bw.newLine();
        bw.write("File Handling Example");
        bw.newLine();
        bw.write("Line 3");
        bw.newLine();
        bw.write("Line 4");
        bw.newLine();
        bw.write("Line 5");

        bw.close(); 

        System.out.println("Data written successfully.");
    }
}
