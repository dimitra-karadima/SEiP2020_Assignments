package codeanalyzer;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * This class is used for the Facade design pattern.
 * @author Dimitra
 *
 */

public class Facade {
	
	/**
	 * It implements what the ClientDemo used to do. It just masks this code.
	 * @param filepath a string showing the path of the file
	 * @param sourceCodeAnalyzerType a string showing the analysis type of the file
	 * @param sourceFileLocation a string showing the location of the source code
	 * @param outputFilePath a string showing the output file path
	 * @param outputFileType a string showing the file exporter type
	 * @throws IOException IOException when something happens while parsing the file
	 */
	public void operation(String filepath, String sourceCodeAnalyzerType, String sourceFileLocation, String outputFilePath, String outputFileType) throws IOException{
		AnalyzerTypeFactory analyzerFactory = new AnalyzerTypeFactory();
		AnalyzerType analyzer = analyzerFactory.createAnalyzerType(sourceCodeAnalyzerType);
		SourceCodeAnalyzer source = new SourceCodeAnalyzer(sourceFileLocation);
		int loc = analyzer.calculateLOC(filepath, source.getFileReader());
		int nom = analyzer.calculateNOM(filepath, source.getFileReader());
		int noc = analyzer.calculateNOC(filepath, source.getFileReader());
		
		Map<String, Integer> metrics = new HashMap<>();
		metrics.put("loc",loc);
		metrics.put("nom",nom);
		metrics.put("noc",noc);
				
		MetricsExporterFactory exporterFactory = new MetricsExporterFactory();
		MetricsExporter exporter = exporterFactory.createMetricsExporter(outputFileType);
		exporter.writeFile(metrics, outputFilePath);
	}
	
}
