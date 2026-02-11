import java.util.*;

class Product {
    private int id;
    private String name;
    private int stock;

    Product(int id, String name, int stock) {
        this.id = id;
        this.name = name;
        if (stock >= 0)
            this.stock = stock;
        else
            this.stock = 0;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getStock() { return stock; }

    public void setStock(int stock) {
        if (stock >= 0)
            this.stock = stock;
        else
            System.out.println("Stock cannot be negative");
    }

    public String toString() {
        return id + " " + name + " " + stock;
    }
}

public class InventoryManagement {

    static Map<Integer, Product> map = new HashMap<>();

    static void addProduct(Product p) {
        map.put(p.getId(), p);
        System.out.println("Added");
    }

    static void searchProduct(int id) {     // Overloading
        if (map.containsKey(id))
            System.out.println(map.get(id));
        else
            System.out.println("Not Found");
    }

    static void searchProduct(String name) {  // Overloading
        for (Product p : map.values()) {
            if (p.getName().equalsIgnoreCase(name)) {
                System.out.println(p);
                return;
            }
        }
        System.out.println("Not Found");
    }

    static void updateStock(int id, int stock) {
        if (map.containsKey(id))
            map.get(id).setStock(stock);
        else
            System.out.println("Not Found");
    }

    static void deleteProduct(int id) {
        map.remove(id);
        System.out.println("Deleted");
    }

    static void report() {
        for (Product p : map.values())
            System.out.println(p);
    }

    public static void main(String[] args) {

        addProduct(new Product(1, "Laptop", 10));
        addProduct(new Product(2, "Mouse", 20));

        updateStock(1, 8);

        searchProduct(1);        // search by id
        searchProduct("Mouse");  // search by name

        report();

        deleteProduct(2);
    }
}
