package exercises;

import java.util.Random;

public class Ex2_2 {
	public static void main(String[] args) {
		Random rd = new Random();
		int month = rd.nextInt(11)+1;
		System.out.println("Month: " + month);
		int year = rd.nextInt(3000);
		System.out.println("Year: " + year);
		daysInMonth(month, year);
	}

	private static void daysInMonth(int month, int year) {
		if (month <= 12) {
			if (month == 2) {
				if (year % 400 == 0 || year % 4 == 0)
					System.out.println("Days of month is 29 days");
				else
					System.out.println("Days of month is 28 days");
			} else if ((month % 2 == 1 && month < 8) || (month % 2 == 0 && month >= 8))
				System.out.println("Days of month is 31 days");
			else
				System.out.println("Days of month is 30 days");
		} else {
			System.out.println("Not available");
		}
	}
}
