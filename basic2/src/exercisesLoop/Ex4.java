package exercisesLoop;

import java.util.Random;

public class Ex4 {
	public static void main(String[] args) {
		Random rd = new Random();
		int a = rd.nextInt(20);
		System.out.println("a = " + a);
		int b = rd.nextInt(20);
		System.out.println("b = " + b);

//		Find UCLN
		System.out.println("UCLN is " + findUCLN(a, b));

//		Find BCNN
		System.out.println("BCNN is: " + fingBCNN(a, b));
	}

	private static int getHigherNumber(int a, int b) {
		if (a > b) {
			return a;
		}
		return b;
	}

	private static int getlowerNumber(int a, int b) {
		if (a > b) {
			return b;
		}
		return a;
	}

//		Find UCLT
	private static int findUCLN(int a, int b) {
		int UCLN = 1;
//		UC is a number that can divide a and b
		for (int i = 1; i <= getlowerNumber(a, b); i++) {
			if (a % i == 0 && b % i == 0)
				UCLN = i;
		}
		return UCLN;
	}

//		Find BCNN
	private static int fingBCNN(int a, int b) {
		int BCNN = 1;
//		BC is a number that can be divide by a and b
//		BCNN come from a higher number between a and b
		for (int i = getHigherNumber(a, b); i >= getHigherNumber(a, b); i++) {
			if (i % a == 0 && i % b == 0) {
				BCNN = i;
				break;
			}
		}
		return BCNN;
	}
}
