package cards;

/**
 * A deck of playing cards.
 * @author andrewburke
 *
 */
public class Deck extends PlayingCardList{
	
	public Deck() {
		for(Rank r : Rank.values()) {
			for(Suit s : Suit.values()) {
				this.add(new PlayingCard(s,r));
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
		for(int i = 0; i < this.length() - 2; i++) {
			int randomIndex = (int) (Math.random() * (this.length() - i) + i + 1);
			this.swap(i, randomIndex);
		}
	}

}
