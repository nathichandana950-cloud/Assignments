import java.lang.reflect.*;
class Logger {
    private static Logger instance = new Logger();

    private Logger() {}

    public static Logger getInstance() {
        return instance;
    }

    public void log(String msg) {
        System.out.println(msg);
    }
}

interface Service {
    void execute();
}
class OrderService implements Service {
    public void execute() {
        System.out.println("Order Service Executed");
    }
}

class UserService implements Service {
    public void execute() {
        System.out.println("User Service Executed");
    }
}

public class MiniFramework {

    public static void main(String[] args) throws Exception {

        Service[] services = {
            new OrderService(),
            new UserService()
        };

        for (Service service : services) {
            Method method = service.getClass().getMethod("execute");

            long start = System.currentTimeMillis();
            method.invoke(service);
            long end = System.currentTimeMillis();

            Logger.getInstance()
                  .log("Execution Time: " + (end - start) + " ms");
        }
    }
}
