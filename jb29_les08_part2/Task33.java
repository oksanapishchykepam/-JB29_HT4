package by.oks.jb29_les08_part2;

/*Отсотрировать стобцы матрицы по возрастанию и убыванию значений элементов*/

public class Task33 {

	public static void main(String[] args) {
		int[][] matrix = Task10.createMatrix();
		Task01.printMatrix(matrix);
		
		int[][] tempMatrix = new int[matrix[0].length][matrix.length];
		flipTheMatrix(matrix, tempMatrix);
		//Task01.printMatrix(tempMatrix);
		
		Task32.sortMatrixRowsAsc(tempMatrix);
		flipTheMatrix(tempMatrix, matrix);
		Task01.printMatrix(matrix);

		Task32.sortMatrixRowsDesc(tempMatrix);
		flipTheMatrix(tempMatrix, matrix);
		Task01.printMatrix(matrix);
	}

	public static void flipTheMatrix(int[][] matrix1, int[][] matrix2) {
		for(int i = 0; i < matrix1.length; i++) {
			for(int j = 0; j < matrix1[0].length; j++) {
				matrix2[j][i] = matrix1[i][j];
			}
		}
	}
}
