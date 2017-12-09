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
	 * Determine whether or not a card is a face card.
	 * @return bool
	 */
	public boolean isFaceCard() {
		return this.rank.value() > 10;
	}
	
	/**
	 * Get the value of this card.
	 * @return value
	 */
	public int getValue() {
		return this.rank.value();
	}
	
	/**
	 * Get a string representation of a card.
	 * @return string
	 */
	public String toString() {
		return this.rank + " of " + this.suit;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rank == null) ? 0 : rank.hashCode());
		result = prime * result + ((suit == null) ? 0 : suit.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlayingCard other = (PlayingCard) obj;
		if (rank != other.rank)
			return false;
		if (suit != other.suit)
			return false;
		return true;
	}

}
