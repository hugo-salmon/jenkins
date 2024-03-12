import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdditionEntiers() {
        Calculator calculator = new Calculator();
        int result = calculator.additionEntiers(5, 10);
        assertEquals(15, result);
    }

    @Test
    public void testAdditionDoubles() {
        Calculator calculator = new Calculator();
        double result = calculator.additionDoubles(5.5, 4.5);
        assertEquals(10.0, result, 0.001);
    }

    @Test
    public void testSoustractionEntiers() {
        Calculator calculator = new Calculator();
        int result = calculator.soustractionEntiers(15, 6);
        assertEquals(9, result);
    }

    @Test
    public void testSoustractionDoubles() {
        Calculator calculator = new Calculator();
        double result = calculator.soustractionDoubles(9.8, 5.2);
        assertEquals(4.6, result, 0.001);
    }

    @Test
    public void testMultiplicationEntiers() {
        Calculator calculator = new Calculator();
        int result = calculator.multiplicationEntiers(3, 6);
        assertEquals(18, result);
    }

    @Test
    public void testMultiplicationDoubles() {
        Calculator calculator = new Calculator();
        double result = calculator.multiplicationDoubles(5.5, 12.35);
        assertEquals(67.925, result, 0.001);
    }

    @Test
    public void testDivisionEntiers() {
        Calculator calculator = new Calculator();
        int result = calculator.divisionEntiers(20, 5);
        assertEquals(4, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionEntiersParZero() {
        Calculator calculator = new Calculator();
        calculator.divisionEntiers(5, 0);
    }

    @Test
    public void testDivisionDoubles() {
        Calculator calculator = new Calculator();
        double result = calculator.divisionDoubles(8.0, 4.0);
        assertEquals(2.0, result, 0.001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionDoublesParZero() {
        Calculator calculator = new Calculator();
        calculator.divisionDoubles(14.0, 0.0);
    }
}
