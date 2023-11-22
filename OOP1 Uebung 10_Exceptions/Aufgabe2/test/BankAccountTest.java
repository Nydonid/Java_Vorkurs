import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BankAccountTest {

    @Test
    void testDepositAmountMustBePositive() {
        var account = new BankAccount(100, 0, 200);

        assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-1);
        });
        assertEquals(100, account.getBalance());
    }

    @Test
    void testDepositLimitExceeded() {
        var account = new BankAccount(100, 0, 200);

        assertThrows(LimitExceededException.class, () -> {
            account.deposit(101);
        });
        assertEquals(100, account.getBalance());
    }

    @Test
    void testSuccessfulDeposit() throws LimitExceededException {
        var account = new BankAccount(100, 0, 200);

        account.deposit(50);

        assertEquals(150, account.getBalance());
    }

    @Test
    void testWithdrawAmountMustBePositive() {
        var account = new BankAccount(100, 0, 200);

        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-1);
        });
        assertEquals(100, account.getBalance());
    }

    @Test
    void testWithdrawLimitExceeded() {
        var account = new BankAccount(100, 0, 200);

        assertThrows(LimitExceededException.class, () -> {
            account.withdraw(101);
        });
        assertEquals(100, account.getBalance());
    }

    @Test
    void testSuccessfulWithdraw() throws LimitExceededException {
        var account = new BankAccount(100, 0, 200);

        account.withdraw(50);

        assertEquals(50, account.getBalance());
    }

}
