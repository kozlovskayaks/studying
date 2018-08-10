import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculatorTest {
Calculator calculator = new Calculator();
    @Test
    public void testAdd() throws Exception {
        assertEquals(6, calculator.add(2,4));
    }

    @Test
    public void testSubstract() throws Exception {
        assertEquals(12, calculator.substract(20,8));
    }

    @Test
    public void testMult() throws Exception {
        assertEquals(16, calculator.mult(4,4));
    }

    @Test
    public void testDiv() throws Exception {
        assertEquals(7.0, calculator.div(21,3));
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDiv2() throws Exception {
        assertEquals(0.0, calculator.div(21,0));
    }

    @Test
    public void testDiv3(){
        assertEquals (calculator.div(21,3), 3, "Ошибка калькулятора" + calculator);
    }
}