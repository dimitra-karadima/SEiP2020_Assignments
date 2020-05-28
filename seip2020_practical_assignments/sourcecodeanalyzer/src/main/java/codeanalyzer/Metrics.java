package codeanalyzer;

import java.io.IOException;

public abstract class Metrics {

	protected AnalyzerType type;
	private SourceFileReaderFactory fileReaderFactory = new SourceFileReaderFactory();
	private SourceFileReader fileReader;
	
	public void getMetrics(String sourceCodeAnalyzerType,String fileReaderType) {
		fileReader = fileReaderFactory.createSourceFileReader(fileReaderType);
	}
	
	public abstract int calculateMetric(String filepath, SourceFileReader fileReader) throws IOException;
}
