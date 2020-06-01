package codeanalyzer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * This class implements the MetricsExporter interface
 * and writes a CSV file to a given file path.
 * @author Dimitra
 *
 */

public class CsvExporter implements MetricsExporter{

	/**
	 * Reads the metrics and a file path 
	 * and writes a CSV file in the given file path.
	 * @param metrics a map of Strings and Integers that contains the name of the metric and the counter
	 * @param filepath a string of where the method should write the file
	 */
	@Override
	public void writeFile(Map<String, Integer> metrics, String filepath) {
		File outputFile = new File(filepath + ".csv");
		StringBuilder metricsNames = new StringBuilder();
		StringBuilder metricsValues = new StringBuilder();
		
		for (Map.Entry<String, Integer> entry : metrics.entrySet()) {
			metricsNames.append(entry.getKey() + ",");
			metricsValues.append(entry.getValue()+",");
		}
		
		try {
			FileWriter writer = new FileWriter(outputFile);
			writer.append(metricsNames + "\n");
			writer.append(metricsValues + "\n");
			writer.close();
			System.out.println("Metrics saved in " + outputFile.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
