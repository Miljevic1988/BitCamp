package ba.bitcamp.books;

public class Main {

	public static void main(String[] args) {
		// original book names
		Book b1 = new Book("Basta sljezove boje", 1970, "novel", false);
		Book b2 = new Book("Orlovi rano lete", 1957, "novel", false);
		Book b3 = new Book("Dozivljaji Nikoletine Bursaca", 1955, "novel",
				false);

		Book[] books1 = { b1, b2, b3 };
		Author a1 = new Author("Branko Copic", 1892, books1);

		Book b4 = new Book("Alchemist", 1988, "novel", true);
		Book b5 = new Book("Zahir", 2005, "novel", false);
		Book b6 = new Book("Alef", 2011, "novel", false);

		Book[] books2 = { b4, b5, b6 };
		Author a2 = new Author("Paulo Coelho", 1947, books2);

		Author[] authors = { a1, a2 };

		// testing methods
		System.out.println("Name of the book is: " + b1.nameOfBook + "\n");
		System.out.println("Name of the author is: " + a1.nameOfAuthor + "\n");
		System.out.println("Number of bestselling Paulo Coelho: "
				+ countBestsellingBooks(a2) + "\n");
		System.out.println("Number of Paulo Coelho books published between 1988 and 2015: "
				+ getNumberOfWrittenBooks(a2, 1900, 2100) + "\n");
		System.out.println(getAuthorWithMostBestsellers(authors));

	}

	/**
	 * method that returns a number corresponding to the number of bestselling
	 * books from this author
	 * 
	 * @param a
	 *            is author
	 * @return
	 */
	public static int countBestsellingBooks(Author a) {
		int counter = 0;

		for (int i = 0; i < a.numberOfBooks.length; i++) {
			if (a.numberOfBooks[i].isItBestseller.equals(true)) {
				counter++;
			}
		}
		return counter;
	}

	/**
	 * method returns a number that corresponds to the number of books published
	 * between the date of two years by a given author
	 * 
	 * @param a
	 *            is author
	 * @param year1
	 *            represents first year
	 * @param year2
	 *            represents second year
	 * @return counter
	 */
	public static int getNumberOfWrittenBooks(Author a, int year1, int year2) {
		int counter = 0;

		for (int i = 0; i < a.numberOfBooks.length; i++) {
			if (a.numberOfBooks[i].yearOfPublication >= year1
					&& a.numberOfBooks[i].yearOfPublication <= year2) {
				counter++;
			}

		}
		return counter;

	}

	/**
	 * method that returns author who had the most bestsellers
	 * 
	 * @param authors
	 * @return
	 */
	public static Author getAuthorWithMostBestsellers(Author[] authors) {
		int max = 0;

		for (int i = 0; i < authors.length; i++) {
			if (countBestsellingBooks(authors[i]) > max) {
				max = countBestsellingBooks(authors[i]);
			}
		}
		for (int i = 0; i < authors.length; i++) {
			if (countBestsellingBooks(authors[i]) == max) {
				return authors[i];
			}
		}

		return null;
	}
}
