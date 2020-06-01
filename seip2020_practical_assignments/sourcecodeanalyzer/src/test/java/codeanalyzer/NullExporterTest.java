package codeanalyzer;

import org.junit.Test;

public class NullExporterTest {

	NullExporter mex = new NullExporter();
	
	@Test(expected = IllegalArgumentException.class)
	public void testWriteFileWithUknownFIleType() {
		mex.writeFile(null, null);
	}
	
}
