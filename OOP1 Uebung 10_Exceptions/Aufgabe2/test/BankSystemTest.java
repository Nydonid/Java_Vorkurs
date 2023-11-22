import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankSystemTest {
    private static final int START_AMOUNT = 1000;

    @Test
    void testSuccessfulTransaction() throws TransactionException, LimitExceededException {
        var first = new BankAccount(START_AMOUNT, 100, 5000);
        var second = new BankAccount(START_AMOUNT, 100, 1500);

        BankSystem.transfer(first, second, 200);

        assertEquals(800, first.getBalance());
        assertEquals(1200, second.getBalance());
    }

    @Test
    void testWithdrawLimitExcess() {
        var first = new BankAccount(START_AMOUNT, 100, 5000);
        var second = new BankAccount(START_AMOUNT, 100, 1500);

        assertThrows(TransactionException.class, () -> {
            BankSystem.transfer(first, second, 2000);
        });
        assertEquals(START_AMOUNT, first.getBalance());
        assertEquals(START_AMOUNT, second.getBalance());
    }

    @Test
    void testDepositLimitExcess() {
        var first = new BankAccount(START_AMOUNT, 100, 5000);
        var second = new BankAccount(START_AMOUNT, 100, 1500);

        assertThrows(TransactionException.class, () -> {
            BankSystem.transfer(first, second, 800);
        });
        assertEquals(START_AMOUNT, first.getBalance());
        assertEquals(START_AMOUNT, second.getBalance());
    }

}
