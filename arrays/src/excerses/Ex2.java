package excerses;

import java.util.Random;

public class Ex2 {
	public static void main(String[] args) {
//	Create Random and size array
		Random rd = new Random();
		int sizeArray = rd.nextInt(10) + 5;
//	Create array and apply method
		int[] myList = createArray(sizeArray);
		printArray(myList);
		int max = getMax(myList);
		int times = numberOfTimes(myList, max);

		System.out.println("\n-Max number is: " + max);
		System.out.println("-Times of max number appear in array is " + times);
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

	public static int getMax(int[] args) {
		int max = args[0];
		for (int i = 1; i < args.length; i++) {
			if (args[i] > max) {
				max = args[i];
			}
		}
		return max;
	}

	public static int numberOfTimes(int[] args, int number) {
		int times = 0;
		for (int i = 0; i < args.length; i++) {
			if (number == args[i]) {
				times += 1;
			}
		}
		return times;
	}
}
