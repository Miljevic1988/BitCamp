import java.util.Arrays;
import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		 
		int[] array = getArray();
		int index = 0;
		long start = System.currentTimeMillis();

		while (!areAllValuesZeros(array)) {
			System.out.println(Arrays.toString(array));
			System.out.print("Choose index: ");
			 
			index = input.nextInt();
			try {
				playGame(array, index);
			} catch (IllegalArgumentException e) {
				 
				input.nextLine();
				System.out.println("Wrong input. Try again.");
			}
		}
		long end = System.currentTimeMillis() - start;
		 
		System.out.println("You finished in " + end / 1000 + " seconds!");

		input.close();
	}

	 
	public static int[] getArray() {
		int[] a = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 4.0 + 1.0);
		}
		return a;
	}

	 
	public static boolean areAllValuesZeros(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				return false;
			}
		}
		return true;
	}

	 
	public static int[] playGame(int[] array, int guess)
			throws IllegalArgumentException {
		if (guess > 4 || guess < 0) {
			throw new IllegalArgumentException();
		}
		if (array[guess] == 0) {
			return array;
		}
		if (array[guess] % 2 == 0) {
			if (guess != 0 && array[guess - 1] != 0) {
				array[guess - 1] = (array[guess - 1] + array[guess] > 4) ? 4
						: array[guess - 1] + array[guess];
			}
			if (guess != 4 && array[guess + 1] != 0) {
				array[guess + 1] = (array[guess + 1] + array[guess] > 4) ? 4
						: array[guess + 1] + array[guess];
			}
			array[guess] = (array[guess] != 0) ? array[guess] - 1 : 0;
		} else {
			if (guess != 0 && array[guess - 1] != 0) {
				array[guess - 1] = (array[guess - 1] - array[guess] < 0) ? 0
						: array[guess - 1] - array[guess];
			}
			if (guess != 4 && array[guess + 1] != 0) {
				array[guess + 1] = (array[guess + 1] - array[guess] < 0) ? 0
						: array[guess + 1] - array[guess];
			}
			array[guess] = (array[guess] != 0) ? array[guess] - 1 : 0;
		}
		return array;
	}
}
