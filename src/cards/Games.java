package cards;

import java.util.Scanner;

/** class with the card games.*/
public class Games {
	/**  method where the user would choose what game to play.
	 * @returns is the player has won or lost the game. */
	public String chooseGame() {
		Scanner user = new Scanner(System.in);
		System.out.print("Please press a number to choose a game to play. \n 1) Blackjack. \n 2) War.");
		int response = user.nextInt(); 
		if (response != 1 || response != 2) {
			System.out.println("Please choose one of the numbers available");
		} else if (response == 1) {
			playBlackjack();
		} else if (response == 2) {
			playWar();
		}
		return "";
	}
	/** method used to play blackjack.
	 * 
	 * @returns a statement that says if the user has lost or won.
	 */
	public String playBlackjack() {
		return "";
	}
	/** method used to play the game war.
	 * 
	 * @returns a string saying if the user has lost or won.
	 */
	public String playWar() {
		return "";
	}
}
