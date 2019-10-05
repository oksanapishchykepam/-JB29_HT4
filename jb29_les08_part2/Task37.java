package by.oks.jb29_les08_part2;

import java.util.Random;

/*Переставить строки матрицы случайным образом.*/

public class Task37 {

	public static void main(String[] args) {
		Random rand = new Random();

		int[][] matrix = Task10.createMatrix();
		Task01.printMatrix(matrix);

		int[] temp = new int[matrix.length];
		int randRow;

		for (int i = 0; i < matrix.length; i++) {
			randRow = rand.nextInt(matrix.length);
			temp = matrix[i];
			matrix[i] = matrix[randRow];
			matrix[randRow] = temp;
		}

		Task01.printMatrix(matrix);

	}

}
