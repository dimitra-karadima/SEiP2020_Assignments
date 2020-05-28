package codeanalyzer;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Facade {
	
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
