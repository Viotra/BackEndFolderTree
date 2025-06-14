package war;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> deck = new ArrayList<Card>(); //This is where all my card objects will be stored

	public Deck() {
		// TODO Auto-generated method stub
		int counter = 2; //counter starts at 2 to match the card values in the deck
		for (int i = 1; i <= 52; i++) {//This loop will run through all 52 of the cards and add them to the deck.
			StringBuilder cardName = new StringBuilder();
			Card card = new Card();
			
			switch (counter) {//I am using the switch here to assign names to the non-numbered cards
				case 11:
					cardName.append("Jack");
					break;
				case 12:
					cardName.append("Queen");
					break;
				case 13:
					cardName.append("King");
					break;
				case 14:
					cardName.append("Ace");//Aces are high
					break;
				default:
					cardName.append(counter);
					break;
			}
			
			switch (i % 4) {//I used this switch to increment counter only after we have a remainder of 0 so that I could assign the suit to each card one value at a time.
				case 1:
					card.setName(cardName.toString());
					card.setSuit("Hearts");
					card.setValue(counter);
					break;
				case 2:
					card.setName(cardName.toString());
					card.setSuit("Diamonds");
					card.setValue(counter);
					break;
				case 3:
					card.setName(cardName.toString());
					card.setSuit("Clubs");
					card.setValue(counter);
					break;
				case 0:
					card.setName(cardName.toString());
					card.setSuit("Spades");
					card.setValue(counter);
					counter++;
					break;
			}
			this.deck.add(card);
		}
	}
	public void display() {
		for (Card card : this.deck) {
			card.describe();
		}
	}
	public List<Card> getDeck() {
		return this.deck;
	}
	public void shuffle() {
		Collections.shuffle(this.deck);//I did find how to do this using Math.rand(), but this method was more simplistic than swapping cards at a random position
	}
	public Card draw() {
		return this.deck.remove(0);//using remove takes the card out of the deck, since it's in the return line, the removed card will also be returned
	}
	public void add(Card card) {
		this.deck.add(card);
	}
}
