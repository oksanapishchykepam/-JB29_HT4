package by.oks.jb29_les08;

/*В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. 
 * Если таких чисел несколько, то определить наименьшее из них.*/

public class Task18 {

	public static void main(String[] args) {
		System.out.println("Введите размер массива");
		int size = Task01.enterNumber();

		int[] array = new int[size];

		Task02.fillArrayFromConsole(array);
		;
		Task01.printArray(array);

		int number = minNumberWithMaxCount(array);
		System.out.println(number);

	}

	public static int minNumberWithMaxCount(int[] array) {
		int number = 0;
		int maxCount = maxNumberOfRepeats(array);

		for (int i = 0; i < array.length; i++) {
			if (countRepeatsInArray(array, i) == maxCount) {
				number = array[i];

				for (int j = i + 1; j < array.length; j++) {
					if (countRepeatsInArray(array, j) == maxCount) {
						if (number > array[j]) {
							number = array[j];
						}
					}
				}

				i = array.length;
			}
		}

		return number;
	}

	public static int maxNumberOfRepeats(int[] array) {
		int count = 1;
		int maxCount = 1;

		for (int i = 0; i < array.length; i++) {
			count = countRepeatsInArray(array, i);
			if (count > maxCount) {
				maxCount = count;
			}
		}

		return maxCount;
	}

	public static int countRepeatsInArray(int[] array, int index) {
		int count = 1;

		for (int i = index + 1; i < array.length; i++) {
			if (array[index] == array[i]) {
				count++;
			}
		}

		return count;
	}

}
