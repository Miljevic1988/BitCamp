public class Task1 {

	public static void main(String[] args) {

		printNumber(123456789);
		System.out.println(countDigits(223456));
		System.out.println(getNewNumber(457893392));
		;
		printRange(5, 12);

	}

	public static void printNumber(int num) {
		String s = "";
		int counter = 0;
		while (num > 0) {
			if (counter == 3) {
				s = "," + s;
				counter = 0;
			}
			s = num % 10 + s;
			num /= 10;
			counter++;
		}
		System.out.println(s);
	}

	public static int countDigits(int num) {
		int counter = 0;
		for (int i = num; i > 0; i /= 10) {
			counter++;
		}
		return counter;
	}

	public static int getNewNumber(int num) {
		int counter = countDigits(num);
		if (counter == 1) {
			return num;
		}
		int firstDigit = num % 10;
		int lastDigit = num / (int) Math.pow(10, counter - 1);
		num %= (int) Math.pow(10, counter - 1);
		num /= 10;
		num = firstDigit * (int) Math.pow(10, counter - 1) + num * 10
				+ lastDigit;
		return num;
	}

	public static void printRange(int n, int q) {
		if (n >= q) {
			return;
		}
		int counter = 0;
		for (int i = n + 1; i < q; i++) {
			counter++;
		}
		if (counter % 2 == 0) {
			n = ((n + 1) % 2 == 0) ? n + 1 : n + 2;
			for (int i = n; i < q; i += 2) {
				System.out.print(i + ", ");
			}
		} else {
			n = ((n + 1) % 2 == 1) ? n + 1 : n + 2;
			for (int i = n; i < q; i += 2) {
				System.out.print(i + ", ");
			}
		}
	}
}
