
public class Task2 {

	public static void main(String[] args) {
		 
		double number = 6;

		if ((number > 5) && (number <= 7.5)) {
			System.out.println("Number " + number
					+ " is in range between 5 and 7.5");
		} else if ((number > 7.5) && (number <= 10)) {
			System.out.println("Number " + number
					+ " is in range between 7.5 and 10");
		} else {
			System.out.println("Number " + number + " is out of range");
		}
	}
}
