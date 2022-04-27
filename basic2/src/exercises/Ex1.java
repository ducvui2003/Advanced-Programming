package exercises;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 2 integers: ");
		int a = input.nextInt();
		int b = input.nextInt();
		if (a > b)
			System.out.printf("%d is greater than %d", a, b);
		else
			System.out.printf("%d is grether than %d", b, a);

	}
}
