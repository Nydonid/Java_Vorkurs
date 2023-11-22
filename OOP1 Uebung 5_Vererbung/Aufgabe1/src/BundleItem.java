public class BundleItem extends Item {
    static double discount;
    public BundleItem (String description, double discount) {
        super(description);
        this.discount = discount;
    }
    public double getDiscount(Item item) {
        return item.getPrice() * discount;
    }
    @Override
    public double getPrice() {
        return 0;
    }


}
