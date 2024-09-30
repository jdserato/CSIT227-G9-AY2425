package Sept30;

public class Sunflower extends Plant implements SunProducer{
    public Sunflower(Coord location) {
        super(50, 12, location);
    }

    public int generateSun() {
        return 25;
    }

    @Override
    public void use() {
        System.out.println("Generating " +generateSun()+ " sun");

    }
}
