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
		Node returnNode;
		if(index == 0) {
			returnNode = this.head;
			this.head = returnNode.next;
		} else {
			Node pointer = this.head;
			while(index > 1) {
				pointer = pointer.next;
				index--;
			}
			returnNode = pointer.next;
			pointer.next = returnNode.next;
		}
		this.length--;
		return returnNode.card;
	}
	
	/**
	 * Get a node at an index in a card list.
	 * @throws IndexOutOfBoundsException if the index is too large or small
	 * @param index index of card
	 * @return reference to card
	 */
	public Node nodeAt(int index) {
		Node pointer = this.head;
		while(index > 0) {
			pointer = pointer.next;
			index--;
		}
		return pointer;
	}
	
	/**
	 * Find a card in a list.
	 * @param c card to search for
	 * @return index of card, or -1 if not found
	 */
	public int find(PlayingCard c) {
		Node pointer = this.head;
		int index = 0;
		while(pointer != null) {
			if(pointer.card.equals(c)) {
				return index;
			}
			pointer = pointer.next;
			index++;
		}
		return -1;
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

}
