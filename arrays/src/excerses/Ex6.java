package excerses;

import java.util.Random;

public class Ex6 {
	public static void main(String[] args) {
		Random rd = new Random();
		int sizeArray = rd.nextInt(10) + 5;

		double[] myList = createArrays(sizeArray);
		printArray(myList);
		System.out.println("\n\n-Is elements of array increase?");
		System.out.println("-->" + checkIncreaseArray(myList));
		System.out.println("\n-Elements of array after sort:");
		printArray(sortIncrease(myList));
	}

	public static double[] createArrays(int n) {
		Random rd = new Random();
		System.out.println("-Elements of array:" + n);
		double[] array = new double[n];
		for (int i = 0; i < array.length; i++) {
//			Random from rd var
			double numberRandomA = (Math.round(rd.nextDouble() * 100.0)) / 10.0;
//			Random form Math.random
			double numberRandomB = Math.round(Math.random() * 100.0) / 10.0;
			array[i] = Math.round(numberRandomA - numberRandomB);
		}
		return array;
	}

	public static void printArray(double[] array) {
		System.out.print("-Elements: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
	}

	private static boolean checkIncreaseArray(double[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] > array[i + 1]) {
				return false;
			}
		}
		return true;
	}

	private static double[] sortIncrease(double[] array) {
		for (int i = 0; i < array.length; i++) {// ++i right??
			for (int j = i + 1; j < array.length; j++) {// ++j right??
//				Swap elements
				if (array[i] > array[j]) {
					double temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
}
