public class GermanCard implements Card {
	public static String[] suits = {"Kreuz", "Karo", "Herz", "Pik"};
	public static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
			"Bube", "Dame", "König", "Ass"};
	private String suit;
	private String rank;
	
	
	public GermanCard(String suit, String rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	// implement toString:
	public String toString() {
		return rank + " von " + suit;
	}
}
