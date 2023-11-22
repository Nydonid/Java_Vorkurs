public class BankManager {
    String name;
    int id;

    public BankManager (String name, int id) {
        this.name = name;
        this.id = id;
    }
    void print() {
    System.out.println("Print manager         Name: " + name + " ID: " + id);
    }
}
