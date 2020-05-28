package codeanalyzer;

import java.io.IOException;

/**
 * This interface contains abstract methods that reads file from a given file location
 * and calculates metrics LOC,NOM and NOC. 
 * @author Dimitra
 *
 */

public interface AnalyzerType {
	
	/**
	 * Reads a file from a given file path and calculates LOC metric.
	 * @param filepath a string showing the path of the file
	 * @param fileReader an object that depends where the file is located
	 * @return an integer that contains the calculation of the LOC metric
	 * @throws IOException when something happens while parsing the file
	 */
	public int calculateLOC(String filepath, SourceFileReader fileReader) throws IOException;
	
	/**
	 * Reads a file from a given file path and calculates NOM metric.
	 * @param filepath a string showing the path of the file
	 * @param fileReader an object that depends where the file is located
	 * @return an integer that contains the calculation of the NOM metric
	 * @throws IOException when something happens while parsing the file
	 */
	public int calculateNOM(String filepath, SourceFileReader fileReader) throws IOException;
	
	/**
	 * Reads a file from a given file path and calculates NOC metric.
	 * @param filepath a string showing the path of the file
	 * @param fileReader an object that depends where the file is located
	 * @return an integer that contains the calculation of the NOC metric
	 * @throws IOException when something happens while parsing the file
	 */
	public int calculateNOC(String filepath, SourceFileReader fileReader) throws IOException;

}
