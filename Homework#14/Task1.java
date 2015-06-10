public class Task1 {

	public static void main(String[] args) {
		/**
		 * a program that receives a matrix and a number. Determine how many
		 * times a given number repeats in a matrix.
		 */

		// declaring a variable
		int[][] array = { { 1, 2, 1 }, { 5, 2, 8 }, { -4, 2, 3 } };

		System.out.println(countNum(array, 1));
		System.out.println(countNum(array, 9));
		System.out.println(countNum(array, 2));
	}

	/**
	 * this method counts how many times number has appeared
	 * 
	 * @param matrix
	 * @param num
	 * @return
	 */
	public static int countNum(int[][] matrix, int num) {
		int counter = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j] == num) {
					counter++;

				}
			}
		}
		return counter;
	}
}
