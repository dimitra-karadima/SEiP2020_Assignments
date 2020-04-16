package math;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;

@RunWith(Parameterized.class)
public class MyMathTestParameterized {

	@Parameter (value = 0)
	public int n;
	@Parameter (value = 1)
	public int result;
	
	MyMath m = new MyMath();
	
	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][]{{0,1},{1,1},{2,2},{12,479001600}};
		return Arrays.asList(data);
	}
	
	@Test
	public void testFactorialWithNormalNumbers() {
		Assert.assertEquals(result, m.factorial(n));
	}

}

