
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter file name: ");

		try {
			String fileName = input.nextLine();  
			TextIO.readFile(fileName);
			String number1 = TextIO.getWord();
			int number = Integer.parseInt(number1);
			int factoriel = 1;
			for (int i = 1; i <= number; i++) {
				factoriel = factoriel * i;
			}
			System.out.println("Factoriel of a number from file is: "
					+ factoriel);
		} catch (NumberFormatException ex) {
			System.out.println("Please check your file.");
			System.out.println("Wrong number");
			ex.printStackTrace();
		} catch (IllegalArgumentException ex) {
			System.out.println("No file with that name.");
			ex.printStackTrace();
		}
		input.close();

	}
}