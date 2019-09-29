package by.oks.jb29_les08_part2;

/*Сформировать квадратную матрицу порядка N по правилу:
 * a[i][j] = sin((i^2 - j^2) / N) 
 * и подсчитать количество положительных элементов в ней*/

import static java.lang.Math.*;

public class Task23 {

	public static void main(String[] args) {
		System.out.println("Введите число n");
		int n = Task07.enterNumber();
		
		float[][] array = new float[n][n];
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = (float) sin((pow(i + 1, 2) - pow(j + 1, 2)) / array.length);
			}
		}
	
		printFloatMatrix(array);
		
		int countPositive = 0;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				if(array[i][j] > 0) {
					countPositive++;
				}
			}
		}

		System.out.println("Количество положительных элементов матрицы = " + countPositive);
	}
	
	public static void printFloatMatrix(float[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

}