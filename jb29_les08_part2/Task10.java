package by.oks.jb29_les08_part2;

import java.util.Random;

/*Дана матрица. Вывести k-ю строку и p-й столбец матрицы.*/

public class Task10 {

	public static void main(String[] args) {
		int[][] array = createMatrix();
		Task01.printMatrix(array);
		
		int numberK = Task07.enterNumber();
		int numberP = Task07.enterNumber();
		
		printSpecificRow(array, numberK);
		printSpecificColumn(array, numberP);

	}
	
	public static void printSpecificRow(int[][] array, int rowNumber) {
		for(int j = 0; j < array[rowNumber].length; j++) {
			System.out.print(array[rowNumber - 1][j] + " ");
		}
		System.out.println();
	}
	
	public static void printSpecificColumn(int[][] array, int columnNumber) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i][columnNumber - 1] + " ");
		}
		System.out.println();
	}
	
	public static int[][] createMatrix() {
		System.out.println("Введите размеры матрицы");
		int n = Task07.enterNumber();
		int m = Task07.enterNumber();
		
		int[][] array = new int[n][m];
		
		Task03.fillMatrixRandomly(array);
		
		return array;
	}

}
