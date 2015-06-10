public class Task3 {

	public static void main(String[] args) {

		//declaring a variable
		int[][] arr2d = { { 1, 2, 1 }, { 5, 2, 8 }, { -4, 2, 3 } };

		System.out.println(getMaxPoints(arr2d, 0, 0));
		System.out.println(getMaxPoints(arr2d, 1, 1));
		System.out.println(getMaxPoints(arr2d, 0, 2));
	}

	public static int getMaxPoints(int[][] matrix, int x, int y) {

		String str = x + "" + y;

		switch (str) {
		case "00":
			return getMax(matrix[2][1], matrix[1][2], matrix[0][0]);
		case "01":
			return getMax(matrix[2][0], matrix[2][2], matrix[0][1]);
		case "02":
			return getMax(matrix[1][0], matrix[2][1], matrix[0][2]);
		case "10":
			return getMax(matrix[0][2], matrix[2][2], matrix[1][0]);
		case "11":
			return matrix[1][1];
		case "12":
			return getMax(matrix[0][0], matrix[2][0], matrix[1][2]);
		case "20":
			return getMax(matrix[0][1], matrix[1][2], matrix[2][0]);
		case "21":
			return getMax(matrix[0][0], matrix[0][2], matrix[2][1]);
		case "22":
			return getMax(matrix[1][0], matrix[0][1], matrix[2][2]);
		default:
			throw new IllegalArgumentException();
		}
	}

	 //return highest number
	public static int getMax(int num1, int num2, int num3) {
		if (num1 > num2) {
			if (num1 > num3) {
				return num1;
			} else {
				return num3;
			}
		}
		if (num2 > num3) {
			return num2;
		}
		return num3;
	}
}
