import java.util.Scanner;

public class SwitchTryCatch {

	public static void main(String[] args) {
		System.out.println("Enter numbers: ");
		Scanner in = new Scanner(System.in);

		String str1 = "";
		String str2 = "";
		int counter = 0;
		char operator = 'a';
		String expression = in.nextLine();

		for (int i = 0; i < expression.length(); i++) {
			char operatorIndex = expression.charAt(i);
			if (operatorIndex == '+' || operatorIndex == '-'
					|| operatorIndex == '*' || operatorIndex == '/') {
				operator = expression.charAt(i);
				counter++;
			} else if (counter == 0) {
				str1 += operatorIndex;
			} else if (counter == 1) {
				str2 += operatorIndex;
			}
		}
		int n1 = 0;
		int n2 = 0;
		str1 = str1.trim();
		str2 = str2.trim();
		try {
			n1 = Integer.parseInt(str1);
			n2 = Integer.parseInt(str2);
		} catch (NumberFormatException e) {
			System.out.println("Wrong input!");
			e.printStackTrace();
		}

		int result = 0;

		switch (operator) {
		case '+':
			result = n1 + n2;
			break;
		case '-':
			result = n1 - n2;
			break;
		case '*':
			result = n1 * n2;
			break;
		case '/':
			result = n1 / n2;
			break;
		}
		
		System.out.println(n1 + " " + operator + " " + n2 + " Result: "
				+ result);
		
		in.close();
	}

}
