package Sept19;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(7, 3, "orange");
//        System.out.println("Area: " + r.area());
//        System.out.println("Perimeter: " + r.perimeter());
//        System.out.println(r);
        Rectangle.Square sq = new Rectangle.Square(5, "blue");
//        System.out.println("Area: " + sq.area()); // 25
//        System.out.println("Perimeter: " + sq.perimeter()); //20
        List<Shape> shapes = new ArrayList<>();
        shapes.add(r);
        shapes.add(sq);
        shapes.add(new Circle(4, "orange"));
        for (Shape s : shapes) {
            System.out.println(s.area());
        }
    }
}
