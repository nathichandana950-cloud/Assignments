class Employeeinfo {
    String name;
    int salary;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
class Developer extends Employeeinfo {
}
class Manager extends Employeeinfo {
}
public class Employee {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.name = "Sriram";
        d.salary = 60000;
        d.displayDetails();
        Manager m = new Manager();
        m.name = "Karthik";
        m.salary = 50000;
        m.displayDetails();
        
    }
}
