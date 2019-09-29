package by.oks.jb29_les08_part2;

/*Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * 1   1   1 ... 1 1 1
 * 2   2   2 ... 2 2 0
 * 3   3   3 ... 3 0 0
 * ...................
 * ...................
 * n-1 n-1 0 ... 0 0 0
 * n   0   0 ... 0 0 0*/

public class Task18 {

	public static void main(String[] args) {
		System.out.println("Введите четное число n");
		int n = Task07.enterNumber();
		
		int[][] array = new int[n][n];
		
		int number = 1;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length - i; j++) {
				array[i][j] = number;
			}
			number++;
		}
		
		Task01.printMatrix(array);

	}

}
