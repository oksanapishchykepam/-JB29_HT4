package by.oks.jb29_les08_part2;

/*Найдите сумму двух матриц*/

public class Task38 {

	public static void main(String[] args) {
		System.out.println("Введите размеры матриц");
		int n = Task07.enterNumber();
		int m = Task07.enterNumber();
		
		int[][] matrix1 = createMatrix(n, m);
		int[][] matrix2 = createMatrix(n, m);
		
		Task01.printMatrix(matrix1);
		Task01.printMatrix(matrix2);
		
		int[][] sum = sum(matrix1, matrix2);
		Task01.printMatrix(sum);
	}
	
	public static int[][] sum(int[][] matrix1, int[][] matrix2) {
		int[][] sum = new int[matrix1.length][matrix1[0].length];
		
		for(int i = 0; i < matrix1.length; i++) {
			for(int j = 0; j < matrix1[0].length; j++) {
				sum[i][j] = matrix1[i][j] + matrix2[i][j];
 			}
		}
		
		return sum;
	}

	public static int[][] createMatrix(int n, int m) {
		int[][] array = new int[n][m];
		Task03.fillMatrixRandomly(array);
		
		return array;
	}
}
