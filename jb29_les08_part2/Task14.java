package by.oks.jb29_les08_part2;

/*Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
 * 0 0 0 ... 0 0 1
 * 0 0 0 ... 0 2 0
 * 0 0 0 ... 3 0 0
 *       ...
 * n 0 0 ... 0 0 0*/

public class Task14 {

	public static void main(String[] args) {
		System.out.println("Введите четное число n");
		int n = Task07.enterNumber();
		
		int[][] array = new int[n][n];
		
		int count = array.length;
		for(int j = 0; j < array[count].length; j++) {
			array[count - 1][j] = count;
			count--;
		}
		
		Task01.printMatrix(array);

	}

}
