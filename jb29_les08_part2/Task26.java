package by.oks.jb29_les08_part2;

/*С клавиатуры вводится двумерный массив чисел размерностью nxm. Выполнить с массивом следующие
действия:
а) вычислить сумму отрицательных элементов в каждой строке;
б) определить максимальный элемент в каждой строке;
в) переставить местами максимальный и минимальный элементы матрицы.*/

public class Task26 {

	public static void main(String[] args) {
		System.out.println("Введите размеры матрицы:");
		int n = Task07.enterNumber();
		int m = Task07.enterNumber();
		
		int[][] matrix = new int[n][m];
		
		Task07.fillMatrixFromConsole(matrix);
		Task01.printMatrix(matrix);
		
		printSumOfNegativeNumbersForEveryRow(matrix);
		printMaxNumbersForEveryRow(matrix);
		
		changeMaxAndMin(matrix);
		Task01.printMatrix(matrix);

	}
	
	public static void changeMaxAndMin(int[][] matrix) {
		int findMax = findMaxElementInMatrix(matrix);
		int maxIndexI = 0;
		int maxIndexJ = 0;
		
		int findMin = findMinElementInMatrix(matrix);
		int minIndexI = 0;
		int minIndexJ = 0;
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				if(matrix[i][j] == findMax) {
					maxIndexI = i;
					maxIndexJ = j;
				} else {
					if(matrix[i][j] == findMin) {
						minIndexI = i;
						minIndexJ = j;
					}
				}
			}
		}
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				if(i == maxIndexI && j == maxIndexJ) {
					matrix[i][j] = findMin;
				} else {
					if(i == minIndexI && j == minIndexJ) {
						matrix[i][j] = findMax;
					}
				}
			}
		}
	}
	
	public static void printMaxNumbersForEveryRow(int[][] matrix) {
		int max;
		for(int i = 0; i < matrix.length; i++) {
			max = findMaxInARow(matrix, i);
			System.out.println("Максимальное число в " + (i + 1) + " строке = " + max);
		}
	}
	
	public static int findMaxElementInMatrix(int[][] matrix) {
		int max = findMaxInARow(matrix, 0);
		
		for(int i = 1; i < matrix.length; i++) {
			if(findMaxInARow(matrix, i) > max) {
				max = findMaxInARow(matrix, i);
			}
		}
		
		return max;
	}
	
	public static int findMinElementInMatrix(int[][] matrix) {
		int min = findMinInARow(matrix, 0);
		
		for(int i = 1; i < matrix.length; i++) {
			if(findMinInARow(matrix, i) < min) {
				min = findMinInARow(matrix, i);
			}
		}
		
		return min;
	}
	
	public static int findMaxInARow(int[][] matrix, int rowNumber) {
		int max = matrix[rowNumber][0];
		
		for(int j = 1; j < matrix[0].length; j++) {
			if(max < matrix[rowNumber][j]) {
				max = matrix[rowNumber][j];
			}
		}
		
		return max;
	}
	
	public static int findMinInARow(int[][] matrix, int rowNumber) {
		int min = matrix[rowNumber][0];
		
		for(int j = 1; j < matrix[0].length; j++) {
			if(min > matrix[rowNumber][j]) {
				min = matrix[rowNumber][j];
			}
		}
		
		return min;
	}
	
	public static void printSumOfNegativeNumbersForEveryRow(int[][] matrix) {
		int sum;
		for(int i = 0; i < matrix.length; i++) {
			sum = countSumOfNegativeNumbers(matrix, i);
			System.out.println("Сумма отрицательных элементов в " + (i + 1) + " строке = " + sum);
		}
	}
	
	public static int countSumOfNegativeNumbers(int[][] matrix, int rowNumber) {
		int sum = 0;
		
		for(int j = 0; j < matrix[0].length; j++) {
			if(matrix[rowNumber][j] < 0) {
				sum = sum + matrix[rowNumber][j];
			}
		}
		
		return sum;
	} 
	
}
