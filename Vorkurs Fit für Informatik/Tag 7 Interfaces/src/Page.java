import java.util.ArrayList;

public class Page implements Printable {
    ArrayList<Printable> arrayContent = new ArrayList<Printable>();
    public void add(Printable p) {
        arrayContent.add(p);
    }
    public void print() {
        for (Printable p : arrayContent) {
            p.print();
        }
    }
}
