package by.oks.jb29_les08_part2;

import java.util.Random;

/*Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из [0, 9].*/

public class Task02 {

	public static void main(String[] args) {
		Random rand = new Random();

		int[][] array = new int[2][3];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rand.nextInt(9);
			}
		}

		Task01.printMatrix(array);
	}

}
