package exercises;

import java.util.Random;

public class Ex1 {
	public static void main(String[] args) {
//	Create 2 Random number
		Random rd = new Random();
		double a = Math.round(rd.nextDouble() * 100) / 10.0;
		double b = Math.round(rd.nextDouble() * 100) / 10.0;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		compare(a, b);
	}

//	Compare 2 numbers
	public static void compare(double a, double b) {
		if (a > b)
			System.out.print(a + " is greater than " + b);
		else
			System.out.print(b + " is greater than " + a);
	}

}
