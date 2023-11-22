public class ProductItem extends Item {
    int amount;
    double pricePerUnit;
    public ProductItem(String description, int amount, double pricePerUnit) {
        super(description);
        this.amount = amount;
        this.pricePerUnit = pricePerUnit;
    }

    @Override
    public double getPrice() {
        return pricePerUnit * amount* BundleItem.discount;
    }
}
