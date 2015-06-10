public class Task2 {

	public static void main(String[] args) {

		try {

			int min = Integer.parseInt(args[0]);

			for (int i = 0; i < args.length; i++) {
				if (min > Integer.parseInt(args[i])) {
					min = Integer.parseInt(args[i]);
				}
			}

			System.out.println("Minimal number is: " + min);

		} catch (NumberFormatException e) {
			System.out.println("Please input some numbers in to array!");

		} catch (IndexOutOfBoundsException e) {
			System.out.println("Please input some numbers in to array!");
		}

	}
}