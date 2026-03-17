import java.io.*;

public class Merge{
    public static void main(String[] args) throws Exception {

        BufferedReader br1 = new BufferedReader(new FileReader("file.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("merged.txt"));

        String line;

        while ((line = br1.readLine()) != null) {
            bw.write(line);
            bw.newLine();
        }

        while ((line = br2.readLine()) != null) {
            bw.write(line);
            bw.newLine();
        }

        br1.close();
        br2.close();
        bw.close();

        System.out.println("Files merged successfully");
    }
}