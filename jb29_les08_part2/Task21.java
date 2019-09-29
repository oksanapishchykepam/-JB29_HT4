package by.oks.jb29_les08_part2;

/*Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * n   0   0  ... 0   0   0
 * n-1 n   0  ... 0   0   0
 * n-2 n-1 n  ... 0   0   0
 * ...
 * 1   2   3  ... n-2 n-1 n */

public class Task21 {

	public static void main(String[] args) {
		System.out.println("Введите четное число n");
		int n = Task07.enterNumber();
		
		int[][] array = new int[n][n];
		
		int number = array.length;
		for(int i = 0; i < array.length; i++) {
			int count = i;
			for(int j = 0; j < array.length - i; j++) {
				array[count][j] = number;
				count++;
			}
			number--;
		}
		
		Task01.printMatrix(array);
	}

}
