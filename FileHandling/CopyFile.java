import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("destination.txt"));

        String line;

        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();   // move to next line
        }

        br.close();
        bw.close();

        System.out.println("File copied successfully");
    }
}