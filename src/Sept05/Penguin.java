package Sept05;

public class Penguin extends Bird implements Swimmer  {
    @Override
    void talk() {
        System.out.println("tsk tsk tsk");
    }

    public void swim() {
        System.out.println("wooosh ohno a seal");
    }
}
