package demo;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import codeanalyzer.*;

public class DemoClient {

	public static void main(String[] args) throws IOException {
		String filepath = "src/main/resources/TestClass.java";
		String sourceCodeAnalyzerType = "regex";
		String sourceFileLocation = "local";
		String outputFilePath = "output_metrics";
		String outputFileType = "csv";
		
		if(args.length == 5) {
			filepath = args[0];
			sourceCodeAnalyzerType = args[1];
			sourceFileLocation = args[2];
			outputFilePath = args[3];
			outputFileType = args[4];
		} else if (args.length != 0) {
			System.out.println("Incorrect number of arguments.");
			System.exit(1);
		}

		AnalyzerTypeFactory analyzerFactory = new AnalyzerTypeFactory();
		AnalyzerType analyzer = analyzerFactory.createAnalyzerType(sourceFileLocation);
		SourceCodeAnalyzer source = new SourceCodeAnalyzer(sourceCodeAnalyzerType);
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
