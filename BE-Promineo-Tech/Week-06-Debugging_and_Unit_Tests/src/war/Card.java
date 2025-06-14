package war;

public class Card {
	private String name;
	private String suit;
	private int value;

//	  i.     Fields
//
//      1.     value (contains a value from 2-14 representing cards 2-Ace)
//
//      2.     name (e.g. Ace of Diamonds, or Two of Hearts)
//
//ii.    Methods
//
//1.     Getters and Setters
//
//2.     describe (prints out information about a card)

	public void describe() {
		System.out.println(this.name + " of " + this.suit);
	}
	
	public void getName() {
		System.out.println(this.name);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void getSuit() {
		System.out.println(this.suit);
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public int getValue() {
		return this.value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getCard() {
		return name + " of " + suit;
	}
}
