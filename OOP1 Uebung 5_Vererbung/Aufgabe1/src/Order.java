import java.util.ArrayList;

public class Order {
    private ArrayList<Item> itemsOfOrder = new ArrayList<>();
    public double getTotalPrice () {
        double sumPrice =0;
        for (int i=0; i<itemsOfOrder.size(); i++) {
            sumPrice += itemsOfOrder.get(i).getPrice();
        }
        return sumPrice;
    }
    public void printItems() {
        System.out.println("Items of your Order: ");
        for (Item item : itemsOfOrder) {
            System.out.println(item.description + "     " + item.getPrice() + " Fr. ");
        }
        System.out.println("Total price: " + getTotalPrice());
    }
    public void addItem(Item myOrder) {
        itemsOfOrder.add(myOrder);
    }
}
