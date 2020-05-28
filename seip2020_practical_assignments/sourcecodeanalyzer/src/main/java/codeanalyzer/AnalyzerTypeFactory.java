package codeanalyzer;

public class AnalyzerTypeFactory {
	
	public AnalyzerType createAnalyzerType(String type) {
		AnalyzerType analyze;
		if (type.equals("regex")) {
			analyze = new Regex();
		} else if(type.equals("strcomp")){
			analyze = new Strcomp();
		}else {
			analyze = new NullAnalyzer();
		}
		return analyze;
	}

}
