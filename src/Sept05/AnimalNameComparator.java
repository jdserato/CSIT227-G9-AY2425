package Sept05;

import java.util.Comparator;

public class AnimalNameComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.name.compareTo(o2.name);
    }
}
