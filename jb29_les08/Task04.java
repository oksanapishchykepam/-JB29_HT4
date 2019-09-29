package by.oks.jb29_les08;

/*Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей.*/

public class Task04 {

	public static void main(String[] args) {
		int[] array = Task03.createArray();

		System.out.println("Введите элементы массива");
		Task02.fillArrayFromConsole(array);

		Task01.printArray(array);

		boolean risingNumbers = true;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] >= array[i + 1]) {
				risingNumbers = false;
			}
		}

		if (risingNumbers) {
			System.out.println("Последовательность является возрастающей");
		} else {
			System.out.println("Последовательность не является возрастающей");
		}

	}

}
