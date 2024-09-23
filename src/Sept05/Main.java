package Sept05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal b = new Bird();
        b.talk();
        Cat cathy = new Cat();
        cathy.name = "Cathy";
        cathy.setAge(-45);
        System.out.println(cathy);
        cathy.meow();
        Dog browny = new Dog();
        browny.name = "Browny";
        System.out.println(browny);
        browny.bark();
        Fish nemo = new Fish();
        nemo.name = "Nemo";

        nemo.swim();
        nemo.talk();
        browny.provideMilk();
        cathy.provideMilk(4);
        cathy.talk();
        browny.talk();
        List<Animal> animals = new LinkedList<>();
        animals.add(cathy);
        animals.add(browny);
        animals.add(nemo);
        animals.add(new Whale());
        animals.add(new Bird());
        animals.add(new Penguin());
        System.out.println("ANIMALS");
        for (Animal a : animals) {
            a.talk();
            if (a instanceof Swimmer) {
                Swimmer s = (Swimmer) a;
                s.swim();
            }
            if (a instanceof EggLaying) {
                ((EggLaying) a).layEggs();
            }
        }
    }
}
