package by.oks.jb29_les08;

/*Дана последовательность целых чисел a1, a2, … , an. 
 * Образовать новую последовательность, выбросив из исходной те члены, которые равны min(a1, a2, … , an).*/

public class Task17 {

	public static void main(String[] args) {
		System.out.println("Введите размер массива");
		int size = Task01.enterNumber();

		int[] array = new int[size];

		Task01.fillArrayRandom(array);
		Task01.printArray(array);

		int sizeOfNewArray = array.length - countNumberOfElementsThatEqualMin(array);

		int[] newArray = new int[sizeOfNewArray];
		deleteMinValuesFromArray(array, newArray);

		Task01.printArray(newArray);

	}

	public static void deleteMinValuesFromArray(int[] array, int[] newArray) {
		int indexOfNewArray = 0;
		int min = findMinInArray(array);

		for (int i = 0; i < array.length; i++) {
			if (array[i] != min) {
				newArray[indexOfNewArray] = array[i];
				indexOfNewArray++;
			}
		}
	}

	public static int countNumberOfElementsThatEqualMin(int[] array) {
		int count = 0;
		int min = findMinInArray(array);

		for (int i = 0; i < array.length; i++) {
			if (array[i] == min) {
				count++;
			}
		}

		return count;
	}

	public static int findMinInArray(int[] array) {
		int min = array[0];

		for (int i = 1; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}

		return min;
	}

}
