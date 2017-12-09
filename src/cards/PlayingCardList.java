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
		this.addAll(orig);
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
	 * Add several cards from another list.
	 * @param l other list.
	 */
	public void addAll(PlayingCardList l) {
		Node pointer = l.head;
		while(pointer != null) {
			this.add(pointer.card);
			pointer = pointer.next;
		}
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
	
	public String toString() {
		StringBuilder result = new StringBuilder();
		Node pointer = this.head;
		while(true) {
			result.append(pointer.card.toString());
			if(pointer.next == null) {
				break;
			}
			result.append(", ");
			pointer = pointer.next;
		}
		return result.toString();
	}

}
