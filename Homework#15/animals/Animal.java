package ba.bitcamp.animals;

public class Animal {

	private String name; // name of the animal
	private int active; // animal activity, is it active by day or night
	private int water; // this represents how much water is needed to animals
	private static int dayOrNight = 1; // is it day = 1 or is it night = 2
	private static int levelOfWater = 1;

	/**
	 * generate construcotr using fields
	 * 
	 * @param name
	 * @param active
	 * @param water
	 */
	public Animal(String name, int active, int water) {
		super();
		this.name = name;
		this.active = active;
		this.water = water;
	}

	/**
	 * this method determine is it day or night
	 */
	public static void dayNight() {
		if (dayOrNight == 1) {
			dayOrNight = 2;
		} else {
			dayOrNight = 1;
		}
	}

	/**
	 * this method determine level of water
	 * 
	 * @param value
	 * @return
	 */
	public static int Water(int value) {
		if (value == 0) {
			value = 0;
		} else if (value == 1) {
			levelOfWater = 1;
		} else if (value == 2) {
			levelOfWater = 2;
		} else if (value == 3) {
			levelOfWater = 3;
		}
		return value;
	}

	/**
	 * this method prints status of animals in their habitat
	 */
	public void printStatus() {
		if (active == dayOrNight && levelOfWater == water) {
			System.out
					.println("It is fine. The animal is active and has water.");
		} else if (active != dayOrNight && levelOfWater == water) {
			System.out
					.println("The animal is not active, but has enough water.");
		} else if (active == dayOrNight && levelOfWater != water) {
			System.out
					.println("The animal is active, but does not have enough water.");
		} else if (active != dayOrNight && levelOfWater != water) {
			System.out
					.println("The animal is not active and it does not have enough water.");
		}
	}

	public static void levelOfWater() {

	}

}
