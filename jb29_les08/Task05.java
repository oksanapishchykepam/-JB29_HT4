package by.oks.jb29_les08;

/* Дана последовательность натуральных чисел а1 , а2 ,..., ап. 
 * Создать массив из четных чисел этой последовательности. 
 * Если таких чисел нет, то вывести сообщение об этом факте.*/

public class Task05 {

	public static void main(String[] args) {
		int[] array = Task03.createArray();
		Task01.fillArrayRandom(array);
		Task01.printArray(array);

		int size = findNumberOfEven(array);

		if (size > 0) {
			int[] arrayWithEvenNumbers = new int[size];
			createArrayWithEvenNumbers(array, arrayWithEvenNumbers);

			Task01.printArray(arrayWithEvenNumbers);
		} else {
			System.out.println("В массиве нет четных чисел");
		}

	}

	public static void createArrayWithEvenNumbers(int[] array, int[] newArray) {

		int index = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				newArray[index] = array[i];
				index++;
			}
		}
	}

	public static int findNumberOfEven(int[] array) {
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				count++;
			}
		}

		return count;
	}

}
