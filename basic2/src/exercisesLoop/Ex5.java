package exercisesLoop;

import java.util.Iterator;
import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a natural number: ");
		int number = input.nextInt();
		int ULLN = 1;

//	Find ULLN
		for (int i = 1; i <= number; i++) {
			if (number % i == 0 && i % 2 != 0)
				ULLN = i;
		}
		System.out.println("ULLN is " + ULLN);

//		int i = 1;
//		do {
//			i++;
//		} while (number % i != 0 && i < number);
//		if (i == number)
//			System.out.println(number + " is a prime number");
//		else
//			System.out.println(number + " isn't a prime number");

//	Check prime number
//		1 and 2 is prime number
		if (number == 1 || number == 2) {
			System.out.println(number + " is a prime number");
		} else {
			if (number % ULLN == 0) {
//			All number is old number, expect 1 and 2
				int i = 2;
				do {
					i++;
				} while (number % i != 0 && i < number);
//				Example: number is 7, i = 1 -> i = 6, the loop
//				When i = 7, the loop will stop, return i = 7
				if (i == number)
					System.out.println(number + " is a prime number");
				else
					System.out.println(number + " isn't a prime number");

			} else {
				System.out.println(number + " isn't a prime number");
			}
		}
//	separate number to prime factors
		int division = 0;
//		for (int i = 1; number % 2 != 0 && i < number; i++) {
//			for (int j = 1; j <= i; j++) {
//				if (i % j == 0 && j % 2 != 0)
//					ULLN = j;
//				if (j == ULLN) {
//					division = number / j;
//				}
//				System.out.print(division + " * ");
//			}
//		}

//	Find and Print all prime number	< number
		System.out.printf("Prime number lower than %d is: \n", number);
		for (int i = 1; i < number; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0 && j % 2 != 0)
					ULLN = j;
				if (i == ULLN)
					System.out.printf("%d %s", i, (i < 2) ? "2 " : "");
			}

		}
	}

}
