package Sept05;

public class Bird extends Animal implements EggLaying{
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void talk() {
        System.out.println("tweet tweet");
    }

    @Override
    public void layEggs() {
        System.out.println("hard eggs");
    }
}
