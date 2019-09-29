package by.oks.jb29_les08;

/*Даны действительные числа a1, a2, … , a2n. Найти
max(a1+a(2n), a2+a(2n-1) ... an+a(n+1))*/

public class Task16 {

	public static void main(String[] args) {
		System.out.println("Введите число n : ");
		int size = Task01.enterNumber();

		int[] array = new int[2 * size];
		Task01.fillArrayRandom(array);
		Task01.printArray(array);

		int maxSum = findMaxSum(array);
		System.out.println("Максимальная сумма = " + maxSum);

	}

	public static int findMaxSum(int[] array) {
		int sum = 0;
		int maxSum = array[0] + array[array.length - 1];

		for (int i = 1; i < (array.length / 2); i++) {
			sum = array[i] + array[array.length - i - 1];

			if (maxSum < sum) {
				maxSum = sum;
			}
		}

		return maxSum;

	}

}
