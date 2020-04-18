package math;

import org.junit.Assert;
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
		Assert.assertEquals(2.0, a.divide(4.0, 2.0),0.001);
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
		Assert.assertEquals(20,a.multiply(4, 5));
	}
	
	@Test
	public void testMultiplyWithZeroX() {
		Assert.assertEquals(0, a.multiply(0, Integer.MAX_VALUE));
	}
	
	@Test
	public void testMultiplyWithZeroY() {
		Assert.assertEquals(0, a.multiply(Integer.MAX_VALUE,0));
	}
	
}
