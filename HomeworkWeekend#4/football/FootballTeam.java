package ba.bitcamp.football;

import java.util.Arrays;

public class FootballTeam {

	String nameOfTeam;
	Player[] players;

	public FootballTeam(String nameOfTeam, Player[] players) {
		super();
		this.nameOfTeam = nameOfTeam;
		this.players = players;
	}

	public String toString() {
		String s = "";
		s = "Name: " + nameOfTeam + "\n";
		s = s + "Players: " + Arrays.toString(players) + "\n";
		return s;
	}

}
