public class LoginAttempt {

    public static void main(String[] args) {

        int[] attempts = {1, 2, 4, 0, 5, 3};

        System.out.println("Checking login attempts...");

        for (int i = 0; i < attempts.length; i++) {
            if (attempts[i] > 3) {
                System.out.println("Alert: User " + (i + 1) + " has high login attempts (" + attempts[i] + ")");
            }
        }
    }
}
