package excerses;

import java.util.Random;

public class Ex8 {
	public static void main(String[] args) {
		Random rd = new Random();
		int row = rd.nextInt(5) + 2;
		int column = rd.nextInt(5) + 2;

		int[][] matrix = createDimensionalArrayWithRandomValue(row, column);
		System.out.println("Rows: " + matrix.length + "\nColumn: " + matrix[0].length);
		System.out.println(printDimensionalArray(matrix));
		System.out.println("The largest element in dimensional array is " + getLargestElement(matrix));
		System.out.println("The total of the dimensional array: " + getTotalDimensionalArray(matrix));
	}

	private static int[][] createDimensionalArrayWithRandomValue(int row, int column) {
		Random rd = new Random();
		int[][] matrix = new int[row][column];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = rd.nextInt(100);
			}
		}
		return matrix;
	}

	private static String printDimensionalArray(int[][] matrix) {
		StringBuilder stringMatrix = new StringBuilder("");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				stringMatrix.append(matrix[i][j]);
				stringMatrix.append("\t");
			}
			stringMatrix.append("\n");
		}
		return stringMatrix.toString();
	}

	private static int getLargestElement(int[][] matrix) {
		int largestNumber = matrix[0][0];
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				if (largestNumber < matrix[row][column])
					largestNumber = matrix[row][column];
			}
		}
		return largestNumber;
	}

	private static int getTotalDimensionalArray(int[][] matrix) {
		int total = 0;
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				total += matrix[row][column];
			}
		}
		return total;
	}
}
