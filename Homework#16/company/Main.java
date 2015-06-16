package ba.bitcamp.company;

public class Main {

	public static void main(String[] args) {
		// declaring and initializing variables
		Employee e1 = new Employee("Endi Semberg", "male", 2000);
		Employee e2 = new Employee("Sara Silverman", "female", 1900);
		Employee e3 = new Employee("Vil Smit", "male", 1800);
		Employee e4 = new Employee("David Spade", "male", 1700);
		Employee e5 = new Employee("Tina Fej", "female", 1600);
		Employee e6 = new Employee("Robin Vilijams", "male", 1500);
		Employee e7 = new Employee("Adam Sendler", "male", 1400);
		Employee e8 = new Employee("Alexis Cruz", "male", 1300);
		Employee e9 = new Employee("Susan Dey", "female", 1200);
		Employee e10 = new Employee("Tina Fey", "female", 1100);

		Company c = new Company("DREAM company", e1, new Employee[] { e2, e3,
				e4, e5, e6, e7, e8, e9, e10 });

		// testing methods
		System.out.println("Number of employees: " + c.getNumberOfEmployees()
				+ "\n");
		System.out.println("Sum of salarises of employees: " + c.getSalaries()
				+ "\n");
		System.out.println("Number of female employees: "
				+ c.numberOfFemaleEmployees() + "\n");
		c.increaseSalaries(1000);
		System.out.println("Salaries of employees after an increasement: "
				+ c.getSalaries() + "\n");
		System.out.println(c);

	}

}
