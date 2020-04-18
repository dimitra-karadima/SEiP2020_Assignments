package math;

/**
* <h1>My Math</h1>
* The My Math program implements simple arithmetic
* operations, it calculates the factorial of a given number
* and checks if a number is prime or not.
*
* @author  Dimitra Karadima
* @version 0.0.1-SNAPSHOT
* @since   April 2020
*/

public class MyMath {
	
	/**
	  * This method is used to calculate the factorial of a given number. 
	  * @param n This is the number given by the user.
	  * @return int This returns the factorial of the given number
	  * @exception IllegalArgumentException when the given number is negative
	  * @exception IllegalArgumentException when the given number is greater than 12
	  */
	
	public int factorial (int n) throws IllegalArgumentException{
		if (n<0) {
			throw new IllegalArgumentException("Cannot calculate factorial of negative numbers");
		} else if (n>12) {
			throw new IllegalArgumentException("Cannot calculate factorial of number more than 12");
		} else if (n == 0) {
			return 1;
		} else {
			return(n*factorial(n-1));
		}
	}
	
	/**
	  * This method is used to check whether a given number is prime or not. 
	  * @param n This is the number given by the user.
	  * @return boolean This returns true if the given number is number and false if it is not
	  * @exception IllegalArgumentException when the given number is lower than 2
	  */
	public boolean isPrime(int n) throws IllegalArgumentException{
		if (n<2) {
			throw new IllegalArgumentException("Cannot check number lower than 2");
		}
		for(int i=2;i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
}
