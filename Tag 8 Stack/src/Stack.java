import java.util.LinkedList;

public class Stack {
    double x;
    LinkedList <Double> linkedlist = new LinkedList<Double>();
    public void push (double x) {
        linkedlist.add(linkedlist.size(), x);
    }
    public double pop (double x) {
        return linkedlist.remove(linkedlist.size());
    }
    public int size(double x) {
        return linkedlist.size();
    }
    @Override
    public String toString() {
        return "Stack{" +
                "linkedlist=" + linkedlist +
                '}';
    }
}
