package ba.bitcamp.school;

public class Director {

	String nameOfDirector;
	Integer yearOfBirth;

	public Director(String nameOfDirector, Integer yearOfBirth) {
		super();
		this.nameOfDirector = nameOfDirector;
		this.yearOfBirth = yearOfBirth;
	}

	public String toString() {
		String s = "";
		s = nameOfDirector + "\n";
		s = s + "Year of the birth: " + yearOfBirth;
		return s;
	}

}
