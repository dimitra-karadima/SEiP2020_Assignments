package codeanalyzer;

/**
 * Analyzes the contents of a Java source code file 
 * and calculates the following metrics: loc = lines of code,
 * nom = number of methods, and noc=number of classes. 
 * The current functionality supports two types of source code analysis,
 * namely regex (with the use of regular expressions) and 
 * strcomp (with the use of string comparison).
 * This class deliberately contains code smells and violations of design principles. 
 * @author agkortzis
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
