package exercisesLoop;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 2 integer a and b:");
		System.out.print("a: ");
		int a = input.nextInt();
		System.out.print("b: ");
		int b = input.nextInt();
		int higherNumber, lowerNumber, UCLN = 1, BCNT = 1;
		if (a > b) {
			higherNumber = a;
			lowerNumber = b;
		} else {
			higherNumber = b;
			lowerNumber = a;
		}

//		Find UCLT
		for (int i = 1; i <= lowerNumber; i++) {
			if (a % i == 0 && b % i == 0)
				UCLN = i;
		}
		System.out.println("UCLN is " + UCLN);

//		Find BCNT
		for (int i = higherNumber; i >= higherNumber; i++) {
			if (i % a == 0 && i % b == 0) {
				BCNT = i;
				break;
			}
		}
		System.out.println("BCNT is: " + BCNT);
	}
}
