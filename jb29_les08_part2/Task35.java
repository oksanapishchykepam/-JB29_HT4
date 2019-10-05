package by.oks.jb29_les08_part2;

/*Найдите наибольший элемент матрицы и заменить все нечетные элементы на него*/

public class Task35 {

	public static void main(String[] args) {
		int[][] matrix = Task10.createMatrix();
		Task01.printMatrix(matrix);

		int max = findMaxElement(matrix);
		changeEvenToMax(matrix, max);

		Task01.printMatrix(matrix);
	}

	public static int findMaxElement(int[][] matrix) {
		int max = matrix[0][0];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] > max) {
					max = matrix[i][j];
				}
			}
		}

		return max;
	}

	public static void changeEvenToMax(int[][] matrix, int max) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] % 2 == 0) {
					max = matrix[i][j] = max;
				}
			}
		}
	}

}
