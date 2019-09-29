package by.oks.jb29_les08_part2;

import java.util.Random;

/*Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.*/

public class Task09 {

	public static void main(String[] args) {
		Random rand = new Random();

		int size = rand.nextInt(10);

		int[][] array = new int[size][size];
		Task03.fillMatrixRandomly(array);
		Task01.printMatrix(array);
		
		printDiagonalElements(array);

	}
	
	public static void printDiagonalElements(int[][] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i][i] + " ");
		}
	}

}
