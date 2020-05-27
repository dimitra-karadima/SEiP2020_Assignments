package codeanalyzer;

/**
 * This class is used for the Factory design pattern.
 * @author Dimitra
 *
 */

public class SourceFileReaderFactory {
	
	private SourceFileReader fileReader;
	
	/**
	 * This class creates a certain SourceFileReader based on the given source code file location.
	 * @param type that contains the source code file location
	 * @return a certain SourceFileReader
	 */
	public SourceFileReader createSourceFileReader(String type) {
		if (type.equals("local")) {
			fileReader = new Local();
		} else if (type.equals("web")) {
			fileReader = new Web();
		} else {
			fileReader = new NullFileReader();
		}
		return fileReader;
	}

}
