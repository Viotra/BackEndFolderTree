package week05;

public class Card {
	private String name;
	private String suit;
	private int value;
	
//	public Card(String name, String suit, int value) {
//		this.name = name;
//		this.suit = suit;
//		this.value = value;
//	}
	
	public void describe() {
		System.out.println("Name: " + this.name + "\tSuit: " + suit + "\tValue: " + value);
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
}
