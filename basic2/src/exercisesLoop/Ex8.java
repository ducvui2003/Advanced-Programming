package exercisesLoop;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		long total = 0, multip = 1;
		for (int i = 1; i <= number; i++) {
			total = total + i;
		}
		System.out.println("S = " + total);
		for (int j = 1; j <= number; j++) {
			multip = multip * j;
		}
		System.out.println(number + "! = " + multip);
	}
}
