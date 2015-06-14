package ba.bitcamp.books;

public class Book {

	String nameOfBook;
	Integer yearOfPublication;
	String genreOfBook;
	Boolean isItBestseller;

	public Book(String nameOfBook, Integer yearOfPublication,
			String genreOfBook, Boolean isItBestseller) {
		super();
		this.nameOfBook = nameOfBook;
		this.yearOfPublication = yearOfPublication;
		this.genreOfBook = genreOfBook;
		this.isItBestseller = isItBestseller;
	}

	public String toString() {
		String s = "";
		s = "Name of the book: " + nameOfBook + "\n";
		s = s + "Year of publication: " + yearOfPublication + "\n";
		s = s + "Genre of book: " + genreOfBook + "\n";
		s = s + "Is it bestseller: " + isItBestseller + "\n";
		return s;
	}

}
