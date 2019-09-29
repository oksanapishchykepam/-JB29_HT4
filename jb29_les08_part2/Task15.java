package by.oks.jb29_les08_part2;

/*Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * n  0   0 ... 0
 * 0  n-1 0 ... 0
 * ...
 * 0  0   0 ... 1*/

public class Task15 {

	public static void main(String[] args) {
		System.out.println("Введите четное число n");
		int n = Task07.enterNumber();
		
		int[][] array = new int[n][n];
		
		int count = array.length;
		for(int i = 0; i < array.length; i++) {
			array[i][i] = count;
			count--;
		}
		
		Task01.printMatrix(array);

	}

}
