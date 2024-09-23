package Sept05;

public class Fish extends Animal implements Swimmer, EggLaying {
    public void swim() {
        System.out.println(name + " is swimming");
    }

    @Override
    void talk() {
        System.out.println(name+": bloop bloop bloop");
    }

}
