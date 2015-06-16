package ba.bitcamp.company;

public class Company {

	private String name;
	private Employee director;
	private Employee[] employees;

	/**
	 * Constructor.
	 */
	public Company(String name, Employee director, Employee[] employees) {
		this.name = name;
		this.director = director;
		this.employees = employees;
	}

	/**
	 * This method get number of employees.
	 */
	public int getNumberOfEmployees() {
		return employees.length;
	}

	/**
	 * This method returns sum of all salaries.
	 */
	public int getSalaries() {
		int salaries = 0;
		for (int i = 0; i < employees.length; i++) {
			salaries += employees[i].getMonthSalary();
		}
		return salaries;
	}

	/**
	 * This method returns number of all female employees.
	 */
	public int numberOfFemaleEmployees() {
		int counter = 0;
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getSex().equals("female")) {
				counter++;
			}
		}
		return counter;
	}

	/**
	 * This method increases all salaries.
	 */
	public void increaseSalaries(int increase) {
		director.setMonthSalary(director.getMonthSalary() + increase);
		for (int i = 0; i < employees.length; i++) {
			employees[i].setMonthSalary(employees[i].getMonthSalary()
					+ increase);
		}
	}

	/**
	 * This method returns String.
	 */
	public String toString() {
		String s = "Company: " + name + "\n";
		s = s + "Director: " + director.getName() + "\n";
		s = s + "Number of employees: " + employees.length;
		return s;
	}

}
