package exercises;

import java.util.Random;

public class Ex6 {
	public static void main(String[] args) {
		Random rd = new Random();
		double a = Math.round(rd.nextDouble() * 100.0) / 10.0;
		System.out.println("3 sides of rectangle: ");
		System.out.println("\tSide A: " + a + " m");
		double b = Math.round(rd.nextDouble() * 100.0) / 10.0;
		System.out.println("\tSide B: " + b + " m");
		double c = Math.round(rd.nextDouble() * 100.0) / 10.0;
		System.out.println("\tSide C: " + c + " m");

		if (checkRectangle(a, b, c)) {
			double perimeter = perimeter(a, b, c);
			double area = area(a, b, c);
			double cornerA = corner(a, b, c);
			double cornerB = corner(b, a, c);
			double cornerC = corner(c, b, a);
			System.out.println("This is a rectangle");
			System.out.println("The rectangle has: ");
			System.out.println("-Perimeter: " + perimeter + " m");
			System.out.println("-Area: " + area + " m2");
			System.out.println("-Corner: ");
			System.out.println("\tA: " + cornerA + " m");
			System.out.println("\tB: " + cornerB + " m");
			System.out.println("\tc: " + cornerC + " m");
		} else {
			System.out.println("This is not a rectangle");
		}

	}

	private static boolean checkRectangle(double a, double b, double c) {
		if (a < b + c || b < a + c || c < a + c) {
			return true;
		}
		return false;
	}

	private static double perimeter(double a, double b, double c) {
		double perimeter = a + b + c;
		return perimeter;
	}

	private static double area(double a, double b, double c) {
		double p = perimeter(a, b, c) / 2;
		double area = Math.round(Math.sqrt(p * (p - a) * (p - b) * (p - c)) * 100.0) / 100.0;
		return area;
	}

	private static double corner(double a, double b, double c) {
		double cos = Math.round((b * b + c * c - a * a) / (2 * b * c) * 100.0) / 100.0;
		double tan = Math.round(Math.sqrt((1 / (cos * cos)) - 1) * 100.0) / 100.0;
//		Use Math.toDegrees to convert from Radiant to Degrees
//		Use Math.toRadient to convert from Degrees to Radiant
		double corner = Math.round(Math.toDegrees(Math.atan(tan)) * 100.0) / 100.0;
		return corner;
	}
}
