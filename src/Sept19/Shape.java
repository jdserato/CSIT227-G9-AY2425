package Sept19;

public abstract class Shape {
    String color;
    public Shape(String color) {
        this.color = color;
    }
    public abstract double perimeter();
    public abstract double area();

    @Override
    public String toString() {
        return "A shape that is color " + color;
    }
}
