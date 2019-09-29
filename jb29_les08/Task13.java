package by.oks.jb29_les08;

/*Определить количество элементов последовательности натуральных чисел, кратных числу М и заключенных в промежутке от L до N.*/

public class Task13 {

	public static void main(String[] args) {
		System.out.println("Введите размер массива: ");
		int size = Task01.enterNumber();

		int[] array = new int[size];
		Task01.fillArrayRandom(array);
		Task01.printArray(array);

		System.out.println("M = ");
		int numberM = Task01.enterNumber();

		System.out.println("L = ");
		int leftBound = Task01.enterNumber();
		System.out.println("N = ");
		int rightBound = Task01.enterNumber();

		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= leftBound && array[i] <= rightBound) {
				if (array[i] % numberM == 0) {
					count++;
				}
			}
		}

		System.out.println("Количество чисел, кратных числу " + numberM + " и заключенных в промежутке от " + leftBound
				+ " до " + rightBound + " равно " + count);

	}

}
