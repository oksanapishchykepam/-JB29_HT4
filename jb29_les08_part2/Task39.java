package by.oks.jb29_les08_part2;

/*Найдите произведение двух матриц*/

public class Task39 {

	public static void main(String[] args) {
		System.out.println("Введите размеры 1 матрицы");
		int n1 = Task07.enterNumber();
		int m1 = Task07.enterNumber();

		System.out.println("Введите размеры 2 матрицы");
		int m2 = Task07.enterNumber();

		int[][] matrix1 = Task38.createMatrix(n1, m1);
		int[][] matrix2 = Task38.createMatrix(m1, m2);

		Task01.printMatrix(matrix1);
		Task01.printMatrix(matrix2);

		int[][] multiple = multipleOfTwoMatrix(matrix1, matrix2);
		Task01.printMatrix(multiple);

	}

	public static int[][] multipleOfTwoMatrix(int[][] m1, int[][] m2) {
		int[][] m = new int[m1.length][m2[0].length];

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {

				for (int k = 0; k < m2.length; k++) {
					m[i][j] += m1[i][k] * m2[k][j];
				}

			}
		}

		return m;
	}

}
