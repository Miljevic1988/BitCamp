public class Task3 {

	public static boolean hasNumbers(String inString){
		
		int c = 0;
		
		for (int i = 0 ;i< inString.length();i++){
			c = inString.charAt(i);			 
			switch(c){						 
			case 48:						
			case 49:
			case 50:
			case 51:
			case 52:
			case 53:
			case 54:
			case 55:
			case 56: 
			case 57:
				return true;
				
			}
		}
		return false;
		
		
	}
	public static void main(String[] args) {
		
		System.out.println(hasNumbers("Parametr1")); 
	}

}
 