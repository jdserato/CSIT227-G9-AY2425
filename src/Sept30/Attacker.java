package Sept30;

public interface Attacker {
    int getDamage();

    default int attack() {
        System.out.println(this + " attacks");
        return getDamage();
    }
}
