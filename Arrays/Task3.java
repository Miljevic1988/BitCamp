import java.util.Scanner;

public class Task3 {

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

		int counter = 0;
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) { 
				if (array[i] == array1[j]) {
					counter++;
				}
			}
		}
		if (counter == 5) {
			System.out.println("Arrays are identical!");
		} else {
			System.out.println("Arrays are not identical!");
		}
		in.close();
	}

}
