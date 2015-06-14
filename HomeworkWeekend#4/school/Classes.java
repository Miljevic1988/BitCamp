package ba.bitcamp.school;

public class Classes {

	String nameOfClass;
	Integer numberOfStudents;

	public Classes(String nameOfClass, Integer numberOfStudents) {
		super();
		this.nameOfClass = nameOfClass;
		this.numberOfStudents = numberOfStudents;
	}

	public String toString() {
		String s = "";
		s = nameOfClass + "\n";
		s = s + "Number of students: " + numberOfStudents + "\n";
		return s;
	}

}
