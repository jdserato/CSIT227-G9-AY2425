package Sept05;

import java.util.Date;

public abstract class Animal implements Comparable<Animal> {
    protected String name;
    private int age;
//    final Date birthday;


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("no negatives plz");
        } else {
            this.age = age;
        }
    }

    abstract void talk();

    @Override
    public String toString() {
        return getClass() + name +  " with age " + age;
    }

    @Override
    public int compareTo(Animal o) {
        return Integer.compare(age, o.age);
    }

}
