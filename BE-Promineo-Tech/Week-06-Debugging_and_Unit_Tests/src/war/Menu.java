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
			
			if (userInput.equals("1")) {
		//		CLS(); This method would not work, but I wanted to clear the screen between rounds
				Deck deck = new Deck();
				deck.shuffle();
				Player player = new Player();
				Player ai = new Player();
				int roundCounter = 1;
				
				System.out.println("Please enter your name: ");
				player.setName(sc.nextLine());
				//using the Shuffled deck to add cards to each player's hand
				for (int i = 1; i <= 52; i++) {
					if (i % 2 == 0) {
						ai.draw(deck);
					}
					else {
						player.draw(deck);
					}
				}
				while(!ai.getHand().isEmpty()) {//Loop will keep going as long as there are cards in the hand of the AI
					System.out.println("Round: " + roundCounter);
					System.out.println("Press Enter to draw a card: ");
					sc.nextLine();
					//Basic round setup where each player will show their top card and it will be determined which has a higher value
					Card playerCard = player.flip();
					Card aiCard = ai.flip();
					String highCard = "";
					//Score being incremented based on if the player won, ai won, or no points in the event of a draw
					if (playerCard.getValue() > aiCard.getValue()) {
						highCard = player.getName();
						player.incrementScore();
					}
					else if(playerCard.getValue() == aiCard.getValue()){
						System.out.println("Draw!");
					}
					else {
						highCard = "The AI";
						ai.incrementScore();
					}
					//Displaying results of the round
					System.out.println(player.getName() + " drew: " + playerCard.getCard());
					System.out.println("The AI drew: " + aiCard.getCard());
					System.out.println(highCard + " wins the round!");
					System.out.println(player.getName() + ": " + player.getScore() + " \tAI: " + ai.getScore());
					//Adding to round counter to keep player informed on which round is currently being played
					roundCounter++;
				}
				
				//This block will show the outcome of the match rather than a round
				System.out.println("Final Score: \n" + player.getName() + ": " + player.getScore() + "\tAI: " + ai.getScore());
				if (player.getScore() > ai.getScore()) {
					gamesWon++;
					System.out.println(player.getName() + " won the match.");
				}
				else if(player.getScore() < ai.getScore()){
					System.out.println("AI won the match.");
				}
				else {
					System.out.println("No one wins the war.");
				}
			}
			//this option will allow the player to see the number of games they have won while the application has been running.
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
