package cards;

import java.util.Scanner;

/** class with the card games.*/
public class Games {


	public Deck gameDeck;
	public Hand userHand;
	public Hand comHand;
	/** method used to play blackjack.
	 *
	 * @returns a statement that says if the user has lost or won.
	 */
	public String blackjack(Scanner user) throws InterruptedException {

			System.out.println("The game is about to begin");
			//Game start.
			
			gameDeck = new Deck();
			userHand = new Hand("Player");
			
			gameDeck.shuffle();
			userHand.add(gameDeck.draw());
			userHand.add(gameDeck.draw());
			userHand.printBlackJackHand();
			
			if (userHand.getHandValue() == 21) {
				return "Blackjack! You win!";
				
			} else { //start of the hit or hold process.				
				while (true) {
					System.out.println("Would you like to hit or hold?");
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
				System.out.println("Dealer's turn.");
				Thread.sleep(1000);
				comHand = new Hand("Dealer");
				comHand.add(gameDeck.draw());
				comHand.add(gameDeck.draw());
				comHand.printBlackJackHand();
				if(comHand.getHandValue() == 21) {
					return "The dealer got blackjack! You lost.";
				}
				
				while (true) {
					Thread.sleep(1000);

					if(comHand.getHandValue() > 21) {
						return"The dealer busted! You win.";
					}

					if(comHand.getHandValue() >= 16) {
						System.out.println("The dealer holds.");
						break;
					}
					System.out.println("The dealer hits.");
					comHand.add(gameDeck.draw());
					comHand.printBlackJackHand();
				}
				
			}
			//If neither player busted, find winner
			if (userHand.getHandValue() > comHand.getHandValue()) {
				return "You won!";
			} else if (userHand.getHandValue() < comHand.getHandValue()) {
				return "You lost.";
			} else {
				return "Tie.";
			}

	}

}