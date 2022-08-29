import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreditCalculatorTest {
    private final int sum = 1_500_000;
    private final double rate = 9.9;
    private final int period = 60;

    CreditCalculator calculator = new CreditCalculator();

    @Test
    void testSumPerMonth() {
        int expected = 31_796;
        int actual = calculator.sumPerMonth(sum, rate, period);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void testFullSumReturn() {
        int expected = 1_907_808;
        int actual = calculator.fullSumReturn(sum, rate, period);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testOverPaySum() {
        int expected = 407_808;
        int actual = calculator.overPaySum(sum, rate, period);
        Assertions.assertEquals(expected, actual);
    }
}