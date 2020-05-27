package codeanalyzer;

import java.io.IOException;
import java.util.List;

/**
 * This interface contains an abstract method that reads file from a given file location. 
 * @author Dimitra
 *
 */

public interface SourceFileReader {

	/**
	 * Reads a file from a given file path.
	 * @param filepath a string showing the path of the file
	 * @return a list of Strings that contains the content of the read file
	 * @throws IOException when something happens while parsing the file
	 */
	public List<String> readFileIntoList(String filepath) throws IOException;
	/**
	 * Reads a file from a given file path.
	 * @param filepath a string showing the path of the file
	 * @return string that contains the content of the read file
	 * @throws IOException when something happens while parsing the file
	 */
	public String readFileIntoString(String filepath) throws IOException;
	
}
