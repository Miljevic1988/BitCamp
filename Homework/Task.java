public class Task {

	public static int squareInt(int num) {
		return num * num;
	}

	public static double squareDouble(double num) {
		return num * num;
	}

	public static int productInt(int num1, int num2) {
		return num1 * num2;
	}

	public static double productDouble(double num1, double num2) {
		return num1 * num2;
	}

	public static void main(String[] args) {

		System.out.println("f(10) = " + squareInt(10));

		System.out.println("f(10.0) = " + squareDouble(10.0));

		System.out.println("f(10, 15) = " + productInt(10, 15));

		System.out.println("f(10.0, 15) = " + productDouble(10.0, 15));

	}

}
