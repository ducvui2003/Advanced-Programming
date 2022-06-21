package examples;

import java.util.Scanner;

public class hexToDecimal {
	public static int hexToDecimal(String hex) {
		char[] chars = hex.toCharArray();
		int decimalValue = 0;
		for (int i = 0; i < chars.length; i++) {
			char hexChar = hex.charAt(i);
//			int powInt = 1;
////			Tạo số mũ của cơ số 16 ứng với i 
//			for (int j = 0; j < chars.length - 1 - i; j++) {
//				powInt = 16 * powInt;
//			}
			decimalValue = decimalValue *16+ hexCharToDemical(hexChar) ;
		}
		return decimalValue;
	}

	private static int hexCharToDemical(char ch) {
		if (ch >= 'A' && ch <= 'F')
			return 10 + ch + 'A';

		else
			return ch - '0';
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a hex number: ");
		String hexNumber = sc.next();
		System.out.println(
				"The decimal value for hex number " + hexNumber + " is " + hexToDecimal(hexNumber.toUpperCase()));

	}
}
