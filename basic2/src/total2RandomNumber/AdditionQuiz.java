package total2RandomNumber;

import java.util.Scanner;

public class AdditionQuiz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

//		The currentTimeMillis() method of System class returns current time in format of millisecond.
//		Millisecond will be returned as unit of time.
//		currentTimeMillis() = currentTime - midnight 1/1/1970 (UTC)
		int number1 = (int) (System.currentTimeMillis() * 7 % 10);
		int number2 = (int) (System.currentTimeMillis() % 10);

		System.out.print("What is " + number1 + " + " + number2 + " ?" + "\n" + "Answer is ");

		int answer = input.nextInt();
		System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
	}
}
