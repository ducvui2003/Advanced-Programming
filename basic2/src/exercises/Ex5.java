package exercises;

import java.util.Random;

public class Ex5 {
	public static void main(String[] args) {
		Random rd = new Random();

		double a1 = Math.round(rd.nextDouble() * 100.0) / 10.0;
		double b1 = Math.round(rd.nextDouble() * 100.0) / 10.0 + a1;
		System.out.println("[a1,b1]: [" + a1 + "," + b1 + "]");

		double a2 = Math.round(rd.nextDouble() * 100.0) / 10.0;
		double b2 = Math.round(rd.nextDouble() * 100.0) / 10.0 + a2;
		System.out.println("[a2,b2]: [" + a2 + "," + b2 + "]");
		lengthOfMerge(a1, b1, a2, b2);
		lengthOfIntersec(a1, b1, a2, b2);
	}

	private static void lengthOfMerge(double a1, double b1, double a2, double b2) {
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
	}

	private static void lengthOfIntersec(double a1, double b1, double a2, double b2) {
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
	}
}
