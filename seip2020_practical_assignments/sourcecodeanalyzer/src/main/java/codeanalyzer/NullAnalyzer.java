package codeanalyzer;

import java.io.IOException;

/**
 * This class implements the AnalyzerType interface
 * and reads files with unknown analysis type.
 * @author Dimitra
 *
 */

public class NullAnalyzer implements AnalyzerType{
	
	@Override
	public int calculateLOC(String filepath, SourceFileReader fileReader) throws IOException{
		return -1;
	}
	
	@Override
	public int calculateNOM(String filepath, SourceFileReader fileReader) throws IOException{
		return -1;
	}
	
	@Override
	public int calculateNOC(String filepath, SourceFileReader fileReader) throws IOException{
		return -1;
	}
	

}
