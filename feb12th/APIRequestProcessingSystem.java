import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class ApiTask implements Runnable {
    int requestId;

    ApiTask(int id) {
        this.requestId = id;
    }

    public void run() {
        System.out.println("API Request " + requestId + " handled by " + Thread.currentThread().getName());

        try {
            Thread.sleep(2000); 
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
public class APIRequestProcessingSystem {

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(5);

        for (int i = 1; i <= 20; i++) {
            ApiTask task = new ApiTask(i);
            service.submit(task);
        }

        service.shutdown();
    }
}
