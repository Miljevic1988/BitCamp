package ba.bitcamp.music;

public class Song {

	Artist artist;
	String nameOfSong;
	Integer yearOfSong;
	String genreOfSong;

	public Song(Artist artist, String nameOfSong, Integer yearOfSong,
			String genreOfSong) {
		super();
		this.artist = artist;
		this.nameOfSong = nameOfSong;
		this.yearOfSong = yearOfSong;
		this.genreOfSong = genreOfSong;
	}

	public String toString() {
		String s = "";
		s = "Name of the artist: " + artist + "\n";
		s = s + "Name of the song: " + nameOfSong + "\n";
		s = s + "Year of the song: " + yearOfSong + "\n";
		s = s + "Genre of the song: " + genreOfSong + "\n";
		return s;
	}

}
