package by.oks.jb29_les08;

import java.util.Random;
import java.util.Scanner;

/*В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.*/

public class Task01 {

	public static void main(String[] args) {
		int sizeN = enterNumber();
		int numberK = enterNumber();

		int[] array = new int[sizeN];
		fillArrayRandom(array);

		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			if (isMultipleNumberK(array[i], numberK)) {
				sum = sum + array[i];
			}
		}

		printArray(array);
		System.out.println("Сумма элементов массива, которые кратны " + numberK + " = " + sum);
	}

	public static boolean isMultipleNumberK(int number, int numberK) {
		boolean result = false;

		if (number % numberK == 0) {
			result = true;
		}

		return result;

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
	}

	public static void fillArrayRandom(int[] array) {
		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100);
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
