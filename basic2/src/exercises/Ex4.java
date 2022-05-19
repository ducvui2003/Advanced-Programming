package exercises;

import java.util.Random;

public class Ex4 {
	public static void main(String[] args) {
		Random rd = new Random();
		double a = Math.round(rd.nextDouble() * 200.0) / 10.0;
		double b = Math.round(rd.nextDouble() * 200.0) / 10.0;
		double c = Math.round(rd.nextDouble() * 200.0) / 10.0;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println(a + "x^2 + " + "(" + b + ")x + " + "(" + c + ") = 0");
		calculate(a, b, c);
	}

	private static void calculate(double a, double b, double c) {
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
				x1 = Math.round(x1*100.0)/10.0;
				x2 = (-b - Math.sqrt(denta) / (2 * a));
				x2 = Math.round(x2*100.0)/10.0;
				System.out.println("Equation has 2 solutions are: \n-x1 = " + x1 + "\n-x2 = " + x2);
			}
		}

	}
}
