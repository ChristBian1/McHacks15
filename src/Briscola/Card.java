package Briscola;


public class Card {
	
	private int value,displayValue;
	private Suit type;
	private Player owner;
	
	/**
	 * @return the owner
	 */
	public Player getOwner() {
		return owner;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(Player owner) {
		this.owner = owner;
	}

	public Card(int displayValue, Suit type){
		this.type=type;
		this.displayValue=displayValue;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * @return the type
	 */
	public Suit getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(Suit type) {
		this.type = type;
	}

	/**
	 * @return the displayValue
	 */
	public int getDisplayValue() {
		return displayValue;
	}

	/**
	 * @param displayValue the displayValue to set
	 */
	public void setDisplayValue(int displayValue) {
		this.displayValue = displayValue;
	}
	
	public String toString(){
		return displayValue+ " of "+type;
	}
	
	public boolean beats(Card card,Suit brisk)
	{
		if(this.type.equals(brisk))
		{
			if(card.getType().equals(brisk))
			{
				if(this.value>card.getValue())
					return true;
				else if(this.value==card.getValue())
					return this.displayValue> card.getDisplayValue();
				else
					return false;
			}
			
			else
				
				return true;
				
		}
		else if(card.getType().equals(brisk))
			return false;
		else if(this.type.equals(card.getType()))
		{

			if(this.value>card.getValue())
				return true;
			else if(this.value==card.getValue())
				return this.displayValue> card.getDisplayValue();
			else
				return false;
		}
		else 
			return true;
		
	}
}

