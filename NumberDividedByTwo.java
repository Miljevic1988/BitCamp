package Homework;

public class NumberDividedByTwo {

	public static void main(String[] args) {
		// the program determines how many times the number n can be divided by
				// the number 2
				int n = 16;
				int counter = 0;
				int div = n;

				while (div / 2 > 0) {
					div = div / 2;
					counter++;
				}
				System.out.println("Number " + n + " can be divided by 2 for "
						+ counter + " times");
			}

		}
	


