package examples;

import java.util.Scanner;

public class SummingAllElements {
	public static void main(String[] args) {
		double[] myList = new double[5];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter " + myList.length + " values: ");
		double total = 0;
		for (int i = 0; i < myList.length; i++) {
			myList[i] = input.nextDouble();
			total += myList[i];
		}
		System.out.println("Total is: " + total);
	}
}
