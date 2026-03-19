import java.io.IOException;

public class Throws {

    static void check() throws IOException {
        throw new IOException("File error");
    }

    public static void main(String[] args) {

        try {
            check();
        } 
        catch (IOException e) {
            System.out.println("Exception handled using throws");
        }
    }
}
