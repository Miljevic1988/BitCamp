public class Task6movie {

	private String name;
	private Integer year;
	private String director;
	private String genere;
	private double imdb;
	private boolean oscar;

	public Task6movie(String name, Integer year, String director, String genere,
			Double imdb, Boolean oscar) {
		this.name = name;
		this.year = year;
		this.director = director;
		this.genere = genere;
		this.imdb = imdb;
		this.oscar = oscar;
		

	}

	public String toString() {
		String s = "";
		s = s + "Name: " + name + "\n";
		s = s + "Year: " + year + "\n";
		s = s + "Director: " + director + "\n";
		s = s + "Genere: " + genere + "\n";
		s = s + "IMDB rating: " + imdb + "\n";
		s = s + "Oscar: " + oscar + "\n";
		return s;
	}

}