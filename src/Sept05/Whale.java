package Sept05;

public class Whale extends Mammal implements Swimmer{
    public Whale(String name, int age) {
        super(name, age);
    }

    @Override
    void talk() {
        System.out.println("wwwWWWwwwwwwwwww imma whale");
    }

    public void swim() {
        System.out.println("Whale is zwimming");
        System.out.println("Breathe by going to the surface sometimez");
    }
}
