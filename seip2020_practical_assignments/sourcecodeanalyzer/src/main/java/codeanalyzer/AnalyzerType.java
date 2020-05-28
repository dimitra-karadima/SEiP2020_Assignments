package codeanalyzer;

import java.io.IOException;

public interface AnalyzerType {
	
	public int calculateLOC(String filepath, SourceFileReader fileReader) throws IOException;
	public int calculateNOM(String filepath, SourceFileReader fileReader) throws IOException;
	public int calculateNOC(String filepath, SourceFileReader fileReader) throws IOException;

}
