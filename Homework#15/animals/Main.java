package ba.bitcamp.animals;

public class Main {

	public static void main(String[] args) {
		// declaring and initializing variables
		Animal a1 = new Animal("Animal 1", 1, 2);
		Animal a2 = new Animal("Animal 2", 2, 1);

		// testing methods
		a1.printStatus();
		a2.printStatus();

		Animal.dayNight();
		Animal.Water(1);

		a1.printStatus();
		a2.printStatus();
	}

}
