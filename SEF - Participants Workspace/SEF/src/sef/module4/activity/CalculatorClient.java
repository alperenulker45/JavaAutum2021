package sef.module4.activity;

import java.util.logging.SocketHandler;

/**
 * @author
 *
 */
public class CalculatorClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*Instantiate Normal Calculator. Note that CALC_TYPE_NORMAL is a public static
		 *final variable defined in Calculator class. 
		*/
		Calculator normalCalculator = new Calculator();
		Calculator normalCalc = new Calculator(Calculator.CALC_TYPE_BASIC);
		
		System.out.println("*** Calculations will be performed using "+normalCalc.getCalculatorType()+ " calculator ***");
		
		// Add 
		int result = normalCalc.add(4, 5);
		System.out.println("1) Add result is " + result);
		
				
		// Multiply 
		int[] mul = {2, 3, 4};
		result = normalCalc.multiply(mul);
		System.out.println("2) Multiplication result is " + result);

		//subtract
		result = normalCalculator.subtract(9, 4);
		System.out.println("3) Subtraction result is " + result);

		//divide
		result = normalCalculator.divide(10, 5);
		System.out.println("4) Division result is " + result);



	}


	

}
