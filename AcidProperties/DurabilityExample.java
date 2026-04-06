import java.io.*;

class DurabilityExample {
    public static void main(String[] args) throws Exception {

        FileWriter fw = new FileWriter("data.txt");
        fw.write("Transaction Successful");
        fw.close();

        System.out.println("Data Saved Permanently in File");
    }
}