import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class ReportTask implements Callable<String> {

    private String reportName;

    ReportTask(String reportName) {
        this.reportName = reportName;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return reportName + " generated successfully";
    }
}

public class ParallelReportGenerator {

    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Callable<String>> tasks = new ArrayList<>();

        tasks.add(new ReportTask("Sales Report"));
        tasks.add(new ReportTask("Employee Report"));
        tasks.add(new ReportTask("Finance Report"));
        tasks.add(new ReportTask("Attendance Report"));
        tasks.add(new ReportTask("Performance Report"));

        List<Future<String>> results = executor.invokeAll(tasks);

        System.out.println("----- Report Summary -----");
        for (Future<String> result : results) {
            System.out.println(result.get());
        }

        executor.shutdown();
    }
}
