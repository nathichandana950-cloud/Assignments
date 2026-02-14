import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class FileTask implements Runnable {

    String fileName;

    FileTask(String fileName) {
        this.fileName = fileName;
    }

    public void run() {
        System.out.println(
            "Processing " + fileName +
            " by " + Thread.currentThread().getName()
        );

        try {
            Thread.sleep(3000); // simulate file processing
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(fileName + " processing completed");
    }
}


public class Parallelfile {

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(5);
        for (int i = 1; i <= 5; i++) {
            FileTask task = new FileTask("File-" + i);
            service.submit(task);
        }
        service.shutdown();
    }
}
