import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class HighLoadSimulation {

    public static void main(String[] args) throws InterruptedException {

        int totalRequests = 100;
        int poolSize = 10;

        ExecutorService executor = Executors.newFixedThreadPool(poolSize);
        long startTime = System.currentTimeMillis();

        for (int i = 1; i <= totalRequests; i++) {
            int requestNumber = i;

            executor.submit(() -> {
                System.out.println(
                    "Processing request " + requestNumber +
                    " by " + Thread.currentThread().getName()
                );

                try {
                    Thread.sleep(100); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        executor.shutdown();

        executor.awaitTermination(1, TimeUnit.MINUTES);

        long endTime = System.currentTimeMillis();

        System.out.println("Total Time Taken: " + (endTime - startTime) + " ms");
    }
}
