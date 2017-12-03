package cards;

/**
 * Set of enums describing a card's rank.
 * @author andrewburke
 *
 */
public enum Rank {
	
	ACE (1),
	TWO (2),
	THREE (3),
	FOUR (4),
	FIVE (5),
	SIX (6),
	SEVEN (7),
	EIGHT (8),
	NINE (9),
	TEN (10),
	JACK (11),
	QUEEN (12),
	King (13);
	
	/**
	 * Value of a rank.
	 */
	private final int value;
	
	/**
	 * Constructor.
	 * @param i value
	 */
	Rank(int i) {
		this.value = i;
	}
	
	/**
	 * Get a rank's value.
	 * @return
	 */
	public int value() {
		return this.value;
	}

}
