package nestedIfStatements;

import java.util.Scanner;

public class ClassifyStudents {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your score ");
		double score = input.nextDouble();
		if (score >= 90.0)
			System.out.println("Your Grade is A");
		else if (score >= 80.0)
			System.out.println("Your Grade is B");
		else if (score >= 70.0)
			System.out.println("Your Grade is C");
		else if (score >= 60.0)
			System.out.println("Your Grade is D");
		else
			System.out.println("Your Grade is F"
				+ "");
	}
}
