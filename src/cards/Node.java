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
	 * Previous card in the list.
	 */
	protected PlayingCard prev;
	
	/**
	 * Create a new node with no next node.
	 * @param c card
	 */
	protected Node(PlayingCard c) {
		this.card = c;
	}
	
	/**
	 * Create a new node and set its next and previous node.
	 * @param c card
	 * @param next next card
	 */
	protected Node(PlayingCard c, PlayingCard n, PlayingCard p) {
		this.card = c;
		this.next = n;
		this.prev = p;
	}
	
}
