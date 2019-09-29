package by.oks.jb29_les08_part2;

/*Получить квадратную матрицу порядка n 
 * 0 0 0 ... 0 0 0
 * 0 1 0 ... 0 0 0
 * 0 0 2 ... 0 0 0
 *       ...
 * 0 0 0 ... 0 0 n-1 */

public class Task12 {

	public static void main(String[] args) {
		System.out.println("Введите число n");
		int n = Task07.enterNumber();
		
		int[][] array = new int[n][n];
		
		for(int i = 0; i < array.length; i++) {
			array[i][i] = i;
		}
		
		Task01.printMatrix(array);

	}

}
