package cards;

/**
 * Set of enums describing suits for playing cards.
 * @author andrewburke
 *
 */
public enum Suit {
	
	CLUBS (0),
	DIAMONDS (1),
	HEARTS (2),
	SPADES (3);
	
	/**
	 * Vaule of a suit (for sorting purposes only).
	 */
	private int value;
	
	/**
	 * Constructor.
	 * @param i value
	 */
	Suit(int i) {
		this.value = i;
	}
	
	/**
	 * Get a suit's value.
	 * @return
	 */
	public int value() {
		return this.value;
	}

}
