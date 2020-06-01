package codeanalyzer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * This interface contains an abstract method that writes metrics to a given filepath. 
 * @author Dimitra
 *
 */
public interface MetricsExporter {
	
	/**
	 * This abstract class will be used as an Override in order to write a certain file type.
	 * @param metrics a map of Strings and Integers that contains the name of the metric and the counter
	 * @param filepath a string of where the method should write the file
	 */
	public void writeFile(Map<String, Integer> metrics, String filepath);

}
