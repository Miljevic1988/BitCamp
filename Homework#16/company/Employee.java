package ba.bitcamp.company;

public class Employee {

	private String name;
	private String sex;
	private int monthSalary;

	/**
	 * Constructor
	 */
	public Employee(String name, String sex, int monthlySalary) {
		super();
		this.name = name;
		this.sex = sex;
		this.monthSalary = monthlySalary;
	}

	/**
	 * This method returns the name of employee.
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method returns the sex of employee.
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * This method returns the month salary of employee.
	 */
	public int getMonthSalary() {
		return monthSalary;
	}

	/**
	 * This method sets the month salary of employee.
	 */
	public void setMonthSalary(int monthSalary) {
		this.monthSalary = monthSalary;
	}
}
