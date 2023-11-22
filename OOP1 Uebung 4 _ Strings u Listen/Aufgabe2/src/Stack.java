import java.util.ArrayList;

public class Stack {
     ArrayList<String> stack;
    Stack (int capacity) {
        stack = new ArrayList<>(capacity);
    }
    void push(String element) {
        stack.add(element);
    }
    String pop() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.remove(size()-1);
    }
    int size() {
        return stack.size();

    }
    boolean isEmpty() {
        return stack.isEmpty();
    }
    boolean isFull() {
        return size() <= 0;
    }
}
