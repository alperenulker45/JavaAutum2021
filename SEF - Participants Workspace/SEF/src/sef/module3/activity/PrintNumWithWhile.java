/**
 * 
 */
package sef.module3.activity;

/**
 * @author 
 *
 */
public class PrintNumWithWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		// Print all even numbers less than 100
		int i = 0;
		while(i<100){
			System.out.println(i);
			i=i+2;			
		}
		
		 
		// write code to Print all odd numbers less than 100
		int j =1;
		System.out.println("ODD NUMBERS");
		while(j<100) {
				System.out.println(j);
			j+=2;
		}

		//second way with if and modulo
		System.out.println("ODD NUMBERS SECOND WAY");
		int x=0;
		while(x<100){
			if(x%2==1)
				System.out.print(x+ " ");
			x++;

		}

	}

}
