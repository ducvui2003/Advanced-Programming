package exercisesLoop;

import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
//	Create Scanner and tempt user enter input
		Scanner input = new Scanner(System.in);
		System.out.println("Banking money");
		System.out.print("Enter your deposits: ");
		double deposits = input.nextDouble();
		System.out.print("Enter interest rate per month: ");
		double interestRate = input.nextDouble();
		System.out.print("Enter number of months: ");
		int numberMonths = input.nextInt();

//	Use For loop to calculate (1+interestRate)^numberMonths	
		double interestAndMonths = 1;
		for (int i = 1; i <= numberMonths; i++) {
			interestAndMonths = (1 + interestRate) * interestAndMonths;
		}
		double money = deposits * interestAndMonths;
		System.out.printf("Your money you will receive after %d %s with interested rate is %f per month is %f",
				numberMonths, (numberMonths > 1) ? "months" : "month", interestRate, money);
//	Identify 1 month or 2 months higher by if-2ways shortcut ((numberMonths > 1) ? "months" : "month")
	}
}
