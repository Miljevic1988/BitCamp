import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		while (true) {
			try {
				Scanner in = new Scanner(System.in);
				System.out.println("How many Celsius degrees you want to convert into Kelvin degrees?");

				double celsius = in.nextDouble();
				in.close();
				System.out.printf("%.2f °C = %.2f °K", celsius,
						celsiusToKelvin(celsius));
				break;
			} catch (InputMismatchException e) {
				System.out.println("Wrong input! Please try again: ");
			}
		}

	}

	 
	public static double celsiusToKelvin(double celsius) {
		double kelvin = celsius + 273.15;
		return kelvin;
	}

}