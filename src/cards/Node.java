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
	protected Node next;
	
	/**
	 * Previous card in the list.
	 */
	protected Node prev;
	
	/**
	 * Default constructor.
	 */
	protected Node() {
		
	}
	
	/**
	 * Create a new node with no next node.
	 * @param c card
	 */
	protected Node(PlayingCard c) {
		this.card = c;
	}
	
	/**
	 * Add a card recursively to the end of the list.
	 * @param c card
	 */
	protected void add(PlayingCard c) {
		if(this.next == null) {
			this.next = new Node(c);
			this.next.prev = this;
		}
	}
	
	/**
	 * Remove this card from its list.
	 * @return card removed
	 */
	protected PlayingCard remove() {
		if(this.prev != null) this.prev.next = this.next;
		if(this.next != null) this.next.prev = this.prev;
		return this.card;
	}
	
}
