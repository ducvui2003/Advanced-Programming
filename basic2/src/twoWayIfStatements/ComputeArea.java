
package twoWayIfStatements;

import java.util.Scanner;

public class ComputeArea {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter radius of circle: ");
		double radius = input.nextDouble();
		if (radius >= 0) {
			double area = radius * radius * Math.PI;
			area = Math.round(area * 100.0) / 100.0;
			System.out.println("The area for the circle if radius " + radius + " is " + area);
		} else {
			System.out.println("Negative input");
		}
	}
}
