interface MyInterface {

    static void greet() {
        System.out.println("Hello Students");
    }
}

public class StaticMain {
    public static void main(String[] args) {

        MyInterface.greet();
    }
}
