package codeanalyzer;

import java.util.Map;

/**
 * This class is used for the Null Object design principle.
 * This class handles the cases where an unknown type of file is given.
 * @author Dimitra
 *
 */

public class NullExporter implements MetricsExporter{

	/**
	 * Reads the metrics and a filepath 
	 * and throws an IllegalArgumentException because an unknown type is given
	 * @param metrics a map of String and Integers that contains the name of the metric and the counter
	 * @param filepath a string of where the method should write the file
	 * @exception IllegalArgumentException when an unknown type of file is given 
	 */
	@Override
	public void writeFile(Map<String, Integer> metrics, String filepath) {
		throw new IllegalArgumentException("Unknown type");
	}

}
