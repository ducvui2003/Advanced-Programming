package examples;

import java.util.Scanner;

class ShiftingElements {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Size array: ");
		int sizeArrays = input.nextInt();
		double[] myList = new double[sizeArrays];
		System.out.print("Enter myList[0]: ");
		myList[0] = input.nextDouble();
//		Retain the first element
		double temp = myList[0];
//		create array	
		for (int i = 1; i < myList.length; i++) {
			System.out.print("Enter myList[" + i + "]: ");
			myList[i] = input.nextDouble();
		}
//		Shift element left
		for (int i = 1; i < myList.length; i++) {
			myList[i - 1] = myList[i];
			System.out.println("myList[" + (i - 1) + "] " + myList[i - 1]);
		}
//		Move the first element to fill in the last position
		myList[myList.length - 1] = temp;
		System.out.println("myList[" + (myList.length - 1) + "] " + myList[myList.length - 1]);
	}
}
