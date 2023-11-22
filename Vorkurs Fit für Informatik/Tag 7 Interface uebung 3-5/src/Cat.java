import java.util.Comparator;

public class Cat implements Animal {
    private String name;
    private double weight;
    public Cat (String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
    @Override
    public String getName() {
        System.out.println("Cat: " + name);
        return name;
    }
    @Override
    public double getWeight() {
        System.out.println(weight);
        return weight;
    }
    @Override
    public void speak() {
        System.out.println("Miau");
    }
    public double getFood() {
        if (weight > 7.0) {
            return 0.05;
        } else {
            return 0.1;
        }
    }
}
