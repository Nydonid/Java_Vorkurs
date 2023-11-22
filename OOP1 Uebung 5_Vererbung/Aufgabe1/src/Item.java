abstract public class Item {
    final String description;
    public Item (String description) {
        this.description = description;
    }
    public abstract double getPrice();

    public void print() {
        System.out.println("Description: " + description + " Price: " + getPrice());
    }
}
