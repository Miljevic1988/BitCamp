package ba.bitcamp.glass;

public class Glass {
	private String liquidType;
	private int liquidAmount;
	private int liquidMax;
	private int currentCapacity;

	/**
	 * Conctructor
	 */
	public Glass(String liquidType, int liquidAmonut, int liquidMax) {
		this.liquidType = liquidType;
		this.liquidAmount = liquidAmonut;
		this.liquidMax = liquidMax;
		this.currentCapacity = 60;

	}

	public String toString() {
		String s = "";
		s = "Type of liquid is: " + liquidType + "\n";
		s = s + "Amount of liquid is: " + liquidAmount + "\n";
		s = s + "Maximum of liquid is: " + liquidMax;
		return s;
	}

	/**
	 * This method prints type of liquid in the glass.
	 */
	public String getTypeOfLiquid() {
		return liquidType;
	}

	/**
	 * This method prints max capacity of the glass.
	 */
	public int getMaxCapacity() {
		return liquidMax;
	}

	/**
	 * This method prints the capacity of the glass that is not filled with
	 * liquid.
	 */
	public int getCurrentCapacity() {
		return currentCapacity;
	}

	/**
	 * This method add more liquid in the glass.
	 */
	public void addLiquid(String water, int a) {
		currentCapacity += a;
	}

	/**
	 * This method substract liquid.
	 */
	public void substractLiquid(String water, int a) {
		currentCapacity -= a;

	}

	/**
	 * This method prints an empty glass.
	 */
	public void emptyGlass() {
		currentCapacity = 0;
	}

}