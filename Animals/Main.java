public class Main {
	public static void main(String[] args) {

		Animals animal1 = new Animals("av av", "dog", false, 4);
		Animals animal2 = new Animals("mjau", "cat", false, 4);
		Animals animal3 = new Animals("ssss", "snake", true, 0);
		Animals animal4 = new Animals("muuu", "cow", false, 4);
		Animals animal5 = new Animals("beee", "sheep", false, 4);

		System.out.println(animal1);
		System.out.println(animal2);
		System.out.println(animal3);
		System.out.println(animal4);
		System.out.println(animal5);
	}
}