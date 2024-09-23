package Aug22;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 5;
        p1.y = 7;
        Point p2 = p1;
        p2.x = p1.y;
        p2.y = p1.x - 4;
        System.out.println(p1.x + " and " + p1.y);
        System.out.println(p2.x + " and " + p2.y);
    }

    public static void display() {
        System.out.print("I love programming");
    }
}