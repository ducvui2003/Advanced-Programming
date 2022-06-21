import java.util.Scanner;

public class QuotientWithException {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 2 integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		try {
			if (number2 == 0) { // Case exception
				throw new ArithmeticException("Divisor cannot be zero");
//				Throw Exception
			}
//			Case Normal
			System.out.println(number1 + " / " + number2 + " is " + (number1 / number2));

		} catch (ArithmeticException ex) {// catch Exception
			System.out.println("Exception: an integer " + "cannot be divided by zero");
//		Handle that Exception
		}
		System.out.println("Execution continues ...");
//		try {
//			int value = 50;
//			if (value < 40)
//				throw new Exception("value is too small");
//		} catch (Exception ex) {
//			System.out.println(ex.getMessage());
//		}
//		System.out.println("Continue after the catch block");
//	}

	}
}