package by.oks.jb29_les08_part2;

import java.util.Random;

/*Матрицу 10x20 заполнить случайными числами от 0 до 15. 
 * Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.*/

public class Task30 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int[][] matrix = new int[10][15];
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = rand.nextInt(15);
			}
		}

		Task01.printMatrix(matrix);
		
		System.out.println("Номера строк с повторением числа 5 три и более раз: ");
		for(int i = 0; i < matrix.length; i++) {
			findRowWithFive(matrix, i);
		}
		
	}
	
	public static void findRowWithFive(int[][] matrix, int rowNumber) {
		int countFive = 0;
		
		for(int j = 0; j < matrix[rowNumber].length; j++) {
			if(matrix[rowNumber][j] == 5) {
				countFive++;
			}
		}
		
		if(countFive >= 3) {
			System.out.print((rowNumber + 1) + " ");
		}
	}

}
