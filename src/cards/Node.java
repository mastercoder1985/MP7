package cards;

/**
 * Node class, to be used in PlayingCardList.
 * @author andrewburke
 *
 */
public class Node {

	/**
	 * Card stored in this node.
	 */
	protected PlayingCard card;
	
	/**
	 * Next card in the list.
	 */
	protected PlayingCard next;
	
	/**
	 * Create a new node with no next node.
	 * @param c card
	 */
	protected Node(PlayingCard c) {
		this.card = c;
	}
	
	/**
	 * Create a new node and set its next node.
	 * @param c card
	 * @param next next card
	 */
	protected Node(PlayingCard c, PlayingCard next) {
		this.card = c;
		this.next = next;
	}
	
}
