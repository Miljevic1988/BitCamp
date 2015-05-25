package Homework;

public class PerfectNumber {

	public static void main(String[] args) {
		int number = 28;
		int sum = 0;
		int counter = 1;
		
		while(counter < number){
		
		if (number % counter == 0){
			sum+=counter;
		}counter++;
		}
		if (sum == number){
		System.out.println("It is a perfect number!");
		}else {
			System.out.println("It is not a perfect number");
		}
		
		

	}

}
