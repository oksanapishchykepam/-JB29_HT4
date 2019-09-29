package by.oks.jb29_les08;

import java.util.Random;

/*Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число встречается раньше -
положительное или отрицательное*/

public class Task03 {

	public static void main(String[] args) {
		int[] array = createArray();
		Task02.fillArrayFromConsole(array);

		Task01.printArray(array);

		for (int i = 0; i < array.length; i++) {

			if (array[i] > 0) {
				System.out.println("Раньше встречается положительное число");
				i = array.length;

			} else {

				if (array[i] < 0) {
					System.out.println("Раньше встречается отрицательное число");
					i = array.length;

				} else {

					if (i == array.length - 1) {
						System.out.println("Последовательность содержит только нули.");
					}
				}
			}
		}
	}

	public static int[] createArray() {
		Random rand = new Random();
		int[] array = new int[rand.nextInt(15)];

		return array;
	}

}
