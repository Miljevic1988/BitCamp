public class Task5 {
	
	 
	public static String getNumbersOnly(String s){
	
	String numbers="";
	for (int i = 0;i < s.length();i++){
		switch(s.charAt(i)){
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
			numbers+=s.charAt(i);
			break;
		}
	}
	if(numbers == ""){
		return "0";					
	}
	return numbers;
	
	}
	
	public static void main(String[] args) {
		
	System.out.println(getNumbersOnly("d K. "));
	}

}
 
