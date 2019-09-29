package by.oks.jb29_les08;

import java.util.Random;

/*Дана последовательность действительных чисел а1 ,а2 ,..., ап. 
 * Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.*/

public class Task07 {

	public static void main(String[] args) {
		int[] array = Task03.createArray();
		Task01.fillArrayRandom(array);

		Task01.printArray(array);

		Random rand = new Random();
		int randomNumberZ = rand.nextInt(100);
		System.out.println("Число Z = " + randomNumberZ);

		int countOfReplacenments = replaceBiggerNumbersInArrayToZ(array, randomNumberZ);

		System.out.println("Заменено " + countOfReplacenments + " чисел в последовательности");

	}

	public static int replaceBiggerNumbersInArrayToZ(int[] array, int numberZ) {
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > numberZ) {
				array[i] = numberZ;
				count++;
			}
		}

		return count;
	}

}
