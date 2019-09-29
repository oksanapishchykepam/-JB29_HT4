package by.oks.jb29_les08_part2;

import java.util.Random;

/*Дана матрица. Вывести на экран первый и последний столбцы.*/

public class Task03 {

	public static void main(String[] args) {
		Random rand = new Random();

		int rows = rand.nextInt(10);
		int columns = rand.nextInt(10);

		int[][] array = new int[rows][columns];
		fillMatrixRandomly(array);
		// Task01.printMatrix(array);

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i][0] + " ");
			System.out.println(array[i][array[i].length - 1]);
		}

	}

	public static void fillMatrixRandomly(int[][] array) {
		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rand.nextInt(10);
			}
		}
	}

}
