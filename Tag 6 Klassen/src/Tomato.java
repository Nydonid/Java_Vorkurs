public class Tomato {

    private static double pricePerKg = 25.0;
    private String name;
    private double weight;
    private String color;

    public Tomato (String name, double weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        System.out.println("Constructor called");
    }

    public void speak() {
        System.out.println("My name is " + name + " and am a tomato.");

    }

    @Override
    public String toString() {
        return "Tomato{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }

    public double getPrice() {
        return weight * pricePerKg / 1000;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("invalid weight: " + weight);

        }
        this.weight = weight;
    }
}
