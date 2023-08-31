import java.util.ArrayList;

public class Basket {
    private ArrayList<Article> list = new ArrayList<>();
    public Basket (ArrayList<Article> list) {
            this.list = list;
    }

    public void addArticle (Article article) {
        list.add(article);
    }

    public double getPrice() {
        double sumPrice =0;
        for (int i =0; i < list.size(); i++) {
            sumPrice = sumPrice + list.get(i).getPrice();
        }
        return sumPrice;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "list=" + list +
                '}';
    }
}
