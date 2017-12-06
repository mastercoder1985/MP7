package cards;
/** Class to represent the hand for the player and dealer.*/
public class Hand extends Deck {
	/** Constructor to make a new hand.*/ 
	Hand exHand;
	public Hand() {
		
	}
	/** adds a card to the hand.*/
	public void addCard(PlayingCard card) {
		exHand.add(card);
	}
	public int getCards() {
		return exHand.length();
	}
}
