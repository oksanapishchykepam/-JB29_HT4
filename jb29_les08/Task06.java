package by.oks.jb29_les08;

/*Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси, содержащую все эти числа.*/

public class Task06 {

	public static void main(String[] args) {
		int[] array = Task03.createArray();
		Task01.fillArrayRandom(array);

		Task01.printArray(array);

		int leftBound = findMinInArray(array);
		int rightBound = findMaxInArray(array);

		int minLength = rightBound - leftBound;
		System.out.println("Наименьшая длина числовой оси, содержащая все эти числа = " + minLength);

	}

	public static int findMinInArray(int[] array) {
		int minValue = array[0];

		for (int i = 1; i < array.length; i++) {
			if (minValue > array[i]) {
				minValue = array[i];
			}
		}

		return minValue;
	}

	public static int findMaxInArray(int[] array) {
		int maxValue = array[0];

		for (int i = 1; i < array.length; i++) {
			if (maxValue < array[i]) {
				maxValue = array[i];
			}
		}

		return maxValue;
	}
}
