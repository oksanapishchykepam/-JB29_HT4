package by.oks.jb29_les08;

/*Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.*/

public class Task10 {

	public static void main(String[] args) {
		int[] array = Task03.createArray();
		Task01.fillArrayRandom(array);

		Task01.printArray(array);

		for (int i = 0; i < array.length; i++) {
			if (array[i] > (i + 1)) {
				System.out.print(array[i] + ", ");
			}
		}

	}

}
