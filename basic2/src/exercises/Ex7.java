package exercises;

import java.util.Random;

public class Ex7 {
	public static void main(String[] args) {
		Random rd = new Random();
		System.out.println("3 Sides of rectangle: ");
		double a = Math.round(rd.nextDouble() * 100.0) / 10.0;
		System.out.println("Side A: " + a + " m");
		double b = Math.round(rd.nextDouble() * 100.0) / 10.0;
		System.out.println("Side B: " + b + " m");
		double c = Math.round(rd.nextDouble() * 100.0) / 10.0;
		System.out.println("Side C: " + c + " m");
		if (checkRectangle(a, b, c)) {
			System.out.println("Day la tam giac");
			if (vuong(a, b, c) && can(a, b, c)) {
				System.out.println("Day la tam giac vuong can");
			} else {
				if (vuong(a, b, c)) {
					System.out.println("Day la tam giac vuong");
				}
				if (can(a, b, c)) {
					System.out.println("Day la tam giac can");
				}
				if (deu(a, b, c)) {
					System.out.println("Day la tam giac deu");
				}
				if (checkRectangle(a, b, c)) {
					System.out.println("Day la tam giac thuong");
				}
			}
		} else {
			System.out.println("Day khong phai la tam giac");
		}

	}

	private static boolean checkRectangle(double a, double b, double c) {
		return a + b > c || b + c > a || a + c > b;

	}

	private static boolean vuong(double a, double b, double c) {
		if ((b == Math.sqrt(a * a + c * c) || c == Math.sqrt(a * a + b * b) || a == Math.sqrt(b * b + c * c))) {
			return true;
		}
		return false;
	}

	private static boolean deu(double a, double b, double c) {
		if (a == b && b == c && a == c) {
			return true;
		}
		return false;
	}

	private static boolean can(double a, double b, double c) {
		if (a == b || a == c || c == b) {
			return true;
		}
		return false;
	}
}
