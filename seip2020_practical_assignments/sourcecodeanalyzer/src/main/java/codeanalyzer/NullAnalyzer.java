package codeanalyzer;

import java.io.IOException;

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
