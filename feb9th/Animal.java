class Animals {
    void makeSound() {
        System.out.println("Animal sound");
    }
}
class Dog extends Animals {
    @Override
    void makeSound() {
        System.out.println("Dog says: Woof");
    }
}
class Cat extends Animals {
    @Override
    void makeSound() {
        System.out.println("Cat says: Meow");
    }
}
public class Animal {
    public static void main(String[] args) {
        Animals a1 = new Dog();
        Animals a2 = new Cat(); 
        a1.makeSound();
        a2.makeSound();
    }
}

