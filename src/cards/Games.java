package cards;

import java.util.Scanner;

/** class with the card games.*/
public class Games {

	
	public Deck gameDeck;
	public Hand userHand;
	public Hand comHand; //hand for the computer.
	/** method used to play blackjack.
	 * 
	 * @returns a statement that says if the user has lost or won.
	 */
	public String blackjack() {
		boolean hitOrHold = true;
		boolean simCom = true;
		Scanner user = new Scanner(System.in);
		System.out.println("The game is about to begin");
		//Game start. Some things that will be called haven't been made or finished yet. 
		gameDeck.shuffle();			
		userHand.add(gameDeck.draw());
		userHand.add(gameDeck.draw());
		comHand.add(gameDeck.draw());
		comHand.add(gameDeck.draw());
		if (userHand.getHandValue() == 21) {
			return "Your hand is 21 you have won the game.";
		} else if (comHand.getHandValue() == 21) {
			return "The computer's hand is 21 you have lost the game";
		} else { //start of the hit or hold process.
			System.out.println("your hand is: " + userHand.getHandValue() +" would you like to hit or hold");
			while (hitOrHold) {
				String otherResponse = user.next();
				if (otherResponse.toLowerCase() == "hit") { //if user responds with hit
					userHand.add(gameDeck.draw());
					if (userHand.getHandValue() > 21) {
						return "sorry you lost. You busted and went over 21.";

					} else {
						System.out.println("Your new hand is: " + userHand.getHandValue());
					}
				} else if(otherResponse.toLowerCase() == "hold") {
					System.out.println("You choose to hold");
					break;
				} else {
					System.out.println("Please choose to hold or hit");
				}
			} // end of hit/hold process
		}
		while (simCom) { //start of the computer's hand
			if (comHand.getHandValue() >= 15) {
				break;
			}
			if (comHand.getHandValue() < 15) {
				comHand.add(gameDeck.draw());
			} else if (comHand.getHandValue() > 21) {
				return "The computer busted and went over 21. You win!";
			} // hand of the com Hand.
		}
		//Start of the comparison. And states winner of the game
		System.out.println("The winner is...");
		if (userHand.getHandValue() > comHand.getHandValue()) {
			return "YOU. Your card value was: " + userHand.getHandValue() + "\n While the computer's hand was: " + comHand.getHandValue();
		} else if (userHand.getHandValue() < comHand.getHandValue()) {
			return "The computer. Your card value was: " + userHand.getHandValue() + "\n While the computer's hand was: " + comHand.getHandValue(); 
		} else {
			return "NOBODY. You and the computer tied with a value of: " + userHand.getHandValue();
		}
	
		
		
		 // will fix later.
	}
}
