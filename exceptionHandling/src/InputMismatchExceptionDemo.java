import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean coninueInput = true;
		do {
			try {
//		Return Exception		
				System.out.println("Enter a integer: ");
				int number = input.nextInt();

				System.out.println("The enter number is: " + number);
				coninueInput = false;
//		If try block return exception, try block will active and Opposite
			} catch (InputMismatchException ex) {
				System.out.println("Try again. (" + "Incorectinput: an integer is required)");
				input.nextLine();
			}
		} while (coninueInput == false);
	}
}
