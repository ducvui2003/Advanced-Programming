
package excerses;

import java.util.Random;

public class Ex9 {
	public static void main(String[] args) {
		Random rd = new Random();
		int number = rd.nextInt(5) + 2;

		int[][] matrix = createDimensionalArrayWithRandomValue(number, number);
		System.out.println("Rows: " + matrix.length + "\nColumn: " + matrix[0].length);
		System.out.println(printDimensionalArray(matrix));
		printArrayWithRow(getTotalRowOfArray(matrix));
		System.out.println("Max row: row " + findMaxRow(matrix));
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

	private static void printArrayWithRow(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Row " + i + ": " + array[i]);
		}

	}

	private static int[] getTotalRowOfArray(int[][] matrix) {
		StringBuilder totalOfEachRow = new StringBuilder("");
		int[] array = new int[matrix.length];

		for (int row = 0; row < matrix.length; row++) {
			int total = 0;
			for (int column = 0; column < matrix[row].length; column++) {
				total += matrix[row][column];
			}
//				totalOfEachRow.append("Row " + row + ": ");
//				totalOfEachRow.append(total);
//				totalOfEachRow.append("\t");
			array[row] = total;
		}
		return array;
	}

	private static int findMaxRow(int[][] matrix) {
		int[] array = getTotalRowOfArray(matrix);
		int maxValueRow = array[0];
		int maxRow = 0;
		for (int i = 0; i < array.length; i++) {
			if (maxValueRow < array[i]) {
				maxValueRow = array[i];
				maxRow = i;
			}
		}
		return maxRow;
	}
}
