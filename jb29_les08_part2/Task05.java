package by.oks.jb29_les08_part2;

import java.util.Random;

/*Дана матрица. Вывести на экран все четные строки, то есть с четными номерами.*/

public class Task05 {

	public static void main(String[] args) {
		Random rand = new Random();

		int rows = rand.nextInt(10);
		int columns = rand.nextInt(10);

		int[][] array = new int[rows][columns];
		Task03.fillMatrixRandomly(array);
		// Task01.printMatrix(array);

		for (int i = 1; i < array.length; i = i + 2) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

}
