package by.oks.jb29_les08_part2;

/*Дана матрица размера m x n. Вывести ее элементы в следующем порядке: 
 * первая строка справа налево, вторая строка слева направо, третья строка справа налево и так далее.*/

public class Task11 {

	public static void main(String[] args) {
		int[][] array = Task10.createMatrix();
		Task01.printMatrix(array);

		for(int i = 0; i < array.length; i++) {
			if(i % 2 == 0) {
				printRowLeftRight(array, i);
			} else {
				printRowRightLeft(array, i);
			}
		}
		
	}
	
	public static void printRowLeftRight(int[][] array, int rowNumber) {
		for(int j = 0; j < array[rowNumber].length; j++) {
			System.out.print(array[rowNumber ][j] + " ");
		}
		System.out.println();
	}
	
	public static void printRowRightLeft(int[][] array, int rowNumber) {
		for(int j = array[rowNumber].length - 1; j >= 0; j--) {
			System.out.print(array[rowNumber][j] + " ");
		}
		System.out.println();
	}

}
