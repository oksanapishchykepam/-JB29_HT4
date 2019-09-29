package by.oks.jb29_les08;

/*Дана последовательность действительных чисел n a1,a2, ... ,an. 
 * Указать те ее элементы, которые принадлежат отрезку [с, d].*/

public class Task15 {

	public static void main(String[] args) {
		System.out.println("Введите размер массива: ");
		int size = Task01.enterNumber();

		int[] array = new int[size];
		Task02.fillArrayFromConsole(array);
		Task01.printArray(array);

		System.out.println("Укажите границы отрезка.");
		int leftBound = Task01.enterNumber();
		int rightBound = Task01.enterNumber();

		System.out
				.println("Элементы последовательности, принадлежащие отрезку [" + leftBound + ", " + rightBound + "]");

		for (int i = 0; i < array.length; i++) {
			if (doesTheNumberBelongToSegment(array[i], leftBound, rightBound)) {
				System.out.print(array[i] + ", ");
			}
		}
	}

	public static boolean doesTheNumberBelongToSegment(int number, int leftBound, int rightBound) {
		boolean result = false;

		if (number >= leftBound && number <= rightBound) {
			result = true;
		}

		return result;
	}

}
