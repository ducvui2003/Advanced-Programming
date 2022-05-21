package exercisesLoop;

import java.util.Random;

public class Ex8 {
	public static void main(String[] args) {
		Random rd = new Random();
		int number = rd.nextInt(10);
		System.out.println("Number: " + number);

		System.out.println("Total = " + total(number));

		System.out.println(number + "! = " + factorial(number));
	}

	private static int total(int number) {
		int total = 0;
		for (int i = 1; i <= number; i++) {
			total = total + i;
		}
		return total;
	}

	private static int factorial(int number) {
		int facrorial = 1;
		for (int j = 1; j <= number; j++) {
			facrorial = facrorial * j;
		}
		return facrorial;
	}
}
