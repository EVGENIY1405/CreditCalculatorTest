import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreditCalculatorTest {
    private final int sum = 1_500_000;
    private final double rate = 9.9;
    private final int period = 60;

    CreditCalculator calculator = new CreditCalculator();

    @Test
    void calculateSumPerMonth() {
        int expected = 20000;
        int actual = (int) calculator.sumPerMonth(sum, rate, period);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void calculateFullSumReturn() {
        int expected = 3_000_000;
        int actual = (int) calculator.fullSumReturn(sum, rate, period);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calculateOverPaySum() {
        int expected = 1_200_000;
        int actual = (int) calculator.overPaySum(sum, rate, period);
        Assertions.assertEquals(expected, actual);
    }
}