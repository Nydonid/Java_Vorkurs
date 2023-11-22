public class OrderSystemTest {
    public static void main(String[] args) {
        Order myOrder = new Order();
        ProductItem television4k = new ProductItem("Samsung 4K", 1, 2600.00);
        ServiceItem televisionInstallation = new ServiceItem("Installation television", 350.00);
        BundleItem discount50 = new BundleItem("SALE 50%", 0.5);

        discount50.getDiscount(television4k);

        myOrder.addItem(television4k);
        myOrder.addItem(televisionInstallation);

        System.out.println("GET MY ORDER_________________________");
        myOrder.getTotalPrice();
        myOrder.printItems();

        System.out.println("PRODUCT DESCRIPTION__________________");
        television4k.print();
        televisionInstallation.print();
    }
}