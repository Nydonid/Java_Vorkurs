import java.util.LinkedList;

public class Stack {
    double x;
    static LinkedList <Double> linkedlist = new LinkedList<Double>();
    public void push (double x) {
        linkedlist.add(linkedlist.size(), x);
    }
    public static double pop() {
        return linkedlist.remove();
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
