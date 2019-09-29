package by.oks.jb29_les08;

/*Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.*/

public class Task09 {

	public static void main(String[] args) {
		int[] array = Task03.createArray();
		Task01.fillArrayRandom(array);

		Task01.printArray(array);

		changeMinAndMaxInArray(array);

		System.out.print(" после преобразования: ");
		Task01.printArray(array);

	}

	public static void changeMinAndMaxInArray(int[] array) {
		int min = findMinInArray(array);
		int max = findMaxInArray(array);

		int indexOfMin = 0;
		int indexOfMax = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == min) {
				indexOfMin = i;
			}

			if (array[i] == max) {
				indexOfMax = i;
			}
		}

		array[indexOfMin] = max;
		array[indexOfMax] = min;
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
