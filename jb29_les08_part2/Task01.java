package by.oks.jb29_les08_part2;

import java.util.Random;

/*Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке была ровно одна единица, и вывести на экран.*/

public class Task01 {

	public static void main(String[] args) {
		int[][] array = new int[3][4];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i == j) {
					array[i][j] = 1;
				} else {
					array[i][j] = 0;
				}

			}
		}

		printMatrix(array);

	}

	public static void printMatrix(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

}
