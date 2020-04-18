package io;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FileIOTest {

	FileIO f = new FileIO();
	String resourcesPath= "src/test/resources/";
	int[] expected = {2,3,4,5};
	int[] expectedDouble = {1,3,5};
	
	@Test
	public void testNormalCase() {
		Assert.assertArrayEquals(expected, f.readFile(resourcesPath.concat("normal.txt")));
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void testEmptyFile(){
		thrown.expect(IllegalArgumentException.class);
		f.readFile(resourcesPath.concat("empty.txt"));
		thrown.expectMessage("Given file is empty");
	}
	
	@Test
	public void testWrongPath(){
		thrown.expect(IllegalArgumentException.class);
		f.readFile(resourcesPath.concat("wrong.txt"));
		thrown.expectMessage("Input file does not exist");
	}
	
	@Test
	public void testReadFileContainsInvalidEntries() {
		Assert.assertArrayEquals(expectedDouble,f.readFile(resourcesPath.concat("double.txt")));
	}
	
}
