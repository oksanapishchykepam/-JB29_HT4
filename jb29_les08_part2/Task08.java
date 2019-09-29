package by.oks.jb29_les08_part2;

import java.util.Random;

/*Дан двухмерный массив n×m элементов. Определить, сколько раз встречается число 7 среди элементов массива.*/

public class Task08 {

	public static void main(String[] args) {
		Random rand = new Random();

		int rows = rand.nextInt(10);
		int columns = rand.nextInt(10);

		int[][] array = new int[rows][columns];
		Task03.fillMatrixRandomly(array);
		Task01.printMatrix(array);
		
		int countSeven = countSpecificNumber(array, 7);
		
		System.out.println("Число 7 встречается в массиве " + countSeven + " раз(а).");

	}
	
	public static int countSpecificNumber(int[][] array, int number) {
		int count = 0;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				if(array[i][j] == number) {
					count++;
				}
			}
		}
		
		
		return count;
	}

}
