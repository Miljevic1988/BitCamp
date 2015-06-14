package ba.bitcamp.football;

public class Main {
	public static void main(String[] args) {
		
		Player p1 = new Player("Petr Cech", 1982, "Goalkeeper");
		Player p2 = new Player("Branislav Ivanovic", 1985, "Defender");
		Player p3 = new Player("John Terry", 1980, "Defender");
		Player p4 = new Player("Nemanja Matic", 1988, "Midfielder");
		Player p5 = new Player("Didier Drogba", 1978, "Striker");
		Player p6 = new Player("Cesc Fabregas", 1987, "Midfielder");
		Player p7 = new Player("Filipe LUis", 1985, "Defender");
		Player p8 = new Player("Ramires", 1987, "Midfielder");
		Player p9 = new Player("Oscar", 1991, "Atacking Midfielder");
		Player p10 = new Player("Eden Hazard", 1991, "Atacking Midfielder");
		Player p11 = new Player("John Obi Mikel", 1987, "Midfileder");
		Player p12 = new Player("Diego Costa", 1988, "Striker");
		Player p13 = new Player("Willian", 1988, "Winger");
		Player p14 = new Player("Thibaut Courtois", 1992, "Goalkeeper");

		Player[] players1 = { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11,
				p12, p13, p14 };
		FootballTeam t1 = new FootballTeam("Chelsea", players1);

		//testing methods
		System.out.println("Name of the player: " + p1.nameOfPlayer + "\n");
		System.out.println("Name of the team: " + t1.nameOfTeam + "\n");
		System.out
				.println("The number of players who have the same age on the team: "
						+ countPlayers(t1, 1988) + "\n");
		System.out
				.println("The number of players who are in the same position on the team: "
						+ countPlayers(t1, "Defender") + "\n");
		System.out.println("The youngest player on the team is: " + "\n"
				+ getYoungestPlayer(t1));

	}

	/**
	 * this method determine how many players in the team are the same age
	 * 
	 * @param t
	 *            is the team
	 * @param year
	 *            is the year of birth
	 * @return returns counter that count all the players in the team
	 */
	public static int countPlayers(FootballTeam t, int year) {
		int counter = 0;

		for (int i = 0; i < t.players.length; i++) {
			if (t.players[i].yearOfBirth == year) {
				counter++;
			}
		}
		return counter;
	}

	/**
	 * this method determine how many players in the team plays at the same
	 * position
	 * 
	 * @param t
	 *            is the team
	 * @param position
	 *            is position of the player in the team
	 * @return
	 */
	public static int countPlayers(FootballTeam t, String position) {
		int counter = 0;

		for (int i = 0; i < t.players.length; i++) {
			if (t.players[i].positionOfPlayer == position) {
				counter++;
			}
		}
		return counter;
	}

	/**
	 * this method determine who is the youngest player on the team
	 * 
	 * @param t is the team
	 * @return who is the youngest
	 */
	public static Player getYoungestPlayer(FootballTeam t) {

		int min = 0;

		for (int i = 0; i < t.players.length; i++) {
			if (t.players[i].yearOfBirth > min) {
				min = t.players[i].yearOfBirth;
			}
		}

		for (int j = 0; j < t.players.length; j++) {
			if (t.players[j].yearOfBirth == min) {
				return t.players[j];
			}
		}
		return null;
	}

}
