package codeanalyzer;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

public class RegexTest {
	
	Regex sca = new Regex();
	Local local = new Local();
	private final static String TEST_CLASS = "src/test/resources/TestClass.java";

	@Test
	public void testCalculateRegexLOC() throws IOException {
		assertEquals(21, sca.calculateLOC(TEST_CLASS, local));
	}
	
	@Test
	public void testCalculateRegexNOM() throws IOException {
		assertEquals(3, sca.calculateNOM(TEST_CLASS, local));
	}
	
	@Test
	public void testCalculateRegexNOC() throws IOException {
		assertEquals(3, sca.calculateNOC(TEST_CLASS, local));
	}
	
}
