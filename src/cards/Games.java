package cards;

import java.util.Scanner;

/** class with the card games.*/
public class Games {

	private Deck gameDeck;
	private Hand userHand;
	private Hand comHand; //hand for the computer.
	/** method used to play blackjack.
	 * 
	 * @returns a statement that says if the user has lost or won.
	 */
	public String blackjack() {
		boolean hitOrHold = true;
		Scanner user = new Scanner(System.in);
		String response = user.next();
		System.out.println("Would you like to play blackjack yes or no");
		if (response.toLowerCase() == "yes") {
			System.out.println("The game is about to begin");
			//Game start. Some things that will be called haven't been made or finished yet. 
			gameDeck.shuffle();			
			userHand.addCard(gameDeck.draw());
			userHand.addCard(gameDeck.draw());
			comHand.addCard(gameDeck.draw());
			comHand.addCard(gameDeck.draw());
			if (userHand.getHandValue() == 21) {
				return "Your hand is 21 you have won the game.";
			} else if (comHand.getHandValue() == 21) {
				return "The computer's hand is 21 you have lost the game";
			} else { //start of the hit or hold process.
				System.out.println("your hand is: " + userHand.getHandValue() +" would you like to hit or hold");
				while (hitOrHold) {
					String otherResponse = user.next();
					if (otherResponse.toLowerCase() == "hit") { //if user responds with hit
						userHand.addCard(gameDeck.draw());
						if (userHand.getHandValue() > 21) {
							return "sorry you lost. You busted and went over 21."; 
						} else {
							System.out.println("Your new hand is: " + userHand.getHandValue());
						}
					} else if(otherResponse.toLowerCase() == "hold") {
						System.out.println("You choose to hold");
						break;
					}
				}
				
				
			}			
		} else if (response.toLowerCase() == "no") {
			return "I guess you don't want to play then."; 
		} else {
			return "Please type yes or no";
		}
		return "";// will fix later.
	}
	
}
