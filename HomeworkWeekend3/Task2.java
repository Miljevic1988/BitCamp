import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter hour: ");
		int hour = input.nextInt();
		timeOfDay(hour);
		
		input.close();
	}
	
	 
	public static void timeOfDay(int hour){
		switch (hour) {
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
			System.out.println("Lectures");
			break;
		case 14:
		case 15:
		case 16:
		case 17:
			System.out.println("Exercises");
			break;
		case 18:
		case 19:
		case 20:
		case 21:
		case 22:
		case 23:
		case 24:
		case 1:
			System.out.println("Homework");
			break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
			System.out.println("Sleep");
			break;
		default:
			System.out.println("Wrong input");
			break;
		}
	}	
}