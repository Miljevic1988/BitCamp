public class Task4 {

	public static double getPercentage(int score, int max) {
		return (double) score / (double) max * 100;
	}

	public static void main(String[] args) {
		System.out.println(getPercentage(3, 5) + "%");

	}

}
