public class Task3 {

	public static void main(String[] args) {
		 
		printStrings("Java", "Bit");
		System.out.println(containsCharacters("Java", "Ajvar"));
		printSecondString("Coffee", "Programing");
		System.out.println(areAnagrams("byte", "tybe"));
		
	}
	
	 
	public static void printStrings(String s1, String s2){
		int length = (s1.length() > s2.length())? s1.length() : s2.length();
		for (int i = 0; i < length; i++) {
			if(s1.length() > i){
				System.out.print(s1.charAt(i));
			}
			if(s2.length() > i){
				System.out.print(s2.charAt(i));
			}
		}
		System.out.println();
	}
	
	 
	public static boolean containsCharacters(String s1, String s2){
		if(s1.length() > s2.length()){
			return false;
		}
		s1 = s1.toLowerCase();
		s2 = s1.toLowerCase();
		for (int i = 0; i < s1.length(); i++) {
			for (int j = i; j < s2.length(); j++) {
				if(s1.charAt(i) == s2.charAt(j) && i != j){
					s2 = s2.substring(0, i) + s2.charAt(j) + s2.substring(i + 1, j) + s2.charAt(i) + s2.substring(j + 1, s2.length());
					break;
				}
			}
		}
		for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) != s2.charAt(i)){
				return false;
			}
		}
		return true;
	}
	
	 
	public static void printSecondString(String s1, String s2){
		if(s1.compareToIgnoreCase(s2) > 0){
			System.out.println(s1);
			return;
		}
		System.out.println(s2);
	}
	
	 
	public static boolean areAnagrams(String s1, String s2){
		if(s1.length() != s2.length() || !containsCharacters(s1, s2) || !containsCharacters(s2, s1)){
			return false;
		}
		return true;
		
	}
	
}
 
