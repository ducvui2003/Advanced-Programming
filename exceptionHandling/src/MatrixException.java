import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class MatrixException {
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a size of matrix: ");

		System.out.println("Column: ");
		int column = in.nextInt();
		System.out.println("Row: ");
		int row = in.nextInt();
//		row: hang
//		column: cot
		int[][] matrix = new int[row][column];
		try {
			if (row != column) {
				throw new ArithmeticException();
			}
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < column; j++) {
					matrix[i][j] = rd.nextInt(10);
					System.out.print(matrix[i][j] + "\t");
				}
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("No available");
		} finally {
			System.out.println("Finally");
		}
	}
}
