public class LogAnalyzer {
    public static void main(String[] args) {

        String logs ="INFO Application started\n" +
                "ERROR Database not found\n" +
                "INFO User logged in\n" +
                "ERROR Connection failed\n" +
                "ERROR Timeout occurred";

        int count = 0;

        String[] lines = logs.split("\n");   

        for (int i = 0; i < lines.length; i++) {
            if (lines[i].contains("ERROR")) {
                count++;
            }
        }

        System.out.println("ERROR count = " + count);
    }
}
