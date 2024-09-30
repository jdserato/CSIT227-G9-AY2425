package Sept30;

public abstract class Mushroom extends Plant{
    boolean asleep;

    public Mushroom(int sunCost, int cooldown, Coord location) {
        super(sunCost, cooldown, location);
        asleep = true;
    }

    public void wakeUp(CoffeeBean cb) {
        asleep = false;
        cb.die();
    }
}
