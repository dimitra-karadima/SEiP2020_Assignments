package codeanalyzer;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

public class StrcompTest {

	Strcomp sca = new Strcomp();
	Local local = new Local();
	private final static String TEST_CLASS = "src/test/resources/TestClass.java";
	
	@Test
	public void testCalculateStrCompLOC() throws IOException {
		assertEquals(7, sca.calculateLOC(TEST_CLASS, local));
	}
	
	@Test
	public void testCalculateStrCompNOM() throws IOException {
		assertEquals(3, sca.calculateNOM(TEST_CLASS, local));
	}
	
	@Test
	public void testCalculateStrCompNOC() throws IOException {
		assertEquals(3, sca.calculateNOC(TEST_CLASS, local));
	}
	
}
