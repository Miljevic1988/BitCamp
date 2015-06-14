package ba.bitcamp.football;

public class Player {

	String nameOfPlayer;
	Integer yearOfBirth;
	String positionOfPlayer;

	public Player(String nameOfPlayer, Integer yearOfBirth,
			String positionOfPlayer) {
		super();
		this.nameOfPlayer = nameOfPlayer;
		this.yearOfBirth = yearOfBirth;
		this.positionOfPlayer = positionOfPlayer;
	}

	public String toString() {
		String s = "";
		s = "Name: " + nameOfPlayer + "\n";
		s = s + "Year of birth: " + yearOfBirth + "\n";
		s = s + "Position of plyer: " + positionOfPlayer + "\n";
		return s;
	}
}
