package domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleBankSystemTest {

    private SimpleBankSystem bank;

    @BeforeEach
    void setUp() {
        long[] initialBalances = {10, 20, 30, 40, 50};
        bank = new SimpleBankSystem(initialBalances);
    }

    @AfterEach
    void tearDown() {
        bank = null;
    }

    @Test
    void transfer() {
        Assertions.assertNotNull(bank);
        Assertions.assertTrue(bank.transfer(1, 2, 5));
        Assertions.assertFalse(bank.transfer(1, 2, 20));
    }

    @Test
    void deposit() {
        Assertions.assertNotNull(bank);
        Assertions.assertTrue(bank.deposit(1, 10));
    }

    @Test
    void withdraw() {
        Assertions.assertNotNull(bank);
        Assertions.assertTrue(bank.withdraw(1, 5));
        Assertions.assertFalse(bank.withdraw(1, 20));
    }
}