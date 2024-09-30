package Sept30;

public abstract class Plant {
    public static final int DEFAULT_HP = 8;
    public static final int INFINITE = 1000;
    int hp;
    int sunCost;
    int cooldown;
    Coord location;

    public Plant(int hp, int sunCost, int cooldown, Coord location) {
        this.hp = hp;
        this.sunCost = sunCost;
        this.cooldown = cooldown;
        this.location = location;
    }

    public Plant(int sunCost, int cooldown, Coord location) {
        this.sunCost = sunCost;
        this.cooldown = cooldown;
        this.location = location;
        hp = DEFAULT_HP;
    }

    public abstract void use();

    public void die() {
        hp = 0;
    }

    @Override
    public String toString() {
        return getClass() + " - hp: " + hp + " | loc: " + location;
    }

    public boolean isDead() {
        return hp <= 0;
    }
}
