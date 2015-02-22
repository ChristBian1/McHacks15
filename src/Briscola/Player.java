package Briscola;

import java.net.InetAddress;
import java.util.ArrayList;

public class Player {
    //InetAddress
    
    private ArrayList<Card> hand= new ArrayList<Card>();
    private ArrayList<Card> cardsWon = new ArrayList<Card>();
    
    public void setHand(Deck deck){
    	for(int i=0;i<3;i++)
    		hand.add(deck.draw());
    }
    
    public void addToHand(Deck deck){
    	hand.add(deck.draw());
    }
    
    public void addToCardsWon(ArrayList<Card> cardsWon){
    	for(int i=0;i<cardsWon.size();i++)
    	{
    		this.cardsWon.add(cardsWon.get(i));
    	}
    	
    }
    

}
