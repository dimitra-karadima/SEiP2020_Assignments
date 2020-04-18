package math;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;



public class MyMathTest {

	MyMath m = new MyMath();
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void testFactorialOfNeagtiveNumber() {
		thrown.expect(IllegalArgumentException.class);
		m.factorial(-1);
		thrown.expectMessage("Cannot calculate factorial of negative numbers");
	}
	
	@Test
	public void testFactorialOfBigNumber() {
		thrown.expect(IllegalArgumentException.class);
		m.factorial(13);
		thrown.expectMessage("Cannot calculate factorial of number more than 12");
	}
	
	@Test
	public void testPrimeOfInvalidInput() {
		thrown.expect(IllegalArgumentException.class);
		m.isPrime(0);
		thrown.expectMessage("Cannot check number lower than 2");
	}
	
	@Test
	public void testPrimeofPrimeNumber() {
		Assert.assertEquals(true, m.isPrime(5));
	}
	
	@Test
	public void testPrimeofNonPrimeNumber() {
		Assert.assertEquals(false, m.isPrime(4));
	}
	
}
