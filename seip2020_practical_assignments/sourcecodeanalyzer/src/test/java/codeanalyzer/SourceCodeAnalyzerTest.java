package codeanalyzer;

import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

public class SourceCodeAnalyzerTest {
	private final static String TYPE_REGEX = "regex";
	private final static String TYPE_STRCOMP = "strcomp";
	private final static String TEST_CLASS = "src/test/resources/TestClass.java";
	private SourceCodeAnalyzer sca = new SourceCodeAnalyzer("local");
	
	@Test
	public void testCalculateRegexLOC() throws IOException {
		assertEquals(21, sca.calculateLOC(TEST_CLASS, TYPE_REGEX));
	}
	
	@Test
	public void testCalculateStrCompLOC() throws IOException {
		assertEquals(7, sca.calculateLOC(TEST_CLASS, TYPE_STRCOMP));
	}
	
	@Test
	public void testCalculateRegexNOM() throws IOException {
		assertEquals(3, sca.calculateNOM(TEST_CLASS, TYPE_REGEX));
	}
	
	@Test
	public void testCalculateStrCompNOM() throws IOException {
		assertEquals(3, sca.calculateNOM(TEST_CLASS, TYPE_STRCOMP));
	}
	
	@Test
	public void testCalculateRegexNOC() throws IOException {
		assertEquals(3, sca.calculateNOC(TEST_CLASS, TYPE_REGEX));
	}
	
	@Test
	public void testCalculateStrCompNOC() throws IOException {
		assertEquals(3, sca.calculateNOC(TEST_CLASS, TYPE_STRCOMP));
	}
	
}
