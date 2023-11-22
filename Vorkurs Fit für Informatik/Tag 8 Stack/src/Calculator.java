public class Calculator {
    static String opSign = "";

    public static double operation() {
        return switch (opSign) {
            case "+" -> Stack.pop() + Stack.pop();
            case "-" -> Stack.pop() - Stack.pop();
            case "*" -> Stack.pop() * Stack.pop();
            case "/" -> Stack.pop() / Stack.pop();
            default -> 404.404;
        };
    }

}
