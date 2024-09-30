package Sept30;

public class PuffShroom extends Mushroom{
    public static final int RANGE = 3;

    public PuffShroom(Coord location) {
        super(0, 7, location);
    }

    @Override
    public void use() {
        System.out.println("Shooting bubble with dmg " + shootBubble());

    }

    int shootBubble() {
        if (asleep) {
            return 0;
        }
        return 20;
    }
}
