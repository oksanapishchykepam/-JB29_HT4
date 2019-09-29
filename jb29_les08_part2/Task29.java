package by.oks.jb29_les08_part2;

/*Найти положительные элементы главной диагонали квадратной матрицы.*/

public class Task29 {

	public static void main(String[] args) {
		System.out.println("Введите размер матрицы n");
		int n = Task07.enterNumber();
		
		int[][] matrix = new int[n][n];
		Task07.fillMatrixFromConsole(matrix);
		Task01.printMatrix(matrix);
		
		System.out.println("Положительные элементы главной диагонали: ");
		for(int i = 0; i < matrix.length; i++) {
			if(matrix[i][i] > 0) {
				System.out.print(matrix[i][i] + " ");
			}
		}

	}

}
