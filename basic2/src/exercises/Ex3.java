package exercises;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 2 number are a, b (a . x + b = 0): ");
		double a = input.nextInt();
		double b = input.nextInt();
		if (a == 0)
			System.out.println("No solution");
		else if (a == 0 && b == 0)
			System.out.println("Infinity Sol");
		else
			System.out.println("Experimental of equation is: " + (Math.round(-b / a * 100.0)) / 100.0);
	}

}
