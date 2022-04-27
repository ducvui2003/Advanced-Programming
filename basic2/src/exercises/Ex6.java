package exercises;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 3 lines of rectangle: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		if (a < b + c || b < a + c || c < a + c) {
//			Use Math.round to rounding number
			double perimeter = a + b + c;
			double p = perimeter / 2;
			double area = Math.round(Math.sqrt(p * (p - a) * (p - b) * (p - c)) * 100.0) / 100.0;
			double cosA = Math.round((b * b + c * c - a * a) / (2 * b * c) * 100.0) / 100.0;
			double tanA = Math.round(Math.sqrt((1 / (cosA * cosA)) - 1) * 100.0) / 100.0;
//			Use Math.toDegrees to convert from Radiant to Degrees
//			Use Math.toRadient to convert from Degrees to Radiant
			double cornerA = Math.round(Math.toDegrees(Math.atan(tanA)) * 100.0) / 100.0;
			System.out.printf("The rectangle has: " + "\nArea: " + area + "\nChuVi: " + perimeter + "\nCosA: " + cosA
					+ "\nTanA: " + tanA + "\nCornerA: " + cornerA);
		} else {
			System.out.println("This is not a rectangle");
		}

	}
}
