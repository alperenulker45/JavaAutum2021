package sef.module3.activity;

/**
 * @author 
 *
 */
public class OperatorActivity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Declare numbers to be operated
		int i = 8;
		int j = 5;
		
		// Subtract numbers
		int result = i-j;
		
		// Print result
		System.out.println("Difference = " + result);
		
		// Add numbers
		int addition = i+j;
		
		// Print result
		System.out.println("Addition = " + addition);
		
		//multiply numbers
		int multiply= i*j;
		
		//print result
		System.out.println("Multiply = " + multiply);
		
		//divide numbers
		double division= (double) i / (double) j;

		//print result
		System.out.println("Division = " + division);


		int modulo = i%j;
		//print result
		System.out.println("Modulo = " + modulo);
		
	}

}
