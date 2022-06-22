import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
    private Calculator calculator;

    public CalculatorTest() {
    }
    
	@Before
    public void setUp() {
        // A new calculator is always created before each test to guarantee their independence
		 calculator = new Calculator();
    }
	@Test
	public void add() {
	    assertEquals(2, calculator.add(1, 1), 0);
	    assertEquals(1.42, calculator.add(3.14, -1.72), 0.001);
	    assertEquals(2.0/3, calculator.add(1.0/3, 1.0/3), 0.001);
	}

	@Test
	public void subtract() {
	    assertEquals(0, calculator.subtract(1, 1), 0);
	    assertEquals(4.86, calculator.subtract(3.14, -1.72), 0.001);
	    assertEquals(2.0/3, calculator.subtract(1.0/3, -1.0/3), 0.001);
	}

	@Test
	public void multiply() {
	    assertEquals(2, calculator.multiply(1, 2), 0);
	    assertEquals(-5.4008, calculator.multiply(3.14, -1.72), 0.001);
	    assertEquals(0.111, calculator.multiply(1.0/3, 1.0/3), 0.001);
	}

	@Test
	public void divide() {
	    assertEquals(2, calculator.divide(4, 2), 0);
	    assertEquals(-1.826, calculator.divide(3.14, -1.72), 0.001);
	    assertEquals(1, calculator.divide(1.0/3, 1.0/3), 0);
	}

	@Test(expected=IllegalArgumentException.class)
	public void divideException() {
	    calculator.divide(2, 0);
	}

}
