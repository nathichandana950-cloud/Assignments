import java.io.*;

public class CountLines {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        int count = 0;

        while (br.readLine() != null) {
            count++;
        }

        br.close();

        System.out.println("Total Lines: " + count);
    }
}