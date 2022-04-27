package exercises;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 3 number are a, b, c (a . x^2 + b . x + c = 0): ");
		double a = input.nextInt();
		double b = input.nextInt();
		double c = input.nextInt();
		double x, x1, x2;
		double denta = b * b - 4 * a * c;
		if (denta < 0) {
			System.out.println("Equation has no solution");
		} else {
			if (denta == 0) {
				x = -b / 2 * a;
				System.out.println("Equation has a solution is: x= " + x);
			} else {
				x1 = (-b + Math.sqrt(denta) / (2 * a));
				x2 = (-b - Math.sqrt(denta) / (2 * a));
				System.out.println("Equation has 2 solutions are: \nx1= " + x1 + "\n x2 =");
			}
		}
	}
}
