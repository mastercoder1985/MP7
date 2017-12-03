package cards;

/**
 * A standard playing card.
 * @author andrewburke
 *
 */
public class PlayingCard {
	
	/**
	 * Suit of the card.
	 */
	private Suit suit;
	
	/**
	 * Rank of the card.
	 */
	private Rank rank;
	
	/**
	 * Standard constructor.
	 * @param s suit
	 * @param r rank
	 */
	public PlayingCard(Suit s, Rank r) {
		this.suit = s;
		this.rank = r;
	}
	
	/**
	 * Copy constructor.
	 * @param c card to copy
	 */
	public PlayingCard(PlayingCard c) {
		this.suit = c.suit;
		this.rank = c.rank;
	}
	
	/**
	 * Get a card's suit.
	 * @return suit
	 */
	public Suit suit() {
		return this.suit;
	}
	
	/**
	 * Get a card's rank.
	 * @return rank
	 */
	public Rank rank() {
		return this.rank;
	}
	
	/**
	 * Get a string representation of a card.
	 * @return string
	 */
	public String toString() {
		return this.rank + " of " + this.suit;
	}

}
