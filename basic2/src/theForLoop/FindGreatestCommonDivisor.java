package theForLoop;

import java.util.Scanner;

public class FindGreatestCommonDivisor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 2 integers: ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int gcd = 1;
		int k = 2;
		while (k <= n1 && k < n2) {
			if (n1 % k == 0 && n2 % k == 0) {
				gcd = k;
				k++;
//			System.out.printf("gcd = %d",k);
			}
		}
	}
}
