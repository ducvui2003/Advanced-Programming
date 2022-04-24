package exercisesLoop;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		int data, sum = 0, i = 0, average, greatestNumber;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Enter a int value: (program will exit if user enter 0 value)");
			data = input.nextInt();
//Sum
			sum += data;
//Average
			i++;
			average = sum / i;
//Find a greatestNumber
//Initial gcd =0
			greatestNumber = 0;
			if (data > greatestNumber) {

				greatestNumber = data;
			}
		} while (data != 0);
		System.out.printf("Sum is: %d \nAverage is: %d \nA greatest number is: %d", sum, average, greatestNumber);
	}

}
