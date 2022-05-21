package exercisesLoop;

import java.util.Random;

public class Ex2 {
	public static void main(String[] args) {
		Random rd = new Random();
		int number = rd.nextInt(10000);
		System.out.println("Number: " + number);

//		Convert from integer -> String
		System.out.println("Length of number is: " + lenghtOfInt(number));

//		Reserve of number
		System.out.println("Reserve of number is: " + reserveNumber(number));
	}

	public static String numberToString(int number) {
//		Convert from integer -> String
		String numberConvertString = "" + number;
		return numberConvertString;
	}

	public static int lenghtOfInt(int number) {
		String numberConvertString = "" + number;
		int length = numberToString(number).length();
		return length;
	}

	public static String reserveNumber(int number) {
//		Reserve of number
		char ch;
		String reserveNumber = "";
		for (int i = 0; i < lenghtOfInt(number); i++) {

//		charAt to identify position of characters
			ch = numberToString(number).charAt(i);

//		Make String from ch	
			reserveNumber = ch + reserveNumber;
		}
		return reserveNumber;
	}

}
