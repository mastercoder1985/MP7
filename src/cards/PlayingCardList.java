package cards;

/**
 * A class that represents a doubly linked list of playing cards.
 * @author andrewburke
 *
 */
public class PlayingCardList {
	
	/**
	 * First card in the list.
	 */
	protected Node head;
	
	/**
	 * Length of the list.
	 */
	protected int length;
	
	/**
	 * Default constructor.
	 */
	public PlayingCardList() {
		
	}
	
	/**
	 * Copy constructor.
	 * @param orig original list to copy from
	 */
	public PlayingCardList(PlayingCardList orig) {
		while(orig.length > 0) {
			this.add(orig.remove(0));
		}
	}
	
	/**
	 * Get this list's length.
	 * @return length
	 */
	public int length() {
		return this.length;
	}
	
	/**
	 * Add a card to the end of a list.
	 * @param c
	 */
	public void add(PlayingCard c) {
		if(this.head == null) {
			this.head = new Node(c);
		} else {
			this.head.add(c);
		}
		this.length++;
	}
	
	/**
	 * Remove a card from a list.
	 * @param index index of card to remove
	 * @return removed card
	 */
	public PlayingCard remove(int index) {
		this.length--;
		return nodeAt(index).remove();
	}
	
	/**
	 * Get a node at an index in a card list.
	 * @throws IndexOutOfBoundsException if the index is too large or small
	 * @param index index of card
	 * @return reference to card
	 */
	public Node nodeAt(int index) {
		if(index < 0) {
			throw new IndexOutOfBoundsException();
		}
		Node pointer = this.head;
		for(int i = index; i > 0; i--) {
			if(pointer == null) {
				throw new IndexOutOfBoundsException();
			}
			pointer = pointer.next;
		}
		return pointer;
	}
	
	/**
	 * Find a card in a list.
	 * @param c card to search for
	 * @return reference to card, or null if the list doesn't contain it
	 */
	public PlayingCard find(PlayingCard c) {
		return null;
	}
	
	/**
	 * Swap cards between two indices of a list.
	 * @param a first index
	 * @param b second index
	 */
	public void swap(int a, int b) {
		Node nodeA = this.nodeAt(a);
		Node nodeB = this.nodeAt(b);
		
		PlayingCard tempCard = nodeA.card;
		nodeA.card = nodeB.card;
		nodeB.card = tempCard;
		
	}
	
	/**
	 * Sort a list of playing cards
	 */
	public void sort() {
		
	}

}
