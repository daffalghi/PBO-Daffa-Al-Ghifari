public class TestSquare {
    public static void main(String[] args) {
        // Test Square class
        Square square = new Square(3.0, "purple", true);
        System.out.println(square);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());

        // Change side length
        square.setLength(4.0);
        System.out.println(square);
        System.out.println("New Area: " + square.getArea());
        System.out.println("New Perimeter: " + square.getPerimeter());
    }
}
