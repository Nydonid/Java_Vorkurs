public class BankAccount {
    private final long kontoNumber = (long) (420_1234_6900_0000L+Math.random()*100000); //generate random private bank nr
    private double bankBalance = 0;     // set balance to 0 at opening
    private BankCustomer customer;

    BankAccount(BankCustomer customer) {
        this.customer = customer;
    }

    double getBalance () {
        return bankBalance;
    }
    boolean deposit(double deposit) {   // depose money on account
        if(deposit < 0) {
            return false;
        }
        bankBalance += deposit;
        return true;
    }
    boolean withdraw(double withdraw) {     // withdraw money from account
        if(withdraw > bankBalance)
            return false;
        bankBalance -= withdraw;
        return true;
    }

    public boolean sameCustomer(BankAccount account1ForCheck, BankAccount account2ForCheck) {
        return account1ForCheck.customer.equals(account2ForCheck.customer);
    }
    void print(){
        System.out.println("Kontonr: " + kontoNumber);
        System.out.println("Balance: " + bankBalance);
    }
    public BankManager getManager() {
        return customer.getManager();
    }
}

