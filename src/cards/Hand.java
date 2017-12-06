package cards;
/** Class to represent the hand for the player and dealer.*/
public class Hand extends Deck {
	
	private Hand exHand;
	private int handValue;
	/** Constructor to make a new hand.*/ 
	public Hand() {
		
	}
	/** adds a card to the hand.*/
	public void addCard(PlayingCard card) {
		exHand.add(card);
	}
	public int getCards() {
		return exHand.length();
	}
	// gets the value of the Hand. will figure out later.
	public int getHandValue() {
	return 0;	
	}
	
}
