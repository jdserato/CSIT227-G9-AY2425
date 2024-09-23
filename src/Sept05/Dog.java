package Sept05;

public class Dog extends Mammal {
    public void bark() {
        System.out.println(name + " says Arf arf");
    }

    @Override
    void talk() {
        bark();
    }

    @Override
    public String toString() {
        return "Dog " + super.toString();
    }
}
