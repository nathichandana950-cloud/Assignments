class TicketBooking {

    int tickets = 10;   

    void bookTicket(int count) {

        if (tickets >= count) {
            System.out.println(Thread.currentThread().getName()
                    + " booked " + count + " tickets");

            tickets = tickets - count;

            System.out.println("Remaining tickets: " + tickets);
        } else {
            System.out.println(Thread.currentThread().getName()
                    + " not enough tickets");
        }
    }
}

class User extends Thread {

    TicketBooking booking;

    User(TicketBooking booking, String name) {
        this.booking = booking;
        setName(name);
    }

    public void run() {
        booking.bookTicket(3);
    }
}

public class TicketBookingSystem {

    public static void main(String[] args) {

        TicketBooking booking = new TicketBooking();

        new User(booking, "User-1").start();
        new User(booking, "User-2").start();
        new User(booking, "User-3").start();
        new User(booking, "User-4").start();
        new User(booking, "User-5").start();
    }
}
