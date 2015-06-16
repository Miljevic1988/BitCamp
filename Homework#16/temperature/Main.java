package ba.bitcamp.temperature;

public class Main {

	public static void main(String[] args) {

		// declaring and initializing variable
		Temperature t = new Temperature(100);

		// testing methods
		System.out.println("The temperature is: " + t.getTemperatureInC()
				+ " degrees Celsius." + "\n");
		System.out.println("The temperature is: " + t.getTemperatureInK()
				+ " degrees Kelvin." + "\n");
		System.out.println("The temperature is: " + t.getTemperatureInF()
				+ " degrees Fahrenheit.");

	}

}
