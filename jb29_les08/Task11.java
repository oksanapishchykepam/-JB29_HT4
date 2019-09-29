package by.oks.jb29_les08;

/*Даны натуральные числа а1 ,а2 ,..., аn . 
 * Указать те из них, у которых остаток от деления на М равен L (0 < L < М-1).*/

public class Task11 {

	public static void main(String[] args) {
		int[] array = Task03.createArray();
		Task01.fillArrayRandom(array);

		Task01.printArray(array);

		System.out.println("M = ");
		int numberM = Task01.enterNumber();

		System.out.println("L = ");
		int numberL = Task01.enterNumber();

		System.out.println("Числа, у которых остаток от деления на " + numberM + " равен " + numberL + ": ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % numberM == numberL) {
				System.out.print(array[i] + ", ");
			}
		}

	}

}
