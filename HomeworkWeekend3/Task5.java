import java.util.Arrays;
import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Input first arrays size: ");
		int lenght1 = input.nextInt();
		System.out.print("Input second arrays size: ");
		int lenght2 = input.nextInt();
		int[] array1 = new int[lenght1];
		int[] array2 = new int[lenght2];

		System.out.println("Input first array:");
		for (int i = 0; i < array1.length; i++) {
			System.out.print((i + 1) + ". element: ");
			array1[i] = input.nextInt();
		}

		System.out.println("Input second array:");
		for (int i = 0; i < array2.length; i++) {
			System.out.print((i + 1) + ". element: ");
			array2[i] = input.nextInt();
		}

		System.out.println(areIdentical(array1, array2));
		System.out.println(Arrays.toString(sumOfArrays(array1, array2)));
		System.out.println(Arrays.toString(addArrays(array1, array2)));

		input.close();
	}

	public static boolean areIdentical(int[] a1, int[] a2) {
		if (a1.length != a2.length) {
			return false;
		}
		for (int i = 0; i < a1.length; i++) {
			if (a1[i] != a2[i]) {
				return false;
			}
		}
		return true;
	}

	public static int[] sumOfArrays(int[] a1, int[] a2) {
		int length = (a1.length > a2.length) ? a1.length : a2.length;
		int[] a = new int[length];
		for (int i = 0; i < a.length; i++) {
			if (a1.length > i) {
				a[i] += a1[i];
			}
			if (a2.length > i) {
				a[i] += a2[i];
			}
		}
		return a;
	}

	public static int[] addArrays(int[] a1, int[] a2) {
		int[] a = new int[a1.length + a2.length];
		for (int i = 0; i < a.length; i++) {
			if (i < a1.length) {
				a[i] = a1[i];
			} else {
				a[i] = a2[i - a1.length];
			}
		}
		return a;
	}

}
