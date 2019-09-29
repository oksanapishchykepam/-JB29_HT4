package by.oks.jb29_les08_part2;

import java.util.Random;

/*Сформировать матрицу из чисел от 0 до 999, вывести ее на экран. 
 * Посчитать количество двузначных чисел в ней.*/

public class Task31 {

	public static void main(String[] args) {
		
		System.out.println("Введите размеры матрицы");
		int n = Task07.enterNumber();
		int m = Task07.enterNumber();
		
		int[][] matrix = new int[n][m];
		
		Random rand = new Random();
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = rand.nextInt(999);
			}
		}
		Task01.printMatrix(matrix);
		
		int countNumbers = 0;
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j] >= 10 && matrix[i][j] <= 99) {
					countNumbers++;
				}
			}
		}
		
		System.out.println("Количество двузначных чисел в матрице = " + countNumbers);
	}

}
