package Briscola;

public class Board {

	private Suit briskSuit;
	private Deck deck;
	private Card lastCard;
	
	public Board(Deck deck){
		this.deck=deck;
		lastCard=deck.setBrisk();
		briskSuit=lastCard.getType();
	}
}
