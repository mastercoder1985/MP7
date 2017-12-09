package cards;
/** Class to represent the hand for the player and dealer.*/
public class Hand extends PlayingCardList {
	
	private String holder;

	/** Constructor to make a new hand.*/

	public Hand(String s) {
		this.holder = s;
	}
	
	public Hand(String s, PlayingCardList orig) {
		super(orig);
		this.holder = s;
	}
	
	/**
	 * Get the holder of the hand.
	 * @return holder's name
	 */
	public String getHolder() {
		return this.holder;
	}

	public String toString() {
		StringBuilder returnString = new StringBuilder(this.holder);
		returnString.append("'s hand: ");
		Node pointer = this.head;
		while(true) {
			returnString.append(pointer.card.toString());
			if(pointer.next == null) {
				break;
			}
			returnString.append(", ");
			pointer = pointer.next;
		}
		return returnString.toString();
	}
	
	/**
	 * Print a hand in a way that's helpful for blackjack.
	 */
	public void printBlackJackHand() {
		System.out.println(this.toString());
		System.out.println("Value: " + this.getHandValue());
	}

	/** 
	 * Gets the value of the hand.
	 * @return the value
	 */
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
