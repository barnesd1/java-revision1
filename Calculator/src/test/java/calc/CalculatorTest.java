package calc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class CalculatorTest {
	@Test
	public void testAdd( ) {
		Calculator c = new Calculator();
		assertEquals(c.Add(2.0d, 3.0d), 5.0d, 0);
	}
	@Test
	public void testSubtract( ) {
		Calculator c = new Calculator();
		assertEquals(c.Subtract(3.0d, 2.5d), 0.5d, 0);
	}
	@Test
	public void testMultiply( ) {
		Calculator c = new Calculator();
		assertEquals(c.Multiply(2.5d, 2.5d), 6.25d, 0);
	}
	@Test
	public void testDivide( ) {
		Calculator c = new Calculator();
		assertEquals(c.Divide(6.0d, 3.0d), 2.0d, 0);
	}
}
