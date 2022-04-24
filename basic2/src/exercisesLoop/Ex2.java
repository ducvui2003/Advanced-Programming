package exercisesLoop;

import java.util.Iterator;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a natural number: ");
		int number = input.nextInt();
		
//		Convert from integer -> String
		String numberConvertString = String.valueOf(number);
		int length = numberConvertString.length();		
		System.out.println("Length of number is: " + length);
		
//		Reserve of number
		char ch;
		String reserveNumber = "";
		for (int i = 0; i < length; i++) {
			
//		charAt to identify position of characters
			ch = numberConvertString.charAt(i);	
			
//		Make String from ch	
			reserveNumber = ch + reserveNumber;
		}
		System.out.println("Reserve of number is: " + reserveNumber);
	}
}
