package week05;

public class Week05Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card card = new Card();
		
		//card.describe();
		
		Deck myDeck = new Deck();
		myDeck.shuffle();
		myDeck.describe();
		myDeck.draw();
		myDeck.draw();
		
		// 5. Create Game Board:
				//		Create and test a method that takes an int as a parameter (representing the
				// 			number of players for a game) and returns a Map<String, List<Card>>
				// 			that represents each player (i.e. "Player 1", "Player 2", etc..) 
				//			and their cards.
				//
				// 			The method should create a new instance of Deck, shuffle it,
				// 			and deal the cards out to the "players" in the Map.
	}
//	public static Map<String, List<Card>> gameBoard(int players){
//		Deck deck = new Deck();
//		deck.shuffle();
//		
//		String test = "This is a Test.";
//	}

}
