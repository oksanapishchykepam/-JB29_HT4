package by.oks.jb29_les08_part2;

import java.lang.reflect.Array;

/*Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. 
 * Определить, какой столбец содержит максимальную сумму.*/

public class Task28 {

	public static void main(String[] args) {
		int[][] matrix = Task10.createMatrix();
		Task01.printMatrix(matrix);
		
		int[] arrayOfSum = new int[matrix.length];
		
		
		for(int i = 0; i < arrayOfSum.length; i++) {
			arrayOfSum[i] = findSumOfElements(matrix, i);
		}
		printArray(arrayOfSum);
		
		int rowWithMaxSum = findMaxRow(arrayOfSum);
		System.out.println("Максимальная сумма элементов в " + (rowWithMaxSum + 1) + " строке");

	}
	
	public static int findMaxRow(int[] array) {
		int rowWithMaxSum = 0;
		int max = array[0];
		
		for(int i = 1; i <array.length; i++) {
			if(array[i] > max) {
				max = array[i];
				rowWithMaxSum = i;
			}
		}
		
		return rowWithMaxSum;
	}

	public static int findSumOfElements(int[][] matrix, int rowNumber) {
		int sum = 0;
		
		for(int j = 0; j < matrix[0].length; j++) {
			sum = sum + matrix[rowNumber][j];
		}
		
		return sum;
	}
	
	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
