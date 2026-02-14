class EmailThread extends Thread {

    public void run() {
        try {
            System.out.println("Email sending started...");
            Thread.sleep(3000);
            System.out.println("Email sent successfully!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
public class EmailNotification {
    public static void main(String[] args) {

        System.out.println("Order placed successfully!");

        EmailThread email = new EmailThread();
        email.start();

        System.out.println("Order confirmation shown to user.");
    }
}
