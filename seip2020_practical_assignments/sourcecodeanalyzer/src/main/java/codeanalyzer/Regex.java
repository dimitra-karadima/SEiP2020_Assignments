package codeanalyzer;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class implements the AnalyzerType interface
 * and reads files with regex analysis type.
 * @author Dimitra
 *
 */

public class Regex implements AnalyzerType {
	
	@Override
	public int calculateLOC(String filepath, SourceFileReader fileReader) throws IOException{
		String sourceCode = fileReader.readFileIntoString(filepath);
		Pattern pattern = Pattern.compile("((//.*)|(/\\*.*)|(\\*+.*))");
	    Matcher nonCodeLinesMatcher = pattern.matcher(sourceCode);

	    int nonCodeLinesCounter = 0;
	    while (nonCodeLinesMatcher.find()) {
	        nonCodeLinesCounter++;
	    }
			
	    int sourceFileLength = sourceCode.split("\n").length;
	    int loc =  sourceFileLength - nonCodeLinesCounter;
	        
	    return loc;
	}
	
	@Override
	public int calculateNOM(String filepath, SourceFileReader fileReader) throws IOException{
		String sourceCode = fileReader.readFileIntoString(filepath);
		Pattern pattern = Pattern.compile(".*(public |protected |private |static )?[\\w\\<\\>\\[\\]]+\\s+(\\w+) *\\([^\\)]*\\) *(\\{?|[^;]).*"); 
	    Matcher methodSignatures = pattern.matcher(sourceCode);

	    int methodCounter = 0;
	    while (methodSignatures.find()) {
	        methodCounter++;
	    }
		return methodCounter;
	}
	
	@Override
	public int calculateNOC(String filepath, SourceFileReader fileReader) throws IOException{
		String sourceCode = fileReader.readFileIntoString(filepath);
		Pattern pattern = Pattern.compile(".*\\s*class\\s+.*"); 
	    Matcher classSignatures = pattern.matcher(sourceCode);

	    int classCounter = 0;
	    while (classSignatures.find()) {
	        classCounter++;
	    }
		return classCounter;
	}
	
}
