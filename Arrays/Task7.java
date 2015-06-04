import java.util.Arrays;
import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		long[] array = new long[100000];

		for (int i = 0; i < array.length; i++) {
			array[i] = (long) (Math.random() * 99999);
		}

		System.out.println(Arrays.toString(array));

		Arrays.sort(array);

		System.out.println(Arrays.toString(array));

		System.out.println("Which number you seek in the array: ");
		long number = in.nextLong();

		long start_time = System.currentTimeMillis();

		long index = Arrays.binarySearch(array, number);

		if (index >= 0) {
			System.out.println("Your number is on postition " + index);
		} else {
			System.out.println("There is no such a number!");
		}

		long end_time = System.currentTimeMillis();

		System.out.println("Start: " + start_time);
		System.out.println("End: " + end_time);

		int counter = 0;

		long start_time2 = System.currentTimeMillis();

		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				counter++;
				index = i;
				break;
			}
		}

		if (counter > 0) {
			System.out.println("Your number is on postition " + index);
		} else {
			System.out.println("There is no such a number!");
		}

		long end_time2 = System.currentTimeMillis();

		System.out.println("Start: " + start_time2);
		System.out.println("End: " + end_time2);

		in.close();
	}

}
