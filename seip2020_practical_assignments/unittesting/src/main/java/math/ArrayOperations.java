package math;

import java.util.ArrayList;
import java.util.List;

import io.FileIO;

/**
* <h1>Array Operations</h1>
* The Array Operations program implements simple arithmetic
* operations on an array. It reads a given file with integers by the user 
* and checks which of these numbers are prime.
*
* @author  Dimitra Karadima
* @version 0.0.1-SNAPSHOT
* @since   April 2020
*/

public class ArrayOperations {

	/**
	  * This method is used to check which numbers are prime or not from a given file. 
	  * @param fileIo This is an object of FileIO class.
	  * @param filepath This is the path to the file given by the user.
	  * @param myMath This is an object of MyMath class.
	  * @return int[] This returns an array of all the integers found in the given file and are prime.
	  */
	
	public int[] findPrimesInFile(FileIO fileIo, String filepath, MyMath myMath) {
		int[] inserted = fileIo.readFile(filepath);
		List<Integer> output = new ArrayList<>();
		for (int i=0;i<inserted.length;i++) {
			if (myMath.isPrime(inserted[i])) {
				output.add(inserted[i]);
			}
		}
		return output.stream().mapToInt(i -> i).toArray();
	}
}
