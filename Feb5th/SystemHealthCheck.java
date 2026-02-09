public class SystemHealthCheck {

    public static void main(String[] args) {

        double cpuUsed = 65;
        double cpuTotal = 100;

        double memoryUsed = 7800;   
        double memoryTotal = 16000; 

        double cpuUsagePercent = (cpuUsed / cpuTotal) * 100;
        double memoryUsagePercent = (memoryUsed / memoryTotal) * 100;

        System.out.println("CPU Usage: " + cpuUsagePercent + "%");
        System.out.println("Memory Usage: " + memoryUsagePercent + "%");

        String cpuStatus = cpuUsagePercent < 80 ? "HEALTHY" : "CRITICAL";
        String memoryStatus = memoryUsagePercent < 80 ? "HEALTHY" : "CRITICAL";

        System.out.println("CPU Status: " + cpuStatus);
        System.out.println("Memory Status: " + memoryStatus);
    }
}
