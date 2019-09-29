package by.oks.jb29_les08;

/*Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов*/

public class Task08 {

	public static void main(String[] args) {
		System.out.println("Введите размер массива: ");
		int size = Task01.enterNumber();

		int[] array = new int[size];
		Task02.fillArrayFromConsole(array);

		int negative = countNegativeNumbers(array);
		int positive = countPositiveNumbers(array);
		int zero = countZeroNumbers(array);

		System.out.println("Количество отрицательных элементов = " + negative + ", положительных = " + positive
				+ ", нулевых = " + zero);

	}

	public static int countNegativeNumbers(int[] array) {
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				count++;
			}
		}

		return count;
	}

	public static int countPositiveNumbers(int[] array) {
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				count++;
			}
		}

		return count;
	}

	public static int countZeroNumbers(int[] array) {
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				count++;
			}
		}

		return count;
	}

}
