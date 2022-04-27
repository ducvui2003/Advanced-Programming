package exercises;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter day, month and year (dd/mm/yyyy): ");
		System.out.print("day: ");
		int day = input.nextInt();
		System.out.print("month: ");
		int month = input.nextInt();
		System.out.print("year: ");
		int year = input.nextInt();
		if (month <= 12) {
//			February
			if (month == 2 && (year % 400 == 0 || year % 4 == 0) && day <= 29) {
				System.out.println("Available");
				System.out.printf("The next date is %d/%d/%d", (day == 29) ? 1 : day + 1, (day == 29) ? 3 : month,
						year);
			} else {
				if (month == 2 && day <= 28) {
					System.out.println("Available");
					System.out.printf("The next date is %d/%d/%d", (day == 28) ? 1 : day + 1, (day == 28) ? 3 : month,
							year);
				} else {
//			Months have 31 days
					if ((month <= 7 && month % 2 != 0) && (month > 7 && month % 2 == 0) && day <= 31) {
						System.out.println("Available");
						System.out.printf("The next date is %d/%d/%d", (day == 31) ? 1 : day + 1,
								(day == 31) ? month + 1 : month, (day == 31 && month == 12) ? year + 1 : year);
					} else {
//			Months have 30 days
						if (day <= 30) {
							System.out.println("Available");
							System.err.printf("The next date is %d/%d/%d", (day == 30) ? 1 : day + 1,
									(day == 30) ? month + 1 : month, year);
						}
					}
				}
			}
		} else {
			System.out.println("Not available");
		}
	}
}
