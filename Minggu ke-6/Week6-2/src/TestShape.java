public class TestShape {
    public static void main(String[] args) {
        // Testing Shape
        Shape shape = new Shape();
        System.out.println(shape);
        shape.setColor("red");
        shape.setFilled(false);
        System.out.println(shape);

        // Testing Circle
        Circle circle = new Circle(2.5);
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        // Testing Rectangle
        Rectangle rectangle = new Rectangle(3.0, 4.0);
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        // Testing Square
        Square square = new Square(5.0);
        System.out.println(square);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());

        // Testing setters on Square
        square.setLength(6.0);
        System.out.println(square);
    }
}
