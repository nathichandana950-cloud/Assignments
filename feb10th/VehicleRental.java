import java.util.*;
abstract class Vehicle {
    int id;
    String name;

    Vehicle(int id, String name) {
        this.id = id;
        this.name = name;
    }

    abstract double getRent();   
}
class Car extends Vehicle {
    Car(int id) {
        super(id, "Car");
    }

    double getRent() {
        return 1000;
    }
}
class Bike extends Vehicle {
    Bike(int id) {
        super(id, "Bike");
    }

    double getRent() {
        return 500;
    }
}
class Truck extends Vehicle {
    Truck(int id) {
        super(id, "Truck");
    }

    double getRent() {
        return 2000;
    }
}

class RentalSystem {
    ArrayList<Vehicle> vehicles = new ArrayList<>();

    void addVehicle(Vehicle v) {
        vehicles.add(v);
    }

    synchronized void rentVehicle(int id) {   
        for (Vehicle v : vehicles) {
            if (v.id == id) {
                System.out.println(Thread.currentThread().getName() +
                        " rented " + v.name + " | Price: " + v.getRent());
                return;
            }
        }
        System.out.println("Vehicle not found");
    }
}
class BookingThread extends Thread {
    RentalSystem rs;
    int vehicleId;

    BookingThread(RentalSystem rs, int vehicleId) {
        this.rs = rs;
        this.vehicleId = vehicleId;
    }

    public void run() {
        rs.rentVehicle(vehicleId);
    }
}
public class VehicleRental {
    public static void main(String[] args) {

        RentalSystem rs = new RentalSystem();

        rs.addVehicle(new Car(1));
        rs.addVehicle(new Bike(2));
        rs.addVehicle(new Truck(3));
        BookingThread t1 = new BookingThread(rs, 1);
        BookingThread t2 = new BookingThread(rs, 2);

        t1.start();
        t2.start();
    }
}
