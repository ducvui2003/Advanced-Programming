package excerses;

import java.util.Random;

public class Ex7 {
	public static void main(String[] args) {
		Random rd = new Random();
		int sizeArray = rd.nextInt(10) + 5;

		double[] myList = createArrays(sizeArray);
		printArray(myList);
		System.out.println("\n\n-Check increasement of the array?");
		System.out.println("-->" + checkSymmetry(myList));
		System.out.println("\n-Check knit the sign of the array?");
		System.out.println("-->" + checkKnittingSigns(myList));
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

//	Kiem tra doi xung phan tu cua mang
	private static boolean checkSymmetry(double[] array) {
		if (array.length % 2 != 1) {
			for (int i = 0; i < (array.length / 2); i++) {
				if (array[i] != array[(array.length - 1) - i]) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

//	Kiem tra dan dau phan tu cua mang
	private static boolean checkKnittingSigns(double[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if ((array[i] >= 0 && array[i + 1] >= 0) || (array[i] < 0 && array[i + 1] < 0)) {
				return false;
			}
		}
		return true;
	}
}
