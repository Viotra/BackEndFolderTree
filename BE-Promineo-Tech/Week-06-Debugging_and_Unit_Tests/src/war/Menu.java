package war;

import java.util.Scanner;
//import java.io.IOException;

public class Menu {
	Scanner sc = new Scanner(System.in);
	private int gamesWon = 0;
	String userInput = "";
	
	public void displayMenu() {
		while(!userInput.equals("3")) {
			System.out.println("Welcome to WAR! \n\nPlease select from the folowing:"
					+"\n1: New Game \n2: Show Score \n3: Quit");
			userInput = sc.nextLine();
//			int playerScore = 0;
//			int aiScore = 0;
			
			if (userInput.equals("1")) {
		//		CLS();
				Deck deck = new Deck();
				deck.shuffle();
				Player player = new Player();
				Player ai = new Player();
				int roundCounter = 1;
				
				
				for (int i = 1; i <= 52; i++) {
					if (i % 2 == 0) {
						ai.draw(deck);
					}
					else {
						player.draw(deck);
					}
				}
				while(!ai.getHand().isEmpty()) {
					System.out.println("Round: " + roundCounter);
					System.out.println("Press Enter to draw a card: ");
					sc.nextLine();
					
					Card playerCard = player.flip();
					Card aiCard = ai.flip();
					String highCard = "";
					
					if (playerCard.getValue() > aiCard.getValue()) {
						highCard = "Player";
						player.incrementScore();
					}
					else if(playerCard.getValue() == aiCard.getValue()){
						System.out.println("Draw!");
					}
					else {
						highCard = "The AI";
						ai.incrementScore();
					}
					
					System.out.println("The player drew: " + playerCard.getCard());
					System.out.println("The AI drew: " + aiCard.getCard());
					System.out.println(highCard + " wins the round!");
					System.out.println("Player: " + player.getScore() + " \tAI: " + ai.getScore());
					
					roundCounter++;
				}
				
				
				System.out.println("Final Score: \n Player: " + player.getScore() + "\tAI: " + ai.getScore());
				if (player.getScore() > ai.getScore()) {
					gamesWon++;
					System.out.println("Player won the match.");
				}
				else if(player.getScore() < ai.getScore()){
					System.out.println("AI won the match.");
				}
				else {
					System.out.println("No one wins the war.");
				}
			}
			
			if (userInput.equals("2")) {
		//		CLS();
//				clearScreen();
				System.out.println(gamesWon);
				sc.nextLine();
			}
		}
	//	CLS();
	}
	
//	public void CLS(){
//		System.out.println("\u001b[2J" + "\u001b[H");
//		System.out.flush();
//	}
	//public class CLS {
//	    public void CLS() throws IOException, InterruptedException {
//	        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
//	    }
	
//	
//	public static void clearScreen(){
//		System.out.print("\033[H\033[2J");
//		System.out.flush();
//	}

}
