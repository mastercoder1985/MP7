package cards;

/**
 * A deck of playing cards.
 * @author andrewburke
 *
 */
public class Deck extends PlayingCardList{
	
	/**
	 * Default constructor.
	 */
	public Deck() {
		for(Rank r : Rank.values()) {
			for(Suit s : Suit.values()) {
				PlayingCard c = new PlayingCard(s,r);
				this.add(c);
			}
		}
	}
	
	/**
	 * Draw a card from the top of deck.
	 * @return card drawn
	 */
	public PlayingCard draw() {
		return this.remove(0);
	}
	
	/**
	 * Shuffle a deck.
	 */
	public void shuffle() {
		for(int i = 0; i < this.length() - 1; i++) {
			int randomIndex = (int) (Math.random() * (this.length() - i - 1)) + i + 1;
			this.swap(i, randomIndex);
		}
	}
	
	

}
