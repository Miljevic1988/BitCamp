package ba.bitcamp.temperature;

public class Temperature {

	private int degrees; // temperature in degrees

	/**
	 * Generating constructor using fields.
	 */
	public Temperature(int degrees) {
		this.degrees = degrees;
	}

	/**
	 * This method prints the temperature in Celsius.
	 */
	public int getTemperatureInC() {
		return degrees;

	}

	/**
	 * This method prints the temperature in Kelvin.
	 */
	public double getTemperatureInK() {
		return degrees + 273.15;
	}

	/**
	 * This method prints the temperature in Fahrenheit.
	 */
	public double getTemperatureInF() {
		return degrees * 1.8 + 32;
	}

	/**
	 * This method sets value of temperature.
	 * 
	 * @param degrees
	 */
	public void setTemperature(int temperature) {
		this.degrees = temperature;
	}

}
