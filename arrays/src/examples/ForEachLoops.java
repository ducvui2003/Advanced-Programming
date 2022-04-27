package examples;

import java.util.Scanner;

public class ForEachLoops {
	public static void main(String[] args) {
		double[] myList = new double[6];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ");
		
		for (double u : myList) {
			u = input.nextDouble();
			System.out.println(u);
		}
//		Equivalent
//		for (int i = 0; i < myList.length; i++) {
//			myList[i] = input.nextDouble();
//			System.out.println(myList[i]);
//		}
	}
}
