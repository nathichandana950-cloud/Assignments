@FunctionalInterface
interface MyInterface {
    void show();
}

public class TestLambda {
    public static void main(String[] args) {

        MyInterface obj = () -> {
            System.out.println("Hello Java 8");
        };

        obj.show();
    }
}
