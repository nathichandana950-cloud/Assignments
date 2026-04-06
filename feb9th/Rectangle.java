class RectangleShape {
    int length;
    int width;
    RectangleShape(int len, int w) {
        length = len;
        width = w;
    }
    int Area() {
        return length * width;
    }
}
public class Rectangle {
    public static void main(String[] args) {
        RectangleShape r = new RectangleShape(8, 4);
        int area = r.Area();
        System.out.println("Area of Rectangle: " + area);
    }
}

