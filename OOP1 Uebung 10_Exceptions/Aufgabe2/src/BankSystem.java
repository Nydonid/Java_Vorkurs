public class BankSystem {
    public static void transfer (BankAccount from, BankAccount to, int amount) throws TransactionException, LimitExceededException {
        if (from.getBalance() - from.getLowerLimit() >= amount || to.getUpperLimit() - to.getBalance() <= amount) {
            throw new TransactionException ();
        } else {
            from.deposit(amount);
            to.withdraw(amount);
        }
    }
}
