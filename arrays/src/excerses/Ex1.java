package excerses;

import java.util.Random;

public class Ex1 {
	public static void main(String[] args) {
//	Create Random and size array
		Random rd = new Random();
		int sizeArray = rd.nextInt(10) + 5;
		int[] myList = createArray(sizeArray);
		printArray(myList);

		int max = getMax(myList);
		int min = getMin(myList);

		System.out.println("\n-Max number of array: " + max);
		System.out.println("-Index of max: " + getIndex(myList, max));
		System.out.println("-Min number of array: " + min);
		System.out.println("-Index of max: " + getIndex(myList, min));
		System.out.println("-Total of array: " + total(myList));
	}

	public static int[] createArray(int n) {
//		1. Declare and create array
		int[] myList = new int[n];
		Random rd = new Random();
//		2. Assign value for array
		System.out.println("-Number of element in array is: " + n);
		for (int i = 0; i < n; i++) {
			int temp = rd.nextInt(20);
			myList[i] = temp;
		}
		return myList;
	}

	private static void printArray(int[] array) {
		System.out.print("-Elements: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
	}

	public static int getMin(int[] args) {
		int min = args[0];
		for (int i = 1; i < args.length; i++) {
			if (args[i] < min) {
				min = args[i];
			}
		}
		return min;
	}

	public static int getMax(int[] args) {
		int max = args[0];
		for (int i = 1; i < args.length; i++) {
			if (args[i] > max) {
				max = args[i];
			}
		}
		return max;
	}

	public static int getIndex(int[] array, int number) {
		int index = 0;
		for (index = 0; index < array.length; index++) {
			if (number == array[index]) {
				return index;
			}
		}
		return index;
	}

	public static int total(int[] args) {
		int total = 0;
		for (int i = 0; i < args.length; i++) {
			total += args[i];
		}
		return total;
	}
}
