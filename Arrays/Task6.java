import java.util.Arrays;
import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Input lenght of an array: ");
		int arrLength = in.nextInt();

		int[] arr = new int[arrLength];

		System.out.println("Enter elements of a array: ");

		while (true) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print("Enter element: ");
				arr[i] = in.nextInt();
			}
			break;
		}

		System.out.print("Enter number that you want to check: ");
		int num = in.nextInt();

		System.out.println(Arrays.toString(arr));

		int counter = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				counter++;
			}
		}

		if (counter > 0) {
			System.out.printf("Number %d is in the array!", num);
		} else {
			System.out.printf("Number %d is not in the array!", num);
		}
		in.close();

	}

}
