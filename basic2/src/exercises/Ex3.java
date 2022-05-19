package exercises;

import java.util.Random;

public class Ex3 {
	public static void main(String[] args) {
		Random rd = new Random();
		double a = Math.round(rd.nextDouble() * 100.0) / 10.0;
		double b = Math.round(rd.nextDouble() * 100.0) / 10.0;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.printf(a + "x%s=0\n", (b < 0) ? b : "+" + b);

		equal(a, b);
	}

	private static void equal(double a, double b) {
		if (a == 0)
			System.out.println("No solution");
		else if (a == 0 && b == 0)
			System.out.println("Infinity Sol");
		else
			System.out.println("Experimental of equation is: " + (Math.round(-b / a * 100.0)) / 100.0);

	}
}
