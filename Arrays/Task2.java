import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int[] array = new int[5];
		int[] array1 = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.printf("Insert %d element of first array: ", i);
			array[i] = in.nextInt();
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			System.out.printf("Insert %d element of second array: ", i);
			array1[i] = in.nextInt();
		}
		
		boolean same = true;
		for (int i = 0; i < 5; i++) {
			if (array[i] == array1[i]) {
				same = true;
			} else {
				same = false;
				break;
			}
		}
		if (same == true) {
			System.out.println("Arrays are identical!");
		} else {
			System.out.println("Arrays are not identical!");
		}
		in.close();
	}

}
