package excerses;

import java.util.Random;

public class Ex4 {
	public static void main(String[] args) {
		Random rd = new Random();
		int n = rd.nextInt(6) + 4;
		double[] myList = createArrays(n);
		printArray(myList);
		if (n % 2 == 0) {
			System.out.println("\n-->Symmetric");
			changePosition(myList);
		} else {
			System.out.println("\n-->Asymmetric");
		}

	}

	public static double[] createArrays(int n) {
		Random rc = new Random();
		System.out.println("-Elements of array:" + n);
		double[] array = new double[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = Math.round(rc.nextDouble() * 1000.0) / 10.0;
		}
		return array;
	}

	public static void printArray(double[] array) {
		System.out.print("-Elements: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
	}

	public static void changePosition(double[] array) {
		for (int i = 0; i <= array.length / 2; i++) {
			double temp = array[i];
			array[i] = array[array.length - (i + 1)];
			array[array.length - (i + 1)] = temp;
		}
		printArray(array);
	}
}
