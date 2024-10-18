abstract class Shape {
    public String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public abstract double area();

    public String toString()
    {
        return "\nname of the shape: " + shapeName;
    }
}

