package Sept02;

public class Cat {
    private String name;
    int age;
    final String breed;
    final static int max_lives = 9;
    static int number_of_cats;

    protected Cat(String name, String breed) {
        this.name = name;
        this.breed = breed;
        number_of_cats++;
    }

    public Cat(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
// method overloading
    public void meow() {
        int j;
        System.out.println(name + " Meows ");
    }

    public void meow(String enemy, int i){
        System.out.println("hisss");
    }

    public void meow(String owner){
        System.out.println(name + " meows at " +owner);
    }

    void purr() {
        System.out.println("purr");
    }
}
