import java.io.*;
import java.util.Scanner;

public class SearchWord {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word = sc.nextLine();

        BufferedReader br = new BufferedReader(new FileReader("data.txt"));

        String line;
        int lineNo = 0;

        while ((line = br.readLine()) != null) {
            lineNo++;

            if (line.contains(word)) {
                System.out.println("Found at line: " + lineNo);
            }
        }

        br.close();
        sc.close();
    }
}