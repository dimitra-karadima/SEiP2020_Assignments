package math;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ArithmeticOperationsTest {
	ArithmeticOperations a = new ArithmeticOperations();
	
	@Test (expected = ArithmeticException.class)
	public void testDivideByZeroFails() {
		a.divide(2, 0);
	}
	
	@Test
	public void testDivideWithNoZeroDenominator() {
		a.divide(4,2);
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void testMultiplyWithNegativeX(){
		thrown.expect(IllegalArgumentException.class);
		a.multiply(-2, 5);
		thrown.expectMessage("x & y should be >= 0");
	}
	
	@Test
	public void testMultiplyWithNegativeY() {
		thrown.expect(IllegalArgumentException.class);
		a.multiply(5, -2);
		thrown.expectMessage("x & y should be >= 0");
	}
	
	@Test
	public void testMultiplyNegativeNumbers() {
		thrown.expect(IllegalArgumentException.class);
		a.multiply(-2, -2);
		thrown.expectMessage("x & y should be >= 0");
	}
	
	@Test
	public void testMultiplyHugeNumber() {
		thrown.expect(IllegalArgumentException.class);
		a.multiply(2, Integer.MAX_VALUE);
		thrown.expectMessage("The product does not fit in an Integer variable");
	}
	
	@Test
	public void testMultiplySmallNumbers() {
		a.multiply(4, 5);
	}
	
	
}
