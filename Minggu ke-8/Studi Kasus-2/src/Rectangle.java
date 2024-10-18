import org.w3c.dom.UserDataHandler;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double l, double w) {
        super("Sphere");
        length = l;
        width = w;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public String toString() {
        return super.toString() + " ,length: " + length + " ,width: " + width;
    }
}
