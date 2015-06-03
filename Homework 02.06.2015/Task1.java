import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter day of the week: ");
		
		try {
			int day = input.nextInt();
		
			switch (day) {
			case 1:
				System.out.println("Work day.");
				break;
			case 2:
				System.out.println("Work day.");
				break;
			case 3:
				System.out.println("Work day");
				break;
			case 4:
				System.out.println("Work day.");
				break;
			case 5:
				System.out.println("Work day.");
				break;
			case 6:
				System.out.println("Weekend.");
				break;
			case 7:
				System.out.println("Weekend.");
				break;
			default:
				System.out.println("Enter number beetwen 1 - 7");
			}
		} catch (InputMismatchException ex) {
			System.out.println("Please enter number beetwen 1 - 7.");
			ex.printStackTrace();
		}

		input.close();

	}

}