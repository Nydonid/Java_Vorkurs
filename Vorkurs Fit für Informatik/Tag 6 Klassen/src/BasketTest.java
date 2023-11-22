import java.util.ArrayList;

public class BasketTest {
        public static void main (String[] args) {

            Basket mattiasBasket = new Basket( new ArrayList<>());
            Article banana = new Article("Banana", 50);
            Article cola1L = new Article("Coca Cola", 200);
            Article spaghetti1kg = new Article("Barilla Spaghetti", 120);
            Article milk0_5L = new Article("Milk 0.5L", 70);


            mattiasBasket.addArticle(banana);
            mattiasBasket.addArticle(spaghetti1kg);


            System.out.println(mattiasBasket);
            System.out.println(mattiasBasket.getPrice());
        }
}
