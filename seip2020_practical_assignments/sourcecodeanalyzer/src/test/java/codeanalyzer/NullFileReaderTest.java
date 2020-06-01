package codeanalyzer;

import static org.junit.Assert.assertNull;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

public class NullFileReaderTest {
	
	NullFileReader sfr = new NullFileReader();
	
	@Test
	public void testReadFileIntoListNull() throws IOException {
		//give a none existing type to cause a null List return
		List<String> actualList = sfr.readFileIntoList("any-filepath");
		
		assertNull(actualList);
	}
	
	@Test
	public void testReadFileIntoStringNull() throws IOException {
		//give a none existing type to cause a null String return
		String actualString = sfr.readFileIntoString("any-filepath");
		
		assertNull(actualString);
	}

}
