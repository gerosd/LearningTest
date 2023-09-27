import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void add() {
        Calculator calc = new Calculator();
        int result = calc.add(20, 35);
        assertEquals(55, result);
    }

    @Test
    public void sub() {
        Calculator calc = new Calculator();
        int result = calc.sub(109, 10);
        assertEquals(99, result);
    }

    @Test
    public void mul() {
        Calculator calc = new Calculator();
        int result = calc.mul(-5, -3);
        assertEquals(15, result);
    }

    @Test
    public void div() {
        Calculator calc = new Calculator();
        int result = calc.div(2, 3);
        assertEquals(0, result);
    }
}
