package examples;

import java.util.Scanner;

public class FindTheLargestElement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] myList = new double[6];
		System.out.println("Enter " + myList.length + " values: ");
//		Scanner first number input in to mtList[0]
		myList[0] = input.nextDouble();
		System.out.println("myList [0]: " + myList[0]);
//		Assignment index 0 is max to started point
		double max = myList[0];
//		So that, i started value is 1 
		for (int i = 1; i < myList.length; i++) {
			System.out.println("myList [" + i + "]: " + myList[i]);
			myList[i] = input.nextDouble();
			if (myList[i] > max) {
				max = myList[i];
			}
			System.out.println("Largest element is: " + max);
		}
	}
}
