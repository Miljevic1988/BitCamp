package ba.bitcamp.cashbox;

public class Cashbox {

	private String cashboxName; // name of the cashbox
	private int sumOfMoney; // sum of the money

	/**
	 * generate constructor using fields cashboxName and sumOfMoney
	 * 
	 * @param cashboxName
	 */
	public Cashbox(String cashboxName) {
		super();
		this.cashboxName = cashboxName;
		sumOfMoney = 0;

	}

	/**
	 * this methods add money in the cashbox
	 * 
	 * @param a
	 */
	public void addMoney(int a) {
		sumOfMoney += a;
	}

	/**
	 * getting sum of the money in the cashbox
	 * 
	 * @return sum that is in the cashbox
	 */
	public int getSumOfMoney() {
		return sumOfMoney;
	}

	/**
	 * set sum of money in the cashbox
	 * 
	 * @param sumOfMoney
	 */
	public void setSumOfMoney(int sumOfMoney) {
		this.sumOfMoney = sumOfMoney;
	}

	/**
	 * this methods substract money from the cashbox
	 * 
	 * @param b
	 */
	public void substractMoney(int b) {
		sumOfMoney -= b;
	}

	/**
	 * this method takes all the money from the cashbox
	 */
	public void clear() {
		sumOfMoney = 0;
	}

	/**
	 * this method prints information about cashbox status
	 */
	public void printInformation() {
		if (sumOfMoney == 0) {
			System.out.println("It is empty");
		} else if (sumOfMoney >= 1 && sumOfMoney <= 20) {
			System.out.println("There is some but not much");
		} else if (sumOfMoney >= 21 && sumOfMoney <= 100) {
			System.out.println("There is some");
		} else {
			System.out.println("There is a lot");
		}
	}

}
