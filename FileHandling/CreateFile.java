import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {

        File file = new File("sample.txt");

        if (file.exists()) {
            System.out.println("File already exists.");
        } else {
            file.createNewFile(); 
            System.out.println("File created successfully.");
        }

        System.out.println("File Path: " + file.getAbsolutePath());

        System.out.println("File Size: " + file.length() + " bytes");
    }
}