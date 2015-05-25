package Homework;

public class SumEvenNumbers {

	public static void main(String[] args) {
		// a program that finds the sum of all the even numbers from 1 to n
		// excluding n

		int n = 10;
		int sum = 0;
		int counter = 0;

		while (counter < n) {
			if (counter % 2 == 0) {
				sum += counter;
			}
			counter++;
		}

		System.out.println("Sum is : " + sum);

	}
}
