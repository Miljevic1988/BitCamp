package ba.bitcamp.school;

public class Main {

	public static void main(String[] args) {

		Director d1 = new Director("Petar Petrovic", 1952);

		Classes c1 = new Classes("First class", 25);
		Classes c2 = new Classes("Second class", 30);
		Classes c3 = new Classes("Third class", 35);

		Classes[] class1 = { c1, c2, c3 };

		School s1 = new School("Srednja strucna skola Branko Radicevic", d1,
				class1);

		Director d2 = new Director("Marko Markovic", 1957);

		Classes c4 = new Classes("Fourth class", 24);
		Classes c5 = new Classes("Fifth class", 29);
		Classes c6 = new Classes("Sixth class", 34);

		Classes[] class2 = { c4, c5, c6 };

		School s2 = new School("Gimnazija Stevan Puzic", d2, class2);

		School[] schools = { s1, s2 };

		// testing methods
		System.out.println("Class with the most students is: "
				+ getNamOfClassWithTheMostStudents(s1) + "\n");
		System.out.println(getSchoolWithYoungestDirector(schools));
		System.out.println("Name of the school that has the most students is: "
				+ getNameOfSchoolWithMoreStudents(s1, s2));
	}

	/**
	 * the class that has the most students
	 * 
	 * @param s
	 *            represents school
	 * @return name of the class
	 */
	public static String getNamOfClassWithTheMostStudents(School s) {
		String name = "";
		int max = 0;
		for (int i = 0; i < s.classes.length; i++) {
			if (s.classes[i].numberOfStudents > max) {
				max = s.classes[i].numberOfStudents;
			}
		}
		for (int i = 0; i < s.classes.length; i++) {
			if (s.classes[i].numberOfStudents == max) {
				name = s.classes[i].nameOfClass;
			}
		}

		return name;

	}

	/**
	 * the school with the youngest director
	 */
	public static School getSchoolWithYoungestDirector(School[] schools) {

		int min = 0;

		for (int i = 0; i < schools.length; i++) {
			if (schools[i].director.yearOfBirth > min) {
				min = schools[i].director.yearOfBirth;
			}
		}

		for (int j = 0; j < schools.length; j++) {
			if (schools[j].director.yearOfBirth == min) {
				return schools[j];
			}
		}
		return null;
	}

	/**
	 * name of the school which have more students
	 */
	public static String getNameOfSchoolWithMoreStudents(School s1, School s2) {
		int numOfStudents1 = 0;
		int numOfStudents2 = 0;

		for (int i = 0; i < s1.classes.length; i++) {

			numOfStudents1 += s1.classes[i].numberOfStudents;
		}
		for (int i = 0; i < s2.classes.length; i++) {

			numOfStudents2 += s2.classes[i].numberOfStudents;
		}

		if (numOfStudents1 > numOfStudents2) {
			return s1.nameOfSchool;
		} else {
			return s2.nameOfSchool;
		}

	}

}
