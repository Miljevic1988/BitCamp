import java.util.Scanner;
public class Task7 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
	
		System.out.print("Input number of containers: ");
		int containers = input.nextInt();
		int newNumOfContainers = containers;
		System.out.print("Input capacity: ");
		int capacity = input.nextInt();
		int additionalContainers = 0;
		boolean canFit = true;
		
		
		while(newNumOfContainers > capacity){
			if(!canFit){
				
				newNumOfContainers = containers + additionalContainers;
				canFit = true;
			}
			if(newNumOfContainers % 2 == 0){
		  
				newNumOfContainers /= 2;
			} else {
			
				canFit = false;
				additionalContainers++;		
			}
		}
		

		System.out.println("Additional containers: " + additionalContainers);
		
		input.close();
	}

	}


