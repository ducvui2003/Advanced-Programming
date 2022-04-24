package excerses;

import java.util.Random;

public class Ex7 {
	public static void main(String[] args) {
		Random rd = new Random();
		int sizeArray = rd.nextInt(10) + 5;

		double[] myList = createArrays(sizeArray);
		printArray(myList);
	}

	public static double[] createArrays(int n) {
		Random rd = new Random();
		System.out.println("-Elements of array:" + n);
		double[] array = new double[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = Math.round(rd.nextDouble() * 100.0) / 10.0;
		}
		return array;
	}

	public static void printArray(double[] array) {
		System.out.print("-Elements: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
	}

	private static boolean checkSymmetry(double[] array) {
		if (array.length % 2 != 1) {
			for (int i = 0; i < (array.length / 2); i++) {
				if (array[i] != array[(array.length - 1) - i]) {
					return false;
				}
				return true;
			}

			return false;

		}
	}
}
