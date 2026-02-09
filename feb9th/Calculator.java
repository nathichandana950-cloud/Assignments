class Calculatortest {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
}
public class Calculator {
    public static void main(String[] args) {
        Calculatortest calc = new Calculatortest();

        System.out.println("Add 2 ints: " + calc.add(5, 10));
        System.out.println("Add 2 doubles: " + calc.add(5.5, 3.3));
        System.out.println("Add 3 ints: " + calc.add(1, 2, 3));
    }
}
