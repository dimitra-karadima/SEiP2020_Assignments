import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
* <h1>Histogram Generator</h1>
* The Histogram Generator program implements an application that
* reads a path to a txt file given by the user in the command line
* and generates a histogram that shows the frequency each grade has
* in the input txt file. 
*
* @author  Dimitra Karadima
* @version 0.0.1-SNAPSHOT
* @since   March 2020
*/

public class HistogramGenerator {

	/**
	  * This is the main method that reads the path of the file given by the user. 
	  * Then, this method makes use of readGraphs and generateChart method.
	  * @param args Unused.
	  * @return Nothing.
	  */
	
	public static void main(String[] args) {
		//File path = new File(args[0]);
		File path = new File("C://Users//Dimitra//Desktop//grades.txt");
		int[] dataValues = readGrades(path);
		generateChart(dataValues);
	}
	
	/**
	  * This method is used to read the grades from the given txt file.
	  * The method reads each line of the file and increases by one the index of the array
	  * equal to the value of the grade. For example if the method reads the grade 1 the value
	  * of int[0] increases by one, if it reads the grade 1 then it increases the value int[1]
	  * by one and so on.
	  * @param path This is the path to the txt file given by the user.
	  * @return int[] This returns an array of the frequency for every value in the file
	  * @exception IOException will be throwed if the path given by the user is invalid
	  */
	
	public static int[] readGrades(File path) {
		BufferedReader reader;
		int[] data = new int[11];
		try {
			reader = new BufferedReader(new FileReader(path));
			String line = reader.readLine();
			while (line != null) {
				data[Integer.parseInt(line)]++;					
				// read next line
				line = reader.readLine();				
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}
	
	/**
	  * This method is used to generate the histogram where the y axis refers to the grades
	  * and the x axis show how many times each of the grade appears in the file.
	  * @param dataValues This is array with integers that the method readGrades() returned.
	  * @return Nothing.
	  */
	
	public static void generateChart(int[] dataValues) {
		XYSeriesCollection dataset = new XYSeriesCollection();
		XYSeries data = new XYSeries("random values");
		for (int i = 0; i < dataValues.length; i++) {
			data.add(i, dataValues[i]);
		}
		dataset.addSeries(data);

		boolean legend = false; 
		boolean tooltips = false; 
		boolean urls = false;
		JFreeChart chart = ChartFactory.createXYLineChart("Grades' histogram", "grades", "frequency", dataset,
				PlotOrientation.VERTICAL, legend, tooltips, urls);
		ChartFrame frame = new ChartFrame("Grades' Statistics", chart);
		frame.pack();
		frame.setVisible(true);
	}

}
