import java.util.Comparator;

public class AnimalWeightComparator implements Comparator<Animal> {


    @Override
    public int compare(Animal a1, Animal a2) {
        return Double.compare(a1.getWeight(), a2.getWeight());
    }
}
