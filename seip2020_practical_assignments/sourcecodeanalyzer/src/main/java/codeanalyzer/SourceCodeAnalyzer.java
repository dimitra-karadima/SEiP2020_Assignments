package codeanalyzer;

/**
 * This class creates a FileReader. It will be used from the DemoClient in order to run properly.
 * @author Dimitra
 *
 */
public class SourceCodeAnalyzer {
	
	private SourceFileReaderFactory fileReaderFactory = new SourceFileReaderFactory();
	private SourceFileReader fileReader;
	
	public SourceCodeAnalyzer(String fileReaderType) {
		fileReader = fileReaderFactory.createSourceFileReader(fileReaderType);
	}
	
	public SourceFileReader getFileReader() {
		return fileReader;
	}

}
