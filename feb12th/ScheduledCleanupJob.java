import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
class CleanupTask implements Runnable {

    public void run() {
        System.out.println(
            "Cleaning temporary files by " +
            Thread.currentThread().getName()
        );
    }
}


public class ScheduledCleanupJob {

    public static void main(String[] args) {

        ScheduledExecutorService scheduler =
                Executors.newScheduledThreadPool(1);

        CleanupTask task = new CleanupTask();

        scheduler.scheduleAtFixedRate(
                task,      // task to run
                0,         // initial delay
                5,         // period
                TimeUnit.SECONDS
        );
        try {
            Thread.sleep(20000);
        } catch (Exception e) {
            System.out.println(e);
        }

        scheduler.shutdown();
        System.out.println("Cleanup job stopped.");
    }
}
