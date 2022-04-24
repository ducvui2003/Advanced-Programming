package logicalOperators;

import java.util.Scanner;

public class TestBooleanOperators {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		String equals = "";
		if (number % 2 == 0 && number % 3 == 0) {
			equals = " division by 2 and 3?";
		}
		if (number % 2 == 0 || number % 3 == 0) {
			equals = " division by 2 or 3?";
		}
		if (number % 2 == 0 ^ number % 3 == 0) {
			equals = " division by 2 or 3, but not both?";
		}
		if (number % 2 != 0 && number % 3 != 0)
			equals = " disdivision by 2 and 3?";

		System.out.println("Is " + number + equals);

	}
}
