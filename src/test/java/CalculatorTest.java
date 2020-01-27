import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calc;

    @Before
    public void before(){
        calc = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(2, calc.add(1, 1));
    }

    @Test
    public void canSubtract(){
        assertEquals(0, calc.subtract(1, 1));
    }
//
    @Test
    public void canMultiply(){
        assertEquals(4, calc.multiply(2, 2));
    }

    @Test
    public void canDivide(){
        assertEquals(1, calc.divide(2.00, 2.00), 0.01);
    }





}
