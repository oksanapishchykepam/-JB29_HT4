package by.oks.jb29_les08_part2;

import java.util.Random;

/*Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число единиц равно номеру столбца.*/

public class Task34 {

	public static void main(String[] args) {
		Random rand = new Random();

		int m = 1 + rand.nextInt(10);
		int n = m + rand.nextInt(5);

		int[][] matrix = new int[n][m];
		
		int randomIndex = 0;
		
		int count = 0;
		for(int j = 0; j < matrix[0].length; j++) {
			count = j + 1;
			
			while(count > 0) {		
				randomIndex = rand.nextInt(n - 1);
				while(matrix[randomIndex][j] == 1) {
					randomIndex = rand.nextInt(n - 1);
				}
				matrix[randomIndex][j] = 1;
				count--;
			}
		}
		
		Task01.printMatrix(matrix);
		
	}

}
