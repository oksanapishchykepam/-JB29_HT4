package by.oks.jb29_les08_part2;

/*Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * 1   2   3   ... n
 * n   n-1 n-2 ... 1
 * ...
 * 1   2   3   ... n
 * n   n-1 n-2 ... 1*/

public class Task13 {

	public static void main(String[] args) {
		System.out.println("Введите четное число n");
		int n = Task07.enterNumber();
		
		int[][] array = new int[n][n];
		
		for(int i = 0; i < array.length; i++) {
			fillRowInMatrixByExample(array, i);
		}
		
		Task01.printMatrix(array);

	}
	
	public static void fillRowInMatrixByExample(int[][] array, int rowIndex) {
		int count = 1;
		
		if(rowIndex % 2 == 0) {
			for(int j = 0; j < array[rowIndex].length; j++) {
				array[rowIndex][j] = count;
				count++;
			}
		} else {
			for(int j = array[rowIndex].length - 1; j >= 0; j--) {
				array[rowIndex][j] = count;
				count++;
			}
		}

	}

}
