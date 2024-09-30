package Sept30;

public class Peashooter extends Plant{
    public Peashooter(Coord location) {
        super(100, 2, location);
    }

    @Override
    public void use() {

        System.out.println("Shooting pea with dmg " + shootPea());

    }

    public int shootPea() {
        return 20;
    }
}
