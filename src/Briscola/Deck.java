package Briscola;

public class Deck {
	
	private Card[] deck = new Card[40];
	
	public Deck (){
		for(int i=0;i<deck.length;i++){
			
			if(i>29)
			{
				deck[i]= new Card(i-29,Suit.BASTONI);
			}
			else if(i>19){
				deck[i]= new Card(i-19,Suit.DENARI);
			}
			else if(i>9){
				deck[i]= new Card(i-9,Suit.SPADE);
			}
			else{
				deck[i]= new Card(i+1,Suit.COPPE);
			}
			
			int displayValue=deck[i].getDisplayValue();
			switch(displayValue){
			case 1: deck[i].setValue(11);
				break;
			case 3: deck[i].setValue(10);
				break;
			case 8: deck[i].setValue(2);
				break;
			case 9: deck[i].setValue(3);
				break;
			case 10: deck[i].setValue(4);
				break;
			default: deck[i].setValue(0);
			}
		}
	}
	
	public String toString(){
		String deckList="";
		
		for(int i=0;i<deck.length;i++)
			deckList+=deck[i]+" \n";
		
		return deckList;
	}
}
