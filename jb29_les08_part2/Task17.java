package by.oks.jb29_les08_part2;

/*Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
 * 1 1 1 ... 1 1 1
 * 1 0 0 ... 0 0 1
 * 1 0 0 ... 0 0 1
 * ...
 * 1 0 0 ... 0 0 1
 * 1 1 1 ... 1 1 1 */

public class Task17 {

	public static void main(String[] args) {
		System.out.println("Введите четное число n");
		int n = Task07.enterNumber();
		
		int[][] array = new int[n][n];
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0 ; j < array[i].length; j++) {
				if(i == 0 || i == array.length - 1 || j == 0 || j == array.length - 1) {
					array[i][j] = 1;
				}
			}
		}
		
		Task01.printMatrix(array);

	}

}
