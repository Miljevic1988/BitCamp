import java.util.Scanner;
public class Task8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Input text in format: \"www.example.com?name=Ime&surname=Prezime\"");
		String line = input.next(); 
		String firstName = "";
		String lastName = "";
		
		
		for (int i = 0; i < line.length(); i++) {
			if(line.charAt(i) == '=' && !(firstName.length() > 0)){
				i++;
			
				while(line.charAt(i) != '&'){
					firstName += line.charAt(i);
					i++;
				}
			} else if (line.charAt(i) == '='){
				i++;
				
				while(line.charAt(i) != '"'){
					lastName += line.charAt(i);
					i++;
				}				
			}
		}
		
	
		System.out.println("Name: " + firstName + " " + lastName);
		
		input.close();
	}
	}


