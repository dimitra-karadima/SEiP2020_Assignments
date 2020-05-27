package codeanalyzer;


import java.io.IOException;
import java.util.List;

/**
 * This class implements the SourceFileReader interface
 * and it is called when the source code file location is unknown.
 * @author Dimitra
 *
 */

public class NullFileReader implements SourceFileReader{
	
	@Override
	public List<String> readFileIntoList(String filepath) throws IOException {
		return null;
	}
	
	@Override
	public String readFileIntoString(String filepath) throws IOException {
		return null;
	}

}
