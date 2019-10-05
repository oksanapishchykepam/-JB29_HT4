package by.oks.jb29_les08_part2;

/*Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3, ..., n^2 так,
 * что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между собой. 
 * Построить такой квадрат. Пример магического квадрата порядка 3:
 * 6 1 8 
 * 7 5 3
 * 2 9 4*/

public class Task40 {

	public static void main(String[] args) {
		System.out.println("Введите нечетное число n");
		int n = Task07.enterNumber();

		int[][] magic = new int[n][n];
		fillMagic(magic);

		Task01.printMatrix(magic);

	}

	public static void fillMagic(int[][] matrix) {
		int i = 0;
		int j = (matrix.length + 1) / 2 - 1;

		int newI = 0;
		int newJ = 0;

		for (int k = 1; k <= matrix.length * matrix.length; k++) {
			matrix[i][j] = k;

			if (i == 0) {
				newI = matrix.length - 1;
			} else {
				newI = i - 1;
			}

			if (j == matrix[0].length - 1) {
				newJ = 0;
			} else {
				newJ = j + 1;
			}

			if (matrix[newI][newJ] != 0) {
				if (i == matrix.length - 1) {
					i = 0;
				} else {
					i++;
				}
			} else {
				i = newI;
				j = newJ;
			}
		}
	}

}
