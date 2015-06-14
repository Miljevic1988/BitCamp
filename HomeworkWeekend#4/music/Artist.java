package ba.bitcamp.music;

public class Artist {

	String nameOfArtist;
	Boolean isItBand;
	Integer year;
	String genreOfMusic;
	
	 
	 
	public Artist(String nameOfArtist, Boolean isItBand, Integer year,
			String genreOfMusic) {
		super();
		this.nameOfArtist = nameOfArtist;
		this.isItBand = isItBand;
		this.year = year;
		this.genreOfMusic = genreOfMusic;
	}



	public String toString() {
		String s = "";
		s ="Name of the artist is: " + nameOfArtist + "\n";
		s = s + "Is it a band: " + isItBand + "\n";
		s = s + "Established: " + year + "\n";
		s = s + "Music genre is: " + genreOfMusic;
		return s;
	}
	
}
