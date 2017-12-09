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
	public String blackjack(Scanner user) {

			System.out.println("The game is about to begin");
			//Game start. Some things that will be called haven't been made or finished yet.
			
			gameDeck = new Deck();
			userHand = new Hand("Player");
			
			gameDeck.shuffle();
			userHand.add(gameDeck.draw());
			userHand.add(gameDeck.draw());
			userHand.printBlackJackHand();
			
			if (userHand.getHandValue() == 21) {
				return "Blackjack! You win!";
				
			} else { //start of the hit or hold process.
				System.out.println("Would you like to hit or hold?");
				while (true) {
					String otherResponse = user.next();
					if (otherResponse.toLowerCase().equals("hit")) { //if user responds with hit
						userHand.add(gameDeck.draw());
						userHand.printBlackJackHand();
						if (userHand.getHandValue() > 21) {
							return "Busted! You lost.";
						}
					} else if(otherResponse.toLowerCase().equals("hold")) {
						System.out.println("You choose to hold.");
						break;
					} else {
						System.out.println("Please choose to hold or hit");
					}
				} // end of hit/hold process
				//Dealer's turn
				
				comHand = new Hand("Dealer");
				comHand.add(gameDeck.draw());
				comHand.add(gameDeck.draw());
				comHand.printBlackJackHand();
				if(comHand.getHandValue() == 21) {
					return "The dealer got blackjack! You lost.";
				}
				
				while (true) {
					if(comHand.getHandValue() >= 16) {
						break;
					}
					comHand.add(gameDeck.draw());
					comHand.printBlackJackHand();
				}
				if(comHand.getHandValue() > 21) {
					return"The dealer busted! You win.";
				}
			}
			//Start of the comparison. And states winner of the game
			if (userHand.getHandValue() > comHand.getHandValue()) {
				return "You won!";
			} else if (userHand.getHandValue() < comHand.getHandValue()) {
				return "You lost.";
			} else {
				return "Tie.";
			}

	}

}