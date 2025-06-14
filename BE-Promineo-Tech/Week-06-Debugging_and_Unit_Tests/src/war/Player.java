package war;

import java.util.ArrayList;
import java.util.List;

public class Player{
	//Fields

//    1.     hand (List of Card)
//
//     2.     score (set to 0 in the constructor)
//
//     3.     name
//
//ii.    Methods
//
//    1.     describe (prints out information about the player and calls the describe method for each card in the Hand List)
//
//    2.     flip (removes and returns the top card of the Hand)
//
//    3.     draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
//
//   4.     incrementScore (adds 1 to the Player’s score field)
	
	Player(){
		
	}
	private List <Card> hand = new ArrayList<Card>();
	private int score = 0;	
	private String name;
	//The following are mostly getters and setters, with the exception of draw, which uses the draw method of the deck to add to player hand
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return this.score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void draw(Deck deck) {
		this.hand.add(deck.draw());
	}
	public List<Card> getHand() {//This method was only used in debugging to verify each player had different hands.
		return this.hand;
	}
	public void incrementScore() {
		this.score++;
	}
	public Card flip() {
		return this.hand.remove(0);
	}
//	public void desibeHand() {
//		for (Card card : hand) {
//			card.display();;
//		}
//	}
//	public void addCard(Card card) {
//		this.hand.add(card);
//	}
//	public List<Card> getHand(){
//		return this.hand;
//	}
}
