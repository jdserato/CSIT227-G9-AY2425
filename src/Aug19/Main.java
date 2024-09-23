package Aug19;

import Sept02.Cat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Tiger lion = new Tiger("Lion", "katol");
//        lion.setName("Lion");
        lion.nickname("Lion");
        lion.hunt("rabbit");
        System.out.println(lion.getName());
    }
}