package ba.bitcamp.school;

import java.util.Arrays;

public class School {

	String nameOfSchool;
	Director director;
	Classes[] classes;

	public School(String nameOfSchool, Director director, Classes[] classes) {
		super();
		this.nameOfSchool = nameOfSchool;
		this.director = director;
		this.classes = classes;
	}

	public String toString() {
		String s = "";
		s = "Name of the school: " + nameOfSchool + "\n";
		s = s + "Director is: " + director + "\n";
		s = s + "Classes: " + Arrays.toString(classes) + "\n";
		return s;
	}
}
