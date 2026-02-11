import java.util.*;
interface Product {
    int getPrice();
}
class Electronics implements Product {
    int price;
    Electronics(int p) {
        price = p;
    }
    public int getPrice() {
        return price;
    }
}
class Clothing implements Product {
    int price;
    Clothing(int p) {
        price = p;
    }
    public int getPrice() {
        return price;
    }
}
class Groceries implements Product {
    int price;
    Groceries(int p) {
        price = p;
    }
    public int getPrice() {
        return price;
    }
}
interface DiscountStrategy {
    int applyDiscount(int total);
}
class FlatDiscount implements DiscountStrategy {
    public int applyDiscount(int total) {
        return total - 100;
    }
}
class Cart {
    ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product p) {
        products.add(p);
    }

    int getTotal() {
        return products.stream()
                       .mapToInt(p -> p.getPrice())
                       .sum();
    }
}
public class ECommerce {
    public static void main(String[] args) {

        Cart cart = new Cart();

        cart.addProduct(new Electronics(1000));
        cart.addProduct(new Clothing(500));
        cart.addProduct(new Groceries(300));

        int total = cart.getTotal();

        DiscountStrategy discount = new FlatDiscount();
        int finalAmount = discount.applyDiscount(total);

        System.out.println("Total = " + total);
        System.out.println("After Discount = " + finalAmount);
    }
}

