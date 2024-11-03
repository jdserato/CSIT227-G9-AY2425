package Sept05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            recursive();
        } catch (StackOverflowError e) {
            System.out.println("OOOOY OKE");
        }
        Animal b = new Bird("Tweety", 5);
//        Cat c = (Cat) b;
        b.talk();
        Cat cathy = new Cat("Cathy", 45);
//        Cat cat = new Cat();
        cathy.setAge(-45);
        System.out.println(cathy);
        cathy.meow();
        Dog browny = new Dog("Browny", 12);
        System.out.println(browny);
        browny.bark();
        Fish nemo = new Fish("Nemo", 3);

        nemo.swim();
        nemo.talk();
        browny.provideMilk();
        cathy.provideMilk(4);
        cathy.talk();
        browny.talk();
        List<Animal> animals = new LinkedList<>();
        while (true) {
            animals.add(new Bird("Tweety", 5));
        }
//        animals.add(cathy);
//        animals.add(browny);
//        animals.add(nemo);
//        animals.add(new Whale("Crocodile", 134));
//        animals.add(new Bird("Birdie", 1));
//        animals.add(new Penguin("Madagascar", 12));
//        Collections.sort(animals);
//        System.out.println("ANIMALS SORTED BY AGE");
//        for (Animal a : animals) {
//            System.out.println(a);
//        }
//        animals.sort(new AnimalNameComparator());
//        System.out.println("ANIMALS SORTED BY NAME");
//        for (Animal a : animals) {
//            System.out.println(a);
//        }
//        animals.sort(new AnimalTypeComparator());
//        System.out.println("ANIMALS SORTED BY TYPE");
//        for (Animal a : animals) {
//            System.out.println(a);
//        }
    }

    static void recursive() {
        recursive();
    }
}
