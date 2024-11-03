package Sept05;

public class Cat extends Mammal {

    public Cat(String name, int age) {
        super(name, age);
    }

    public void meow() {
        System.out.println(name + " says Meow meow");
    }

    @Override
    public void talk() {
        meow();
    }

    @Override
    public String toString() {
        return "Cat " + super.toString();
    }
}
