package Aug19;

import Sept02.Cat;

public class Tiger extends Cat {

    public Tiger(String name, String breed) {
        super(name, breed);
    }

    void nickname(String name) {
        setName(name);
//        this.age = 5;
    }
    void hunt(String prey) {
        System.out.println(getName() + " is hunting " +prey);
    }
}
