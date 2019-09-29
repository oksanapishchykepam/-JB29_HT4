package by.oks.jb29_les08_part2;

import java.util.Random;

/*Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.*/

public class Task06 {

	public static void main(String[] args) {
		Random rand = new Random();

		int rows = rand.nextInt(10);
		int columns = rand.nextInt(10);

		int[][] array = new int[rows][columns];
		Task03.fillMatrixRandomly(array);
		Task01.printMatrix(array);
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j = j + 2) {
				if(array[0][j] > array[array.length - 1][j]) {
					System.out.print(array[i][j] + " ");
				}
			}
			System.out.println();
		}

	}

}
