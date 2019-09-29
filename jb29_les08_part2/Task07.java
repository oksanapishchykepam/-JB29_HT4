package by.oks.jb29_les08_part2;

import java.util.Scanner;

/*Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных элементов.*/

public class Task07 {

	public static void main(String[] args) {

		int[][] array = new int[5][5];
		fillMatrixFromConsole(array);
		Task01.printMatrix(array);

		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] < 0 && array[i][j] % 2 == 0) {
					sum = sum + Math.abs(array[i][j]);
				}
			}
		}

		System.out.println("Сумма модулей отрицательных нечетных элементов " + sum);

	}

	public static void fillMatrixFromConsole(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Введите элементы " + (i + 1) + "-й строки");
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = enterNumber();
			}
		}

	}

	public static int enterNumber() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите число > ");

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Вы ввели не целое число. Попробуйте еще раз > ");
		}

		int number = sc.nextInt();

		return number;
	}
}
