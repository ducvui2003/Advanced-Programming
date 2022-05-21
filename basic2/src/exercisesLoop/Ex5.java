package exercisesLoop;

import java.util.Random;

public class Ex5 {
	public static void main(String[] args) {
		Random rd = new Random();
		int number = rd.nextInt(1000);
		System.out.println("Number: " + number);

//	Find ULLN
		System.out.println("ULLN is " + findULLN(number));

//	Check prime number
		if (checkPrimeNumber(number)) {
			System.out.println(number + " is a prime number");
		}
		System.out.println(number + " isn't a prime number");

//	Find and Print all prime number	< number
//		primeNumberLower(number);
//		System.out.println("The prime number lower than " + number + primeNumberLower(number));

	}

//	Find ULLN
	private static int findULLN(int number) {
		int ULLN = 1;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0 && i % 2 != 0)
				ULLN = i;
		}
		return ULLN;
	}

//	Check prime number
	private static boolean checkPrimeNumber(int number) {
//		1 and 2 is prime number
		if (number == 2) {
			return true;
		} else {
//			All number is old number, expect 1 and 2
			int i = 2;
			do {
				i++;
			} while (number % i != 0);
//				Example: number is 7, i = 1 -> i = 6, the loop
//				When i = 7, the loop will stop, return i = 7
			if (i == number) 
				return true;
			else
				return false;
		}
	}

//	Find and print the prime number lower than number
//	find prime number lower than number
	private static String primeNumberLower(int number) {
		String primeNumber = "";
		for (int i = 0; i < number; i++) {
			if (checkPrimeNumber(i)) {
				primeNumber = primeNumber + " " + i;
			}
		}
		return primeNumber;
	}
}
