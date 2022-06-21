package excerses;

public class Ex10 {
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

	private static boolean checkTriangularMatrix(int[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			if (matrix[row][row] != 0) {
				return false;
			}
		}
		return true;
	}
}
