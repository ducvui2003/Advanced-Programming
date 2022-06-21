package examples;

import java.util.Random;

public class DimensionalArray {
	public static void main(String[] args) {
		Random rd = new Random();
		int row = rd.nextInt(5) + 2;
		int column = rd.nextInt(5) + 2;		
		
		int[][] matrix = createDimensionalArrayWithRandomValue(row,column);
		System.out.println("Rows: "+ matrix.length+"\nColumn: "+matrix[0].length);
		System.out.println(printDimensionalArray(matrix));
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
}
