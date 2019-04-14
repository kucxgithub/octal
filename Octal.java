/**
 * Basic converter from Octal to Decimal.
 * @author Karen Urate
 * @since April 14, 2019
 */
public class Octal {

	public static void main(String[] args) {

		Octal octal = new Octal();
		System.out.printf("The octal of 350 is: %d\n\n",(int)(octal.toDecimal("350"))); // 232
		System.out.printf("The octal of 013 is: %d\n\n",(int)(octal.toDecimal("013"))); // 11
		System.out.printf("The octal of 117 is: %d\n\n",(int)(octal.toDecimal("117"))); // 79
		System.out.printf("The octal of 377 is: %d\n\n",(int)(octal.toDecimal("377"))); // 255
		System.out.printf("The octal of 010 is: %d\n\n",(int)(octal.toDecimal("010"))); // 8
		
	}

	public double toDecimal(String octal) {
		
		double decimal = 0.0;
		int counter = counter(octal) - 1;
		int converted = Integer.parseInt(octal);
		
		double initial = converted % Math.pow(10, counter); 
		int test = (int) ( converted / Math.pow(10, counter)); 
		decimal = (test * (Math.pow(8, counter))); 
		
		for(int i = 1,j=counter-1; i<counter(octal); i++,j--) {
			
			double curr = (initial / Math.pow(10,j)) - ( (initial % Math.pow(10,j)) / Math.pow(10,j) ) ; 
			decimal += ( curr * (Math.pow(8, j)) ); 
			initial = initial % Math.pow(10,j); 
			
			
		}
		
		return decimal;

	}
	
	private int counter(String octal) {

		int curr = octal.trim().length();
		
		return curr;
		
	}
	
}
