import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class PrimeNumberCheckerTest {
    @Test
    void shouldReturnFalseIfNumberIsLessThanTwo() {
        PrimeNumberChecker primeNumberChecker = new PrimeNumberChecker(1);
        boolean isPrime = primeNumberChecker.check();
        assertFalse(isPrime);
    }

    @Test
    void shouldReturnFalseIfNumberIsNotPrime() {
        PrimeNumberChecker primeNumberChecker = new PrimeNumberChecker(6);
        Boolean isPrime = primeNumberChecker.check();
        assertFalse(isPrime);
    }

    @Test
    void shouldReturnTrueIfNumberIsPrime() {
        PrimeNumberChecker primeNumberChecker = new PrimeNumberChecker(5);
        Boolean isPrime = primeNumberChecker.check();
        assertTrue(isPrime);
    }
}
