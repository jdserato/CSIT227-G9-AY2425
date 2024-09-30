package Sept30;

public class Zombie {
    Coord location;
    int hp;
    double speed;
    int damage;

    public Zombie(Coord location, int hp, double speed, int damage) {
        this.location = location;
        this.hp = hp;
        this.speed = speed;
        this.damage = damage;
    }

    public Zombie(Coord location) {
        this.location = location;
        hp = 200;
        speed = 0.3;
        damage = 1;
    }

    public void eat(Plant target) {
        target.hp -= damage;
    }

    public void walk() {
        location.col -= speed;
    }

    @Override
    public String toString() {
        return getClass() + " - hp: " + hp + " | loc: " + location;
    }
}
