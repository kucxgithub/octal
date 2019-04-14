# octal
/**
 * Basic converter from Octal to Decimal.
 * @author Karen Urate
 * @since April 14, 2019
 */
 
Sample Implementation from Main:
public static void main(String[] args) {

		Octal octal = new Octal();
		System.out.printf("The decimal version of octal 350 is: %.0f\n\n",(octal.toDecimal("350"))); // 232
		System.out.printf("The decimal version of octal 013 is: %.0f\n\n",(octal.toDecimal("013"))); // 11
		System.out.printf("The decimal version of octal 117 is: %.0f\n\n",(octal.toDecimal("117"))); // 79
		System.out.printf("The decimal version of octal 377 is: %.0f\n\n",(octal.toDecimal("377"))); // 255
		System.out.printf("The decimal version of octal 010 is: %.0f\n\n",(octal.toDecimal("010"))); // 8
		
	}
  
Sample Output:
The decimal version of octal 350 is: 232

The decimal version of octal 013 is: 11

The decimal version of octal 117 is: 79

The decimal version of octal 377 is: 255

The decimal version of octal 010 is: 8
