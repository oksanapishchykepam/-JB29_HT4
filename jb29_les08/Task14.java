package by.oks.jb29_les08;

/*Дан одномерный массив A[N]. Найти: max(a2,a4 ..., a(2k)) + min(a1,a3 ..., a(2k+1))*/

public class Task14 {

	public static void main(String[] args) {
		System.out.println("Введите размер массива: ");
		int size = Task01.enterNumber();

		int[] array = new int[size];
		Task01.fillArrayRandom(array);
		Task01.printArray(array);
		
		System.out.println("K = ");
		int numberK = Task01.enterNumber();
		
		int result = findMaxAmongNumbersWithEvenIndex(array, numberK) + findMinAmongNumbersWithOddIndex(array, numberK);
		
		System.out.println("max(a2,a4 ..., a(2k)) + min(a1,a3 ..., a(2k+1)) = " + result);

	}
	
	public static int findMaxAmongNumbersWithEvenIndex(int[] array, int numberK) {
		int max = array[1];
		
		for(int i = 3; i < 2 * numberK; i+= 2) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		
		return max;
	}

	public static int findMinAmongNumbersWithOddIndex(int[] array, int numberK) {
		int min = array[0];
		
		for(int i = 2; i < 2 * numberK + 1; i+= 2) {
			if(array[i] < min) {
				min = array[i];
			}
		}
		
		return min;
	}
}
