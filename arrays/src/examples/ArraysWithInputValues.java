package examples;

import java.util.Scanner;

public class ArraysWithInputValues {
	public static void main(String[] args) {
		double[] myList = new double[10];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter " + myList.length + " values: ");
//		Assigning values input into arrays
		for (int i = 0; i < myList.length; i++) {
			myList[i] = input.nextDouble();
//		Display
			System.out.println(myList[i] + "\t");
		}
	}
}
