package ba.bitcamp.cashbox;

public class Main {

	public static void main(String[] args) {
		// declaring and initializing variables
		Cashbox c = new Cashbox("My cashbox");

		// testing methods
		c.printInformation();

		c.addMoney(30);
		c.printInformation();

		c.addMoney(100);
		c.printInformation();

		c.clear();
		c.printInformation();

	}
}