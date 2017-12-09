package cards;

import java.util.Scanner;

public class PlayBlackJack {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean wantToPlay = true;
		while(wantToPlay) {
			Games black = new Games();			
			String str = black.blackjack(s);
			System.out.println(str);
			System.out.println("Would you like to play again? (yes or no)");
			String again = s.next();
			if (again.equals("no")) {
				wantToPlay = false;
			}
		
		}
		s.close();
	}

}
