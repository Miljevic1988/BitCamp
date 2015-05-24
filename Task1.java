public class Task1 {

	public static void main(String[] args) {

		int edgeA = 35;
		int edgeB = 15;
		int edgeC = 25;

		boolean triangle = ((edgeA + edgeB) > edgeC && (edgeA + edgeC) > edgeB && (edgeB + edgeC) > edgeA);
		

		System.out.println("Triangle? " + triangle);
	}
	
	}

