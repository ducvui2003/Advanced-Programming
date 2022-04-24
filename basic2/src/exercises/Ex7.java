package exercises;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 3 numbers a ,b ,c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		if (a + b > c || b + c > a || a + c > b) {
			if ((a == b || a == c || c == b) && (b == Math.sqrt(a * a + c * c) || c == Math.sqrt(a * a + b * b)
					|| a == Math.sqrt(b * b + c * c)))
				System.out.println("Day la tam giac vuong can");
			if (a == b && b == c && a == c)
				System.out.println("Day la tam giac deu");
			else if (a == b || a == c || c == b)
				System.out.println("Day la tam giac can");
		} else {
			System.out.println("This is not a rectangle");
		}
	}
}
