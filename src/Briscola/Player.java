package Briscola;

import java.net.InetAddress;
import java.util.ArrayList;

public class Player {
    //InetAddress
    
    private ArrayList<Card> hand= new ArrayList<Card>();
    private ArrayList<Card> cardsWon = new ArrayList<Card>();
    private boolean first=false;
    /**
	 * @return the first
	 */
	public boolean isFirst() {
		return first;
	}

	/**
	 * @param first the first to set
	 */
	public void setFirst(boolean first) {
		this.first = first;
	}

	private int points=0;
    private String name;
    
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
    	updatePoints();
    	
    }
    
    private void updatePoints(){
    	points=0;
    	for(int i=0;i<cardsWon.size();i++){
    		points+=cardsWon.get(i).getValue();
    	}
    }
    
    public Card playCard(int index){
    	Card temp=hand.get(index);
    	temp.setOwner(this);
    	hand.remove(index);
    	return temp;
    }

	/**
	 * @return the hand
	 */
	public ArrayList<Card> getHand() {
		return hand;
	}

	/**
	 * @return the cardsWon
	 */
	public ArrayList<Card> getCardsWon() {
		return cardsWon;
	}

	/**
	 * @param cardsWon the cardsWon to set
	 */
	public void setCardsWon(ArrayList<Card> cardsWon) {
		this.cardsWon = cardsWon;
	}

	/**
	 * @return the points
	 */
	public int getPoints() {
		return points;
	}

	/**
	 * @param points the points to set
	 */
	public void setPoints(int points) {
		this.points = points;
	}

}
