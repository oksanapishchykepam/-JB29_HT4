package by.oks.jb29_les08_part2;

/*Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * 1   2  3  ... n-2 n-1 n
 * 2   3  4  ... n-1 n   0
 * 3   4  5  ... n   0   0
 * ...
 * n-1 n  0  ... 0   0   0
 * n   0  0  ... 0   0   0*/

public class Task22 {

	public static void main(String[] args) {
		System.out.println("Введите четное число n");
		int n = Task07.enterNumber();
		
		int[][] array = new int[n][n];
		
		int number = 0;
		for(int i = 0; i < array.length; i++) {
			number = i + 1;
			for(int j = 0; j < array.length - i; j++) {
				array[i][j] = number;
				number++;
			}
		}
		
		Task01.printMatrix(array);

	}


	
}
