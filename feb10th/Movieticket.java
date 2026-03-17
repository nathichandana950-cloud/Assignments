class Theatre {
    int regularSeats = 2;
    int vipSeats = 1;

    synchronized void book(String user, String category) {
        if (category.equalsIgnoreCase("Regular")) {
            if (regularSeats > 0) {
                regularSeats--;
                System.out.println(user + " booked Regular seat. Seats left: " + regularSeats);
            } else {
                System.out.println(user + " - No Regular seats available");
            }
        } else if (category.equalsIgnoreCase("VIP")) {
            if (vipSeats > 0) {
                vipSeats--;
                System.out.println(user + " booked VIP seat. Seats left: " + vipSeats);
            } else {
                System.out.println(user + " - No VIP seats available");
            }
        } else {
            System.out.println(user + " - Invalid category");
        }
    }
}

class User extends Thread {
    Theatre theatre;
    String name;
    String category;

    User(Theatre t, String name, String category) {
        theatre = t;
        this.name = name;
        this.category = category;
    }

    public void run() {
        theatre.book(name, category);
    }
}

public class Movieticket {
    public static void main(String[] args) {
        Theatre t = new Theatre();

        new User(t, "Alice", "Regular").start();
        new User(t, "Bob", "Regular").start();
        new User(t, "Charlie", "VIP").start();
        new User(t, "David", "VIP").start();
    }
}
