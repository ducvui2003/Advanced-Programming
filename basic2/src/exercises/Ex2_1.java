package exercises;

import java.util.Random;

public class Ex2_1 {
	public static void main(String[] args) {

		Random rd = new Random();
		int year = rd.nextInt(3000);
		System.out.println("Year: " + year);
		checkYear(year);
	}

	private static void checkYear(int year) {
		if (year % 400 == 0 || year % 4 == 0) {
			System.out.printf("%d is Leap Year", year);
		} else {
			System.out.printf("%d isn't Leap Year", year);
		}
	}
}
