package cards;

import java.util.Scanner;

/** class with the card games.*/
public class Games {

	Deck gameDeck;
	Hand userHand;
	Hand comHand; //hand for the computer.
	/** method used to play blackjack.
	 * 
	 * @returns a statement that says if the user has lost or won.
	 */
	public void blackjack() {
		Scanner user = new Scanner(System.in);
		String response = user.next();
		System.out.println("Would you like to play blackjack yes or no");
		if (response.toLowerCase() == "yes") {
			System.out.println("The game is about to begin");
			gameDeck.shuffle();			
			userHand.addCard(gameDeck.draw());
			userHand.addCard(gameDeck.draw());
			comHand.addCard(gameDeck.draw());
			comHand.addCard(gameDeck.draw());
			
			
			
		} else if (response.toLowerCase() == "no") {
			System.out.println("I guess you don't want to play then."); 
		} else {
			System.out.println("Please type yes or no");
		}
	}
	
}
