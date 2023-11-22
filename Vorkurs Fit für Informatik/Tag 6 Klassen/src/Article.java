public class Article {

    private String name;
    private double price;

    public Article (String name, double price) {
        this.name = name;
        this.price = price;
        System.out.println("Constructor called successfully");
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Article{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
