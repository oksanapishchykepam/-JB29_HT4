package by.oks.jb29_les08_part2;

import java.util.Random;

/*Дана матрица. Вывести на экран первую и последнюю строки.*/

public class Task04 {

	public static void main(String[] args) {
		Random rand = new Random();

		int rows = rand.nextInt(10);
		int columns = rand.nextInt(10);

		int[][] array = new int[rows][columns];
		Task03.fillMatrixRandomly(array);
		// Task01.printMatrix(array);

		for (int j = 0; j < array[0].length; j++) {
			System.out.print(array[0][j] + " ");
		}

		System.out.println();

		for (int j = 0; j < array[0].length; j++) {
			System.out.print(array[array.length - 1][j] + " ");
		}

	}

}
