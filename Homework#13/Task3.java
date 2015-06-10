public class Task3 {

	public static void main(String[] args) {

		try {
			if (args.length > 1) {
				throw new NullPointerException();
			} else {
				String s = "";
				if (args[0].equals(s)) {
					throw new IndexOutOfBoundsException();
				} else
					System.out.printf("%s has %d numbers.", args[0],
							countNumbers(args));
			}
		} catch (NullPointerException e) {
			System.out.println("Please input only one String!");
		} catch (IndexOutOfBoundsException e1) {
			System.out.println("Please input one String to programm!");
		}

	}

	public static int countNumbers(String[] array) {

		char c = ' ';
		int counter = 0;
		String str = "";
		for (int i = 0; i < array.length; i++) {
			str += array[i];
		}

		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if (c - 48 < 10) {
				counter++;
			}
		}

		return counter;
	}

}