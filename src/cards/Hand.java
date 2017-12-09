package cards;
/** Class to represent the hand for the player and dealer.*/
public class Hand extends PlayingCardList {
	
	/** Constructor to make a new hand.*/ 
	public Hand() {
		
	}
	/** adds a card to the hand.*/
	
	// gets the value of the Hand. will figure out later.
	public int getHandValue() {
		int handValue = 0;
		int aces = 0;
		Node pointer = this.head;
		
		while(pointer != null) {
			if(pointer.card.rank().equals(Rank.ACE)) {
				aces++;
			} else if(pointer.card.isFaceCard()) {
				handValue += 10;
			} else {
				handValue += pointer.card.getValue();
			}
			pointer = pointer.next;
		}
		
		handValue += aces * 11;
		while(aces > 0 && handValue > 21) {
			handValue -= 10;
			aces--;
		}
		
		return handValue;	
	}
	
}
