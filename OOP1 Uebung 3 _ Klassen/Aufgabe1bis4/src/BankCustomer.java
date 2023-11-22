public class BankCustomer {
    String prename;
    String lastname;
    int age;
    String address;
    static BankManager manager;

    public BankCustomer (String prename, String lastname, int age, String address, BankManager manager) {
        this.prename = prename;
        this.lastname = lastname;
        this.age = age;
        this.address = address;
        BankCustomer.manager = manager;
    }
    void print(){
        System.out.println("Print customer        prename: " + prename + " lastname: " + lastname + " age: " + age + " address: " + address);
    }
    public BankManager getManager() {
        return manager;
    }

}
