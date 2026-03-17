class Bird {
}

class FlyingBird extends Bird {
    void fly() {
        System.out.println("Flying...");
    }
}

class Sparrow extends FlyingBird {
}

class Ostrich extends Bird {
}

public class BirdLSP {
    public static void main(String[] args) {
        Sparrow s = new Sparrow();
        s.fly();
    }
}