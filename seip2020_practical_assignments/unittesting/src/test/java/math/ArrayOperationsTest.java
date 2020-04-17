package math;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;
import io.FileIO;

public class ArrayOperationsTest {

	ArrayOperations a = new ArrayOperations();
	
	@Test
	public void testFindPrimesInFile() {
		FileIO fileio = mock(FileIO.class);
		MyMath m = mock(MyMath.class);
		int[] expected = {2,3,5};
		
		String filepath = "src/test/resources/normal.txt";
		when(fileio.readFile(filepath)).thenReturn(new int[] {1,2,3,4,5});
		
		when(m.isPrime(2)).thenReturn(true);
		when(m.isPrime(3)).thenReturn(true);
		when(m.isPrime(4)).thenReturn(false);
		when(m.isPrime(5)).thenReturn(true);
		
		Assert.assertArrayEquals(expected, a.findPrimesInFile(fileio, filepath, m));
	}
}
