package ba.bitcamp.printer;

public class Printer {
	private String name;
	private int currentPaperAmount;
	private int inkAmount;
	private int sumPages;


	/**
	 * Constructor
	 */
	public Printer(String name, int currentPaperAmount, int inkAmount,
			int sumPages) {
		this.name = name;
		this.currentPaperAmount = currentPaperAmount;
		this.inkAmount = inkAmount;
		this.sumPages = sumPages;
	}

	/**
	 * This method prints info about printer status.
	 */
	public String toString() {
		String status = "";
		if (currentPaperAmount > 0 && inkAmount > 0) {
			status = "Ready";
		} else if (currentPaperAmount == 0 && inkAmount > 0) {
			status = "No paper";
		} else if (currentPaperAmount > 0 && inkAmount == 0) {
			status = "No ink";
		} else {
			status = "No ink nor paper";
		}

		String s = "";
		s = "Name: " + name + "\n";
		s += "Status: " + status + "\n";

		return s;
	}

	/**
	 * This method is checking is there ink in the printer.
	 */
	public boolean hasInk() {
		return (inkAmount != 0) ? true : false;
	}

	/**
	 * This method is checking is there paper in the printer.
	 */
	public boolean hasPaper() {
		return (currentPaperAmount != 0) ? true : false;
	}

	/**
	 * This method is checking sum of pages.
	 */
	public int sumPages() {
		return sumPages;
	}

	/**
	 * this method is adding paper into the printer. The maximum is 100.
	 */
	public void addPaper(int paper) {
		if (this.currentPaperAmount + paper < 100) {
			this.currentPaperAmount += paper;
		} else {
			this.currentPaperAmount = 100;
		}

	}

	/**
	 * This methods add ink into the printer. The maximum is 100.
	 */
	public void addInk(int ink) {
		inkAmount = 100;
	}

	/**
	 * This method prints current paper amount.
	 */
	public int getCurrentPaperAmount() {
		return currentPaperAmount;
	}

	/**
	 * This method prints amount of ink.
	 */
	public int inkAmmount() {
		return inkAmount;
	}

	/**
	 * This method prints paper. For every single page it takes out one paper
	 * and three inks. If there is no paper or ink, in that case we don't have
	 * to print anything.
	 */
	public void printPaper(int paper) {

		if (currentPaperAmount - paper > 0 && inkAmount - (paper * 3) > 0) {
			currentPaperAmount -= paper;
			inkAmount -= (paper * 3);
			sumPages += paper;
			currentPaperAmount += paper;
		} else if (currentPaperAmount - paper < 0) {
			try {
				currentPaperAmount += paper - currentPaperAmount;
				sumPages += paper - currentPaperAmount;
				currentPaperAmount = 0;
				inkAmount -= (paper * 3);
				throw new IllegalArgumentException();
			} catch (IllegalArgumentException ex) {
				System.out.println("There is no paper.");
			}
		} else if (inkAmount - (paper * 3) < 0) {
			try {
				currentPaperAmount -= inkAmount / 3;
				sumPages += inkAmount / 3;
				currentPaperAmount += inkAmount / 3;
				inkAmount = 0;
				throw new IllegalArgumentException();
			} catch (IllegalArgumentException ex) {
				System.out.println("There is no ink.");
			}
		}
	}

}
