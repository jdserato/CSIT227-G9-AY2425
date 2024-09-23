package Sept05;

public class Cat extends Mammal {

    public void meow() {
        System.out.println(name + " says Meow meow");
    }

    @Override
    void talk() {
        meow();
    }

    @Override
    public String toString() {
        return "Cat " + super.toString();
    }
}
