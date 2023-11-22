
public class Stack {
    private String[] stack;
    Stack (int capacity) {
        stack = new String[capacity];
    }
    void push(String element) {
        int i =0;
            while (this.stack[i] != null) {
                i++;
            }
            this.stack[i] = element;
    }
    String pop() {
        int i = size();
        if (i == 0) {
            return null;
        }
        String elementBack = stack[i-1];
        stack[i-1] = null;
        return elementBack;
    }
    int size() {
        int i =0;
        if (stack == null) {
            return 0;
        } else {
            while (i < stack.length && stack[i] != null) {
                i++;
            }
            return i;
        }
    }
    boolean isEmpty() {
        return this.stack[0] == null;
    }
    boolean isFull() {
        if (size() <= 0) {
            return true;
        }
        return this.stack[size() - 1] != null;
    }
}
