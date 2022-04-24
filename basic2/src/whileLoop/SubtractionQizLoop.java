package whileLoop;

import java.util.Scanner;

public class SubtractionQizLoop {
	public static void main(String[] args) {
		final int NUMBER_OF_QUESTIONS = 5;
		int correctCount = 0;
		int count = 0;
		long startTime = System.currentTimeMillis();

		String output = "";
		Scanner input = new Scanner(System.in);

		while (count < NUMBER_OF_QUESTIONS) {
//Create 2 random single-digit integers;
			int number1 = (int) (Math.random() * 10);
			int number2 = (int) (Math.random() * 10);
//Swap number 1 with number 2 if number 1 < number 2
			if (number1 < number2) {
				int temp = number1;
				number1 = number2;
				number2 = temp;
			}
//Prompt user enter a answer
			System.out.println("What is " + number1 + " - " + number2 + "? ");
			int answer = input.nextInt();
//Grade the answer and display the result
			if (number1 - number2 == answer) {
				System.out.println("You are correct!");
				correctCount++;
				count++;
			} else {
				System.out.println(
						"Your answer is wrong!. \n" + number1 + " - " + number2 + " should be " + (number1 - number2));
				count++;
			}
//			List result of math and duration doing on display
			output += "\n" + number1 + " - " + number2 + " = " + answer
					+ ((number1 - number2 == answer) ? " correct" : " wrong");
			long endTime = System.currentTimeMillis();
			long testTime = endTime - startTime;
			System.out.println(
					"Correct Count is " + correctCount + "\nTest time is " + testTime / 1000 + " second\n" + output);
		}
//		End while

	}

}
