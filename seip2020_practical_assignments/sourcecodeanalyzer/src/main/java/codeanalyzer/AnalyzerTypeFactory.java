package codeanalyzer;

/**
 * This class is used for the Factory design principle.
 * @author Dimitra
 *
 */

public class AnalyzerTypeFactory {
	
	/**
	 * This class creates a certain AnalyzerType based on the given analysis type of the file.
	 * @param type that contains the analysis type
	 * @return a certain AnalyzerType
	 */
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
