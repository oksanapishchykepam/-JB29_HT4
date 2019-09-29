package by.oks.jb29_les08;

import java.util.Random;

/*В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов*/

public class Task02 {

	public static void main(String[] args) {
		int sizeN = Task01.enterNumber();
		int[] array = new int[sizeN];
		fillArrayFromConsole(array);

		int sizeOfNewArray = countZerosInArray(array);
		int[] newArray = new int[sizeOfNewArray];
		fillNewArray(newArray, array);

		Task01.printArray(array);
		Task01.printArray(newArray);

	}

	public static void fillNewArray(int[] newArray, int[] array) {
		int countIndex = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				newArray[countIndex] = i + 1;
				countIndex++;
			}
		}
	}

	public static void fillArrayFromConsole(int[] array) {

		for (int i = 0; i < array.length; i++) {
			array[i] = Task01.enterNumber();
		}

	}

	public static int countZerosInArray(int[] array) {
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				count++;
			}
		}

		return count;
	}
}
