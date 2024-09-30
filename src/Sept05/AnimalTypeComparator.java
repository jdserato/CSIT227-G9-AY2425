package Sept05;

import java.util.Comparator;

public class AnimalTypeComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getClass().toString().compareTo(o2.getClass().toString());
    }
}
