

import java.util.Scanner;

/**
 * Basic converter from Octal to Decimal.
 * This version has error-checking that continually prompts a user for an octal
 * until a valid numerical input is entered.
 * @author Karen Urate
 * @since April 14, 2019
 */
public class Octal {

	private Scanner scanner;
	
	
	public static void main(String[] args) {

		Octal octal = new Octal();
		System.out.printf("The decimal version of octal 350 is: %.0f\n\n",(octal.toDecimal("350"))); // 232
		System.out.printf("The decimal version of octal 013 is: %.0f\n\n",(octal.toDecimal("013"))); // 11
		System.out.printf("The decimal version of octal 117 is: %.0f\n\n",(octal.toDecimal("117"))); // 79
		System.out.printf("The decimal version of octal 377 is: %.0f\n\n",(octal.toDecimal("377"))); // 255
		System.out.printf("The decimal version of octal 010 is: %.0f\n\n",(octal.toDecimal("010"))); // 8
		System.out.printf("The decimal version of my custom octal is: %.0f\n\n",(octal.toDecimal("something odd"))); // 8
		
	}

	public Octal() {
		
		this.scanner = new Scanner(System.in);
		
	}
	
	public double toDecimal(String octal) {
		
		double decimal = 0.0;
		int counter = counter(octal) - 1;
		int converted = 0;
		
		try {
			
			converted = Integer.parseInt(octal);
			
		} catch (NumberFormatException e) {

			System.out.println("Error: your input is not an octal.\nPlease enter an octal:");
			String input = "";
			
			while(!scanner.hasNextInt()) {
				System.out.println("Invalid Input: Not an Octal.\nPlease enter an octal:");
				input = scanner.nextLine();
			}
			input = scanner.nextLine();
			converted = Integer.parseInt(input);
		} 
		
		double initial = converted % Math.pow(10, counter); 
		int test = (int) ( converted / Math.pow(10, counter)); 
		decimal = (test * (Math.pow(8, counter))); 
		
		for(int i = 1,j=counter-1; i<counter(octal); i++,j--) {
			
			double curr = (initial / Math.pow(10,j)) - ( (initial % Math.pow(10,j)) / Math.pow(10,j) ); 
			decimal += ( curr * (Math.pow(8, j)) ); 
			initial = initial % Math.pow(10,j); 
			
			
		}
		
		return Math.round(decimal);

	}
	
	private int counter(String octal) {

		int curr = octal.trim().length();
		
		return curr;
		
	}
	
}
