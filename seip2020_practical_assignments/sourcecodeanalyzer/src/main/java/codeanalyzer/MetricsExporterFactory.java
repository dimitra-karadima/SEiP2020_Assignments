package codeanalyzer;

/**
 * This class is used for the Factory design principle.
 * @author Dimitra
 *
 */

public class MetricsExporterFactory {

	/**
	 * This class creates a certain MetricsExporter based on the given output Type of the file.
	 * @param outputType that contains the type of the output file
	 * @return a certain MetricsExporter
	 */
	public MetricsExporter createMetricsExporter(String outputType) {
		MetricsExporter metricsExporter;
		if (outputType.equals("csv")) {
			metricsExporter = new CsvExporter();
		} else if (outputType.equals("json")) {
			metricsExporter = new JsonExporter();
		} else {
			metricsExporter = new NullExporter();
		}
		return metricsExporter;
	}
	
}
