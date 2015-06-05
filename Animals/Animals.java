public class Animals {
	private String name;
	private String sound;
	private boolean wild;
	private Integer numberOfExtremities;

	public Animals(String sound, String name, boolean wild,
			Integer numberOfExtremities) {
		super();
		this.sound = sound;
		this.name = name;
		this.wild = wild;
		this.numberOfExtremities = numberOfExtremities;
	}

	public String toString() {
		String s = "";
		s = s + "Name: " + name + "\n";
		s = s + "Sound: " + sound + "\n";
		s = s + "Wild: " + wild + "\n";
		s = s + "Number of extremities: " + numberOfExtremities + "\n";
		return s;
	}
}