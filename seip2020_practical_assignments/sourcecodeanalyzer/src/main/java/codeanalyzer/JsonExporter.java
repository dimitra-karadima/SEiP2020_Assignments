package codeanalyzer;

import java.util.Map;

/**
 * This class implements the MetricsExporter interface
 * and writes a JSON file to a given file path.
 * @author Dimitra
 *
 */

public class JsonExporter implements MetricsExporter{
	
	/**
	 * Reads the metrics and a file path 
	 * and writes a JSON file in the given file path.
	 * @param metrics a map of Strings and Integers that contains the name of the metric and the counter
	 * @param filepath a string of where the method should write the file
	 */
	@Override
	public void writeFile(Map<String, Integer> metrics, String filepath) {
		// Functionality not implemented yet
		// No need to implement it for the assignment
	}

}
