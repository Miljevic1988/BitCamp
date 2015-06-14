package ba.bitcamp.music;

public class Album {

	String nameOfAlbum;
	Artist artist;
	Song[] songs;
	String genreOfAlbum;

	public Album(String nameOfAlbum, Artist artist, Song[] song,
			String genreOfAlbum) {
		super();
		this.nameOfAlbum = nameOfAlbum;
		this.artist = artist;
		this.songs = song;
		this.genreOfAlbum = genreOfAlbum;
	}

	public String toString() {
		String s = "";
		s = "Name of the album: " + nameOfAlbum + "\n";
		s = s + "The artist is: " + artist + "\n";
		s = s + "Name of the song: " + songs + "\n";
		s = s + "Genre of the album: " + genreOfAlbum + "\n";
		return s;
	}

}
