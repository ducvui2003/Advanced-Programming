package examples;

import java.util.Scanner;

public class FindIndexOfLargestElement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] myList = new double[5];
		System.out.print("Enter myList[0]: ");
		myList[0] = input.nextDouble();
//		Assigning myList[0] = max => started point
		double max = myList[0];
		int indexOfMax = 0;
		for (int i = 1; i < myList.length; i++) {
			System.out.print("Enter myList[" + i + "]: ");
			myList[i] = input.nextDouble();
//		Compare max with array elements
			if (myList[i] > max) {
				max = myList[i];
				indexOfMax = i;
			}
		}
		System.out.println("Largest Number is: " + max + "\nIndex Of Max is: " + indexOfMax);
	}
}
