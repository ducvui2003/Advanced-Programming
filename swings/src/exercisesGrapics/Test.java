package exercisesGrapics;

import java.util.Iterator;
import java.util.Random;

public class Test {
	public static void main(String[] args) {
		Random rd = new Random();
		int[][] array = new int[10][5];
		for (int row = 0; row < array.length; row++) {
			for (int column = 0; column < array[row].length; column++) {
				array[row][column] = rd.nextInt(10);
				System.out.print(array[row][column] + "\t");
			}
			System.out.println();
		}
	}
}
