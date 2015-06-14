package ba.bitcamp.books;

import java.util.Arrays;

public class Author {

	String nameOfAuthor;
	Integer yearOfBirth;
	Book[] numberOfBooks;

	public Author(String nameOfAuthor, Integer yearOfBirth, Book[] numberOfBooks) {
		super();
		this.nameOfAuthor = nameOfAuthor;
		this.yearOfBirth = yearOfBirth;
		this.numberOfBooks = numberOfBooks;
	}

	public String toString() {
		String s = "";
		s = "Name of the author: " + nameOfAuthor + "\n";
		s = s + "Year of birth: " + yearOfBirth + "\n";
		s = s + "Number of books: " + Arrays.toString(numberOfBooks) + "\n";
		return s;
	}
}
