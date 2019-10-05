package by.oks.jb29_les08_part2;

/*Операция сглаживания матрицы дает новую матрицу того же размера, каждый элемент которой получается как среднее арифметическое соседей соответствующего элемента исходной матрицы.
Построить результат сглаживания заданной матрицы*/

public class Task36 {

	public static void main(String[] args) {
		int[][] matrix = Task10.createMatrix();
		Task01.printMatrix(matrix);

		float[][] newMatrix = smoothMatrix(matrix);
		Task23.printFloatMatrix(newMatrix);

	}

	public static float[][] smoothMatrix(int[][] matrix) {
		float[][] newMatrix = new float[matrix.length][matrix[0].length];
		int sumOfNeighbors = 0;
		int countNeighbors = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				sumOfNeighbors = 0;
				countNeighbors = 0;

				if (i != 0) {
					sumOfNeighbors += matrix[i - 1][j];
					countNeighbors++;
				}

				if (i != matrix.length - 1) {
					sumOfNeighbors += matrix[i + 1][j];
					countNeighbors++;
				}

				if (j != 0) {
					sumOfNeighbors += matrix[i][j - 1];
					countNeighbors++;
				}

				if (j != matrix[0].length - 1) {
					sumOfNeighbors += matrix[i][j + 1];
					countNeighbors++;
				}

				newMatrix[i][j] = (float) sumOfNeighbors / countNeighbors;
			}
		}

		return newMatrix;
	}
}
