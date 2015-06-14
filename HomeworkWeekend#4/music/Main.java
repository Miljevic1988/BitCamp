package ba.bitcamp.music;


public class Main {

	public static void main(String[] args) {

		Artist a1 = new Artist("Riblja corba", true, 1978, "rock");
		Artist a2 = new Artist("Bajaga i Instruktori", true, 1984, "rock");
		Artist a3 = new Artist("Galija", true, 1977, "rock");

		Song s1 = new Song(a1, "Nojeva barka", 1999, "rock");
		Song s2 = new Song(a1, "Al Kapone", 1990, "rock");
		Song s3 = new Song(a2, "Moji drugovi", 2002, "rock");
		Song s4 = new Song(a2, "Lepa Janja", 2001, "rock");
		Song s5 = new Song(a3, "Skadarska", 1991, "rock");
		Song s6 = new Song(a3, "Da me nisi", 1991, "rock");

		Album al1 = new Album("Corba", a1, new Song[1], "rock");
		al1.songs[0] = s1;
		Album al2 = new Album("Bajaga", a2, new Song[3], "rock");
		al2.songs[0] = s3;
		al2.songs[1] = s4;
		Album al3 = new Album("Galija", a3, new Song[5], "rock");
		al3.songs[0] = s5;
		al3.songs[1] = s6;
		
		 
		// testing methods
		System.out.println("Is it the same author of song1 and song2? "
				+ isSameAuthor(s1, s2) + "\n");
		System.out.println("Is the song from solo author? "
				+ isFromSoloAuthor(s1) + "\n");
		System.out.println("Year of the older song: "
				+ getOlderSong(s1, s2).yearOfSong + "\n");

		System.out.println("Number of songs og that genre: "
				+ countGenreNumber(al1, "rock") + "\n");
		printAlbumInformation(new Album[] { al1, al2, al1 }, s3);
		 

	}

	/**
	 * methods to determine is it the same author of the song
	 * 
	 * @param s1
	 *            represents song number 1
	 * @param s2
	 *            represents song number 2
	 * @return true if it is the same author, if it is not it will return false
	 */
	public static boolean isSameAuthor(Song s1, Song s2) {

		if (s1.artist.equals(s2.artist)) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * this method determine is it author of the song solo author or is a band
	 * 
	 * @param s
	 *            represents the song
	 * @return false if it is a band or return true if it is solo author
	 */
	public static boolean isFromSoloAuthor(Song s) {

		if (s.artist.isItBand.equals(true)) {
			return false;
		} else {
			return true;
		}

	}

	/**
	 * this method determine which song is older
	 * 
	 * @param s1
	 *            represents song number 1
	 * @param s2
	 *            represents song number 2
	 * @return song number 2 if it is the year of s1 song is bigger than the
	 *         year of s2 song
	 */
	public static Song getOlderSong(Song s1, Song s2) {
		if (s1.yearOfSong > (s2.yearOfSong)) {
			return s2;
		} else {
			return s1;
		}
	}

	/**
	 * 
	 * @param a
	 * @param genre
	 * @return
	 */
	public static int countGenreNumber(Album a, String genre) {

		int counter = 0;
		for (int i = 0; i < a.songs.length; i++) {
			if (a.songs[i].genreOfSong == genre) {
				counter++;
			}
		}
		return counter;
	}

	public static void printAlbumInformation(Album[] a, Song s) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].songs.length; j++) {
				if (a[i].songs[j].nameOfSong == s.nameOfSong) {
					System.out.println("Album: " + a[i].nameOfAlbum);
					return;
				}
			}
		}
		System.out.println("Album: null");
	}
}

	 