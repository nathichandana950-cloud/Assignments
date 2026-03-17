class Engine {
    String type;

    Engine(String t) {
        type = t;
    }
}
class Car {
    String brand;
    Engine engine; 

    Car(String b, Engine e) {
        brand = b;
        engine = e;
    }
    void displayDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Engine Type: " + engine.type);
    }
}
public class Vehicle {
    public static void main(String[] args) {
        Engine e = new Engine("V6");
        Car c = new Car("Tata", e);

        c.displayDetails();
    }
}
