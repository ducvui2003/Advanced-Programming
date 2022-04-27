package nestedIfStatements;

import java.util.Scanner;

public class FingABiggerNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 3 number i, j, k: ");

		int i = input.nextInt();
		int j = input.nextInt();
		int k = input.nextInt();
		if (j > k) {
			if (j > k)
				System.out.println("i and j are greater than k");

		} else {
			System.out.println("i is less than or equals to k");
		}
	}
}
