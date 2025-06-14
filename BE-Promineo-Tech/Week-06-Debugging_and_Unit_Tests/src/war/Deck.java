package war;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> deck = new ArrayList<Card>();

	public Deck() {
		// TODO Auto-generated method stub
		int counter = 2;
		for (int i = 1; i <= 52; i++) {
			StringBuilder cardName = new StringBuilder();
			Card card = new Card();
			
			switch (counter) {
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
					cardName.append("Ace");
					break;
				default:
					cardName.append(counter);
					break;
			}
			
			switch (i % 4) {
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
		Collections.shuffle(this.deck);
	}
	public Card draw() {
		return this.deck.remove(0);
	}
	public void add(Card card) {
		this.deck.add(card);
	}
}
