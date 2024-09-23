package Sept05;

public abstract class Mammal extends Animal {
    void provideMilk() {
        System.out.println(name + " is providing milk");
    }

    void provideMilk(int liters) {
        System.out.println(name + " is providing " +liters +" liters of milk");
    }
}
