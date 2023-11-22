public class ArticleTest {

    public static void main (String[] args) {

        Article banana = new Article("Banana", 50);
        Article cola1L = new Article("Coca Cola", 200);
        Article spaghetti1kg = new Article("Barilla Spaghetti", 120);
        Article milk0_5L = new Article("Milk 0.5L", 70);

        System.out.println(banana.getPrice());
        System.out.println(milk0_5L.getName());
        System.out.println(cola1L.toString());
        System.out.println(spaghetti1kg.getName());
    }
}
