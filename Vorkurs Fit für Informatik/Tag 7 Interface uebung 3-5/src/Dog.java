public class Dog implements Animal {
    private String name;
    private double weight;
    public Dog (String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
    @Override
    public String getName() {
        System.out.println("Dog: " + name);
        return name;
    }
    @Override
    public double getWeight() {
        System.out.println(weight);
        return weight;
    }
    @Override
    public void speak() {
        System.out.println("Wuff");

        if (weight <= 3) {
            System.out.println("Wiff");
        }
        if (weight >= 40) {
            System.out.println("WOOUFFF");
        }
    }
    public double getFood() {
        return weight*0.025;
    }
}
