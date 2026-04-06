public class UserLoginTracker {

    private static int totalLogins = 0;

    private String sessionId;

    public UserLoginTracker(String sessionId) {
        this.sessionId = sessionId;
        totalLogins++; 
        System.out.println("User logged in with session: " + this.sessionId);
        System.out.println("Total logins so far: " + totalLogins);
        System.out.println("---------------------------");
    }
    public void displayUser() {
        System.out.println("Session Id: " +sessionId);
    }

    public static void main(String[] args) {

        UserLoginTracker user1 = new UserLoginTracker("S001");
        UserLoginTracker user2 = new UserLoginTracker("S002");
        UserLoginTracker user3 = new UserLoginTracker("S003");

        user1.displayUser();
        user2.displayUser();
        user3.displayUser();

    }
}


