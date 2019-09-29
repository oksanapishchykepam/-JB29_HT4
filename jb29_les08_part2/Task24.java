package by.oks.jb29_les08_part2;

import java.util.Random;
import static java.lang.Math.*;

/*Дан линейный массив x1,x2, x3, ... xn. Получить действительную квадратную матрицу порядка n:
 * x1   x2   ... xn
 * x1^2 x2^2 ... xn^2
 * ...
 * x1^n x2^n ... xn^n*/

public class Task24 {

	public static void main(String[] args) {
		int[] array = createArray();
		printArray(array);
		
		float[][] matrix = new float[array.length][array.length];
		
		int count = 1;
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (float) pow(array[j], count);
			}
			count++;
		}
		
		Task23.printFloatMatrix(matrix);

	}
	
	public static void printArray(int[] array) {
		System.out.print("Последовательность ");

		for (int i = 0; i < array.length; i++) {
			if (i == (array.length - 1)) {
				System.out.println(array[i] + ".");
			} else {
				System.out.print(array[i] + ", ");
			}
		}
		System.out.println();
	}
	
	public static int[] createArray() {
		System.out.println("Введите размер линейного массива");
		int size = Task07.enterNumber();
		
		int[] array = new int[size];
		Random rand = new Random();
		
		for(int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10);
		}
		
		return array;
	}

}
