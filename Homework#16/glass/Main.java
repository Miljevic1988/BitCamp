package ba.bitcamp.glass;

public class Main {

	public static void main(String[] args) {

		// declaring and initializing variabe
		Glass g = new Glass("Water", 0, 100);

		// testing methods
		System.out.println("Type of liquid is: " + g.getTypeOfLiquid() + "\n");
		System.out.println("Maximum capacity of glass is: "
				+ g.getMaxCapacity() + "\n");
		System.out.println("Current capacity of glass is: "
				+ g.getCurrentCapacity() + "\n");

		g.addLiquid("Water", 60);// adding more water
		g.substractLiquid("Water", 20);// spilling of water from the glass

		System.out
				.println("Capacity of glass after increasing the amount of water is: "
						+ g.getCurrentCapacity() + "\n");

		g.emptyGlass();
		System.out
				.println("Capacity of glass after spilling all the water is: "
						+ g.getCurrentCapacity());
	}

}
