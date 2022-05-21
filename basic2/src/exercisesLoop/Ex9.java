package exercisesLoop;

import java.util.Random;

public class Ex9 {
	public static void main(String[] args) {
//	Create Scanner and tempt user enter input
		Random rd = new Random();
		System.out.println("Banking money");
		double deposits = Math.round(rd.nextDouble() * 1000);
		System.out.println("Your deposits: " + deposits + " VND");
		double interestRate = Math.round(rd.nextDouble() * 100) / 10.0;
		System.out.println("Interest rate per month: " + interestRate + " %");
		int numberOfMonths = rd.nextInt(12);
		System.out.println("Number of months: " + numberOfMonths);

		System.out.println("-->Money will receive after "
				+ ((numberOfMonths > 1) ? numberOfMonths + " months" : "1 month") + " with interested rate is "
				+ interestRate + " per month is " + interest(deposits, interestRate, numberOfMonths) + " VND");
//		Identify 1 month or 2 months higher by if-2ways shortcut ((numberMonths > 1) ? "months" : "month")
	}

//	interest: tiền lãi
	private static double interest(double deposits, double interestRate, int numberOfMonths) {

//		Use For loop to calculate (1+interestRate)^numberMonths	
		double interestAndMonths = 1;
		for (int i = 1; i <= numberOfMonths; i++) {
			interestAndMonths = (1 + interestRate / 100) * interestAndMonths;
		}
		double money = deposits * interestAndMonths;
		money = Math.round(money * 100.0) / 100.0;
		return money;
	}
}
