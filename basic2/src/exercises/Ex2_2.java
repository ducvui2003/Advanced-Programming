package exercises;

import java.util.Scanner;

public class Ex2_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter month and year: ");
		int month = input.nextInt();
		int year = input.nextInt();
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
		}else {
			System.out.println("Not available");
		}
	}
}
