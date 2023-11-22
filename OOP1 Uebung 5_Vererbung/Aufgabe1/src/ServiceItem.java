public class ServiceItem extends Item{
    double price;
    public ServiceItem (String description, double price) {
        super(description);
        this.price = price;
    }

    @Override
    public double getPrice () {
        return price* BundleItem.discount;
    }
}
