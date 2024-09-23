package Sept02;

import Aug19.Tiger;

public class Main {
    public static void main(String[] args) {
        Cat minggay = new Cat("Minggay", "PusPIn");
        System.out.println(Cat.number_of_cats);
        Cat cathy = new Cat("Cathy", "Orange");
        System.out.println(Cat.number_of_cats);
        Tiger tigger = new Tiger("Tigger", "Bengal");
        System.out.println("sqrt of 25 " +Math.sqrt(25));
        System.out.println(tigger.getName());
        System.out.println(Cat.number_of_cats);
        System.out.println(Cat.max_lives);
        System.out.println(Cat.max_lives);
//        minggay.setName("Minggay");
//        cathy.setName("Cathy");
        System.out.println(minggay.getName());
        minggay.meow();
        cathy.meow("me");
    }
}
