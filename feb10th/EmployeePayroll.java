import java.util.*;
interface Employee {
    double calculateSalary();
    String getName();
}
class FullTimeEmployee implements Employee {
    String name;
    double monthlySalary;

    FullTimeEmployee(String name, double salary) {
        this.name = name;
        this.monthlySalary = salary;
    }

    public double calculateSalary() {
        return monthlySalary;
    }

    public String getName() {
        return name;
    }
}
class PartTimeEmployee implements Employee {
    String name;
    double hourlyPay;
    int hours;

    PartTimeEmployee(String name, double pay, int hours) {
        this.name = name;
        this.hourlyPay = pay;
        this.hours = hours;
    }

    public double calculateSalary() {
        return hourlyPay * hours;
    }

    public String getName() {
        return name;
    }
}
class ContractEmployee implements Employee {
    String name;
    double contractAmount;

    ContractEmployee(String name, double amount) {
        this.name = name;
        this.contractAmount = amount;
    }

    public double calculateSalary() {
        return contractAmount;
    }

    public String getName() {
        return name;
    }
}
class PayrollSystem {
    List<Employee> employees = new ArrayList<>();

    void addEmployee(Employee e) {
        employees.add(e);
    }

    void generateReport() {
        for (Employee e : employees) {
            System.out.println(
                e.getName() + " Salary = " + e.calculateSalary()
            );
        }
    }
}
public class EmployeePayroll {
    public static void main(String[] args) {

        PayrollSystem payroll = new PayrollSystem();

        payroll.addEmployee(new FullTimeEmployee("Ram", 30000));
        payroll.addEmployee(new PartTimeEmployee("Sita", 200, 50));
        payroll.addEmployee(new ContractEmployee("John", 40000));

        payroll.generateReport();
    }
}

