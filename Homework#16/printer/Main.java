package ba.bitcamp.printer;

public class Main {

	public static void main(String[] args) {

		// declaring and initializing variables
		Printer p1 = new Printer("BIT Camp printer", 0, 0, 0);
	
		//testing methods
		System.out.println("There is ink. " + p1.hasInk() + "\n");
		System.out.println("There is paper. " + p1.hasPaper() + "\n");
		System.out.println("Total printed pages: " + p1.sumPages() + "\n");

		p1.addPaper(100); // adding paper into the printer
		System.out.println("Current paper amount is: "
				+ p1.getCurrentPaperAmount() + "\n");

		p1.addInk(100);// adding ink into the printer
		System.out.println("Current ink amount is: " + p1.inkAmmount() + "\n");

		System.out.println(p1);// printer name and status

	}
}
