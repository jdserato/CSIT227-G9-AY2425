package Aug29;

import java.util.Date;

public class Person {
    // FIELDS
    String name;
    int age;
    Date birthday;

    // CONSTRUCTORS - method overloading
    Person(String name) {
        this.name = name;
        age = 20;
    }
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // METHODS
    void talk() {
        System.out.println(name + ": I'm talking");
    }
    void talk(String message) {
        System.out.println(name + ": " + message);
    }
}
