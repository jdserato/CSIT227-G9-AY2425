package Sept19;

public class Circle extends Shape{
    double radius;
    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
