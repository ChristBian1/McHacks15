package Briscola;

import java.util.ArrayList;

public class Board {

	private Suit briskSuit;
	private Deck deck;
	private Card lastCard;
	private ArrayList<Card> cardsOnBoard= new ArrayList<Card>();
	
	public Board(Deck deck){
		this.deck=deck;
		lastCard=deck.setBrisk();
		briskSuit=lastCard.getType();
		System.out.println("Brisk:"+briskSuit);
	}
	
	public void playRound(Card one, Card two)
	{
		cardsOnBoard.add(one);
		cardsOnBoard.add(two);
		
		if((one.getOwner().isFirst())?one.beats(two,briskSuit):!two.beats(one,briskSuit))
		{
			System.out.println("one wins");
			clearBoard(one.getOwner());
			one.getOwner().setFirst(true);
			two.getOwner().setFirst(false);
		}
		else 
		{
			System.out.println("two wins");
			clearBoard(two.getOwner());
			two.getOwner().setFirst(true);
			one.getOwner().setFirst(false);
		}
	}
	
	
	private void clearBoard(Player winner){
		winner.addToCardsWon(cardsOnBoard);
		cardsOnBoard=new ArrayList<Card>();
	}
	
	
}
