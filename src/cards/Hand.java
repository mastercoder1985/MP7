package cards;
/** Class to represent the hand for the player and dealer.*/
public class Hand extends PlayingCardList {

	private int handValue;
	/** Constructor to make a new hand.*/
	public Hand() {

	}

	public String toString() {
		StringBuilder returnString = new StringBuilder();
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

	// gets the value of the Hand. will figure out later.
	public int getHandValue() {
		return 0;
	}

}
