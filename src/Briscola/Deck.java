package Briscola;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	private final int DECK_SIZE=40;
	private ArrayList<Card> deck = new ArrayList<Card>();
	
	public Deck (){
		for(int i=0;i<DECK_SIZE;i++){
			
			if(i>29)
			{
				deck.add(new Card(i-29,Suit.BASTONI));
			}
			else if(i>19){
				deck.add(new Card(i-19,Suit.DENARI));
			}
			else if(i>9){
				deck.add(new Card(i-9,Suit.SPADE));
			}
			else{
				deck.add( new Card(i+1,Suit.COPPE));
			}
			
			int displayValue=deck.get(i).getDisplayValue();

			switch(displayValue){
			case 1: deck.get(i).setValue(11);
				break;
			case 3: deck.get(i).setValue(10);
				break;
			case 8: deck.get(i).setValue(2);
				break;
			case 9: deck.get(i).setValue(3);
				break;
			case 10: deck.get(i).setValue(4);
				break;
			default: deck.get(i).setValue(0);
			}
		}
	}
	
	public String toString(){
		String deckList="";
		
		for(int i=0;i<deck.size();i++)
			deckList+=deck.get(i)+" \n";
		
		return deckList;
	}
	
	
	public void shuffle(){
		Collections.shuffle(deck);
	}
	
	public Card draw(){
		Card last=deck.get(deck.size()-1);
		deck.remove(last);
		
		return last;
	}
	
	public Card setBrisk(){
		Card first=deck.get(0);
		deck.remove(0);
		
		return first;
	}
}
