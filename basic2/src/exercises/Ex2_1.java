package exercises;

import java.util.Scanner;

public class Ex2_1 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = input.nextInt();
		if (year % 400 == 0 || year % 4 == 0) {
			System.out.printf("%d is Leap Year", year);
		} else {
			System.out.printf("%d isn't Leap Year", year);
		}
	}
}
