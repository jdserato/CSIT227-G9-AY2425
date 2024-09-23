package Sept05;

public abstract class Animal {
    protected String name;
    private int age;

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
        return name +  " with age " + age;
    }
}
