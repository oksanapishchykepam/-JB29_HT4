package by.oks.jb29_les08_part2;

/*Получить квадратную матрицу порядка n:
 * 1         2       ... n-1   n
 * n+1       n+2     ... 2n-1  2n
 * ...
 * (n-1)n+1 (n-1)n+2 ... n^2+1 n^2*/

public class Task25 {

	public static void main(String[] args) {
		System.out.println("Введите число n");
		int n = Task07.enterNumber();
		
		int[][] matrix = new int[n][n];
		
		int number = 1;
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = number;
				number++;
			}
		}
		
		Task01.printMatrix(matrix);

	}

}
