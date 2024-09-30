package Sept30;

public class SunShroom extends Mushroom{
    State state;

    public SunShroom(Coord location) {
        super(25, 12, location);
        state = State.SMALL;
    }

    @Override
    public void use() {
        System.out.println("Generating " + generateSun() + " sun");
    }

    public void grow() {
        state = State.BIG;
    }

    int generateSun() {
        if (asleep) {
            return 0;
        }
        if (state == State.SMALL) {
            return 15;
        }
        return 25;
    }

    enum State {
        SMALL, BIG
    }
}
