package week05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cards = new ArrayList<Card>();
	//private String[] suits = {"Spade", "Heart", "Diamond", "Club"};
	
	public Deck(){
		int counter = 2;
		for(int i = 1; i <= 52; i++) {
			
			Card card = new Card();
			String cardName;
			
			if (counter == 12) {
				cardName = "Jack";
			}
			else if (counter == 13) {
				cardName = "Queen";
			}
			else if (counter == 14) {
				cardName = "King";
			}
			else if (counter == 15) {
				cardName = "Ace";
			}
			else {
				cardName = Integer.toString(counter);
			}
			
			card.setName(cardName);
			
			if(i % 4 == 1) {
				//card.setName(Integer.toString(counter));
				card.setSuit("Spade");
				card.setValue(counter);
				cards.add(card);
			}
			if(i % 4 == 2) {
				//card.setName(Integer.toString(counter));
				card.setSuit("Heart");
				card.setValue(counter);
				cards.add(card);
			}
			if(i % 4 == 3) {
				//card.setName(Integer.toString(counter));
				card.setSuit("Diamond");
				card.setValue(counter);
				cards.add(card);
			}
			if(i % 4 == 0) {
				//card.setName(Integer.toString(counter));
				card.setSuit("Club");
				card.setValue(counter);
				counter++;
				cards.add(card);
			}
		}
		
	}
	
	public void describe() {
		for (Card card : cards) {
			card.describe();
		}
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	public void draw() {
		cards.get(0).describe();
		cards.remove(0);
	}
}
