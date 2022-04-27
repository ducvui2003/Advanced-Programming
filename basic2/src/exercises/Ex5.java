package exercises;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter 4 dots of 2 straight line: ");

		System.out.print("\na1: ");
		double a1 = input.nextDouble();
		System.out.print("b1: ");
		double b1 = input.nextDouble();
		System.out.println("[" + a1 + "," + b1 + "]");

		System.out.print("a2: ");
		double a2 = input.nextDouble();
		System.out.print("b2: ");
		double b2 = input.nextDouble();
		System.out.println("[" + a2 + "," + b2 + "]");

		if (a1 < b1 && a2 < b2) {
//		Tim phan hop
			double max = 0, min = 0;
			if (Math.max(a1, b1) > Math.max(a2, b2)) {
				max = Math.max(a1, b1);
			} else {
				max = Math.max(a2, b2);
			}
			if (Math.min(a1, b1) < Math.min(a2, b2)) {
				min = Math.min(a1, b1);
			} else {
				min = Math.min(a2, b2);

			}

			double length1 = max - min;
			System.out.println("Length of merge is " + length1);// merge: phan hop
//		Tim phan giao
			double intersect1 = 0, intersect2 = 0;
			if (b1 < a2 || b2 < a1) {
				System.out.println("Length of intersect: not Available");
			} else {
				if ((b2 - a2) > (b1 - a1) && a2 < a1 && b1 < b2) {
					intersect1 = a2;
					intersect2 = b2;
				} else if ((b1 - a1) > (b2 - a2) && a1 < a2 && b2 < b1) {
					intersect1 = a1;
					intersect2 = b1;
				}

				if ((b2 - a1) > (b1 - a2) && b1 > a2) {
					intersect1 = a2;
					intersect2 = b1;
				} else if ((b1 - a2) > (b2 - a1) && b2 > a1) {
					intersect1 = a1;
					intersect2 = b2;
				}

				if (b1 == a2 || b2 == a1) {
					intersect1 = 0;
					intersect2 = 0;
				}
				double length2 = intersect2 - intersect1;
				System.out.print("Length of intersect " + length2);
			}
		} else {
			System.out.println("Error");
		}

	}
}
//			double m1 = Math.min(a1, a2);
//			double m2 = Math.max(b1, b2);
//			double m3 = Math.max(a1, a2);
//			double m4 = Math.min(b1, b2);
//			System.out.println(m2 - m1 + (m4 - m3));
