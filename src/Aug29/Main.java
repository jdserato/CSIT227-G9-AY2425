package Aug29;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Person is a class
        // vince is the object
        Person vince = new Person("Jay Vince", 50);
        vince.birthday = new Date(2009, 4, 13);
        System.out.println(vince.name);
        System.out.println(vince.age);
        System.out.println(vince.birthday.getYear() + "-" +
                vince.birthday.getMonth() + "-" + vince.birthday.getDate());
        vince.talk();

        Person jay = new Person("Jay", 18);
        jay.talk("Cool and normal");
    }
}
