interface PaymentMethod {
    void pay(double amount);
}
class UPIPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}
class CreditCardPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}
class NetBankingPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Net Banking");
    }
}
class PaymentFactory {
    static PaymentMethod getPayment(String type) {
        if (type.equalsIgnoreCase("UPI"))
            return new UPIPayment();
        else if (type.equalsIgnoreCase("CARD"))
            return new CreditCardPayment();
        else if (type.equalsIgnoreCase("NET"))
            return new NetBankingPayment();
        else
            return null;
    }
}
public class Gateway {
    public static void main (String[] args) {

        String type = "UPI";        
        double amount = 1000;

        PaymentMethod payment = PaymentFactory.getPayment(type);

        if (payment != null) {
            payment.pay(amount);
            System.out.println("Transaction Successful");
        } else {
            System.out.println("Invalid Payment Method");
        }
    }
}

