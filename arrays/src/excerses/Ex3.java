package excerses;

import java.util.Random;

public class Ex3 {
	public static void main(String[] args) {
//		Create Random 
		Random rd = new Random();
		int sizeArray = rd.nextInt(10) + 5;

		int[] myList = createArray(sizeArray);
		printArray(myList);
		System.out.println("\n-Quantity of number 0: " + count0(myList));
		System.out.println("-Quantity of positive number: " + countPositive(myList));
		System.out.println("-Quantity of negative number: " + countNegative(myList));
		System.out.println("-Max Negative number: " + maxNegative(myList));
		System.out.println("-Min Positive number: " + minPositive(myList));
		System.out.println("-Is the total of negative number equal to the total of positive number?\n-->"
				+ totalNegativeEqualPositive(myList));
	}

// 	Create array
	public static int[] createArray(int n) {
		Random rd = new Random();
		System.out.println("-Size of array: " + n);
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = rd.nextInt(20);
		}
		return array;
	}

//	Print array
	public static void printArray(int[] array) {

		System.out.print("-Elements: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
	}

//	Count 0, positive and negative number
	public static int count0(int[] array) {
		int count0 = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				count0 += 1;
			}
		}
		return count0;
	}

	public static int countPositive(int[] array) {
		int countPositive = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				countPositive += 1;
			}
		}
		return countPositive;
	}

	public static int countNegative(int[] array) {
		int countNegative = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				countNegative += 1;
			}
		}
		return countNegative;
	}

//	Determinate max negative number
	public static int maxNegative(int[] array) {
		int maxNegative = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > maxNegative && array[i] < 0) {
				maxNegative = array[i];
			}
		}
		return maxNegative;
	}

//	Determinate min positive number
	public static int minPositive(int[] array) {
		int minPositive = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < minPositive && array[i] > 0) {
				minPositive = array[i];
			}
		}
		return minPositive;
	}

//	|total negative number | == total positive number ??
	public static boolean totalNegativeEqualPositive(int[] array) {
		int totalPositive = 0;
		int totalNegative = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				totalPositive += array[i];
			}
			if (array[i] < 0) {
				totalNegative += array[i];
			}
		}
		if (totalNegative == totalPositive) {
			return true;
		} else
			return false;
	}
}
