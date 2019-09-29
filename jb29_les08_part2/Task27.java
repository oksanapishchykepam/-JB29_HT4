package by.oks.jb29_les08_part2;

/*В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить на соответствующие им позиции другого, 
 * а его элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.*/

public class Task27 {

	public static void main(String[] args) {
		int[][] matrix = Task10.createMatrix();
		Task01.printMatrix(matrix);
		
		System.out.println("Введите номера строк, которые нужно поменять местами");
		int row1 = Task07.enterNumber() - 1;
		int row2 = Task07.enterNumber() - 1;
		
		int[] array1 = saveRowElements(matrix, (row1));
		int[] array2 = saveRowElements(matrix, (row2));
		
		for(int j = 0; j < matrix[0].length; j++) {
			matrix[row1][j] = array2[j];
			matrix[row2][j] = array1[j];
		}
		
		Task01.printMatrix(matrix);
	}
	
	public static int[] saveRowElements(int[][] matrix, int rowNumber) {
		int[] array = new int[matrix[0].length];
		
		for(int j = 0; j < array.length; j++) {
			array[j] = matrix[rowNumber][j];
		}
		return array;
	}

}
