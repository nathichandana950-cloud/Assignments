import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Append {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("sample.txt", true);
        // true = append mode

        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("New Appended Line");
        bw.newLine();

        bw.close();

        System.out.println("Data appended successfully.");
    }
}
