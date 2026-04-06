interface Shape {
    double Area();
}
class Circle implements Shape {
    double radius;
    Circle(double r) {
        radius = r;
    }
    public double Area() {
        return 3.14 * radius * radius;
    }
}
class Square implements Shape {
    double side;
    Square(double s) {
        side = s;
    }
    public double Area() {
        return side * side;
    }
}
public class ShapeArea {
    public static void main(String[] args) {
        Shape c = new Circle(5);  
        Shape s = new Square(4); 

        System.out.println("Area of Circle: " + c.Area());
        System.out.println("Area of Square: " + s.Area());
    }
}

