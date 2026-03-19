interface Payment {
    void pay();
}


class UPI implements Payment {
    public void pay() {
        System.out.println("Paying using UPI...");
    }
}


class Card implements Payment {
    public void pay() {
        System.out.println("Paying using Card...");
    }
}

public class OCP {

    public static void main(String[] args) {


        Payment payment = new UPI();
        payment.pay();

        payment = new Card();
        payment.pay();
    }
}