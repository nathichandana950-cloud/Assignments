import java.io.FileReader;
import java.io.IOException;

public class Checked {

    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("abc.txt");
            System.out.println("File opened successfully");
            file.close();
        } 
        catch (IOException e) {
            System.out.println("Checked Exception handled");
        }
    }
}
