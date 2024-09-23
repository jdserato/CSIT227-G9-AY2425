package Sept19;

public class Rectangle extends Shape{
    private double length, width;
    public Rectangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }
    @Override
    public double perimeter() {
        return 2 * length + 2 * width;
    }
    @Override
    public double area() {
        return length * width;
    }

    @Override
    public String toString() {
        return super.toString() + " that is a Rectangle";
    }

    public static class Square extends Rectangle {
        public Square(double side, String color) {
            super(side, side, color);
        }

        @Override
        public String toString() {
            return super.toString() + " and is also a Square";
        }
    }
}
