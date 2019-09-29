package by.oks.jb29_les08;

/*Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются простыми числами.*/

public class Task12 {

	public static void main(String[] args) {
		System.out.println("Введите размер массива: ");
		int size = Task01.enterNumber();

		int[] array = new int[size];
		Task02.fillArrayFromConsole(array);

		int sumOfNumbersWithPrimeIndex = 0;

		for (int i = 0; i < array.length; i++) {
			if (isTheIndexOfNumberThePrimeNumber(i + 1)) {
				sumOfNumbersWithPrimeIndex = sumOfNumbersWithPrimeIndex + array[i];
			}
		}

		System.out.println(
				"Сумма чисел, порядковые номера которых являются простыми числами = " + sumOfNumbersWithPrimeIndex);

	}

	public static boolean isTheIndexOfNumberThePrimeNumber(int number) {
		boolean result = true;

		for (int i = 2; i < number - 1; i++) {
			if (number % i == 0) {
				result = false;
				i = number;
			}
		}

		return result;
	}

}
