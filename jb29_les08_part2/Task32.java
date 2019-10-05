package by.oks.jb29_les08_part2;

/*Отсортировать строки матрицы по возрастанию и убыванию значений элементов.*/

public class Task32 {

	public static void main(String[] args) {
		int[][] matrix = Task10.createMatrix();
		Task01.printMatrix(matrix);

		sortMatrixRowsAsc(matrix);
		Task01.printMatrix(matrix);
		
		sortMatrixRowsDesc(matrix);
		Task01.printMatrix(matrix);

	}

	public static void sortMatrixRowsAsc(int[][] matrix) {

		int[] temp;

		for (int i = 0; i < matrix.length - 1; i++) {
			temp = matrix[i];

			for (int j = i + 1; j < matrix.length; j++) {
				if (temp[0] > matrix[j][0]) {

					matrix[i] = matrix[j];
					matrix[j] = temp;
					temp = matrix[i];

				} else if (temp[0] == matrix[j][0]) {
					int k = 1;
					while (temp[k] == matrix[j][k] && k < matrix[0].length) {
						k++;
					}

					if (temp[k] > matrix[j][k]) {
						matrix[i] = matrix[j];
						matrix[j] = temp;
						temp = matrix[i];
					}
				}
			}
		}
	}
	
	public static void sortMatrixRowsDesc(int[][] matrix) {

		int[] temp;

		for (int i = 0; i < matrix.length - 1; i++) {
			temp = matrix[i];

			for (int j = i + 1; j < matrix.length; j++) {
				if (temp[0] < matrix[j][0]) {

					matrix[i] = matrix[j];
					matrix[j] = temp;
					temp = matrix[i];

				} else if (temp[0] == matrix[j][0]) {
					int k = 1;
					while (temp[k] == matrix[j][k] && k < matrix[0].length) {
						k++;
					}

					if (temp[k] < matrix[j][k]) {
						matrix[i] = matrix[j];
						matrix[j] = temp;
						temp = matrix[i];
					}
				}
			}
		}
	}

}
