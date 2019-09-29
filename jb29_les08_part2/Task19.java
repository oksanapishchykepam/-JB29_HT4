package by.oks.jb29_les08_part2;

/*Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
 * 1 1 1 ... 1 1 1
 * 0 1 1 ... 1 1 0
 * 0 0 1 ... 1 0 0
 * ...
 * 0 0 1 ... 1 0 0
 * 0 1 1 ... 1 1 0
 * 1 1 1 ... 1 1 1 */

public class Task19 {

	public static void main(String[] args) {
		System.out.println("Введите четное число n");
		int n = Task07.enterNumber();
		
		int[][] array = new int[n][n];
		
		for(int i = 0; i < array.length / 2; i++) {
			for(int j = i; j < array[i].length - i; j++) {
				array[i][j] = 1;
				array[array.length - i - 1][j] = 1;
			}
		}
		
		Task01.printMatrix(array);

	}

}
