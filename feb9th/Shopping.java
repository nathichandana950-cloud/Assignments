import java.util.ArrayList;

class Product {
    String name;
    double price;

    Product(String n, double p) {
        name = n;
        price = p;
    }
}

public class Shopping {
    public static void main(String[] args) {
        ArrayList<Product> cart = new ArrayList<>();

        cart.add(new Product("Ice Cream", 50));
        cart.add(new Product("Chocolate", 30));
        cart.add(new Product("Chips", 20));

        double total = 0;
        for (Product p : cart) {
            System.out.println(p.name + " : " + p.price + "/-");
            total += p.price;
        }

        System.out.println("Total: " + total+"/-");
    }
}

