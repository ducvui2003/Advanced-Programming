package whileLoop;

import java.util.Scanner;

public class GuessingNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//	Create a number random 0 to 100
		int number = (int) (Math.random() * 101);
		System.out.print("Enter a number between 0 and 100: ");
		int guess = -1;
//	while loop
		while (guess < 0) {
			guess = input.nextInt();
			if (guess == number) {
				System.out.println("Yes, the number is " + number);
			} else if (guess > number) {
				System.out.println("Your number is too high");
			} else {
				System.out.println("Your number is to low");
			}
		}
	}
}
