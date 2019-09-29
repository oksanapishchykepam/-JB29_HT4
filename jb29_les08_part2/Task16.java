package by.oks.jb29_les08_part2;

/*Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * 1*2 0   0 ...         0
 * 0   2*3 0 ...         0
 * ...
 * 0   0   0 ... n*(n-1) 0
 * 0   0   0 ... 0       n*(n+1) */

public class Task16 {

	public static void main(String[] args) {
		System.out.println("Введите четное число n");
		int n = Task07.enterNumber();
		
		int[][] array = new int[n][n];
		
		int number = 1;
		
		for(int i = 0; i < array.length; i++) {
			array[i][i] = number * (number + 1);
			number++;
		}

		Task01.printMatrix(array);
	}

}
