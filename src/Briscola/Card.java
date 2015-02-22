package Briscola;


public class Card {
	
	private int value,displayValue;
	private Suit type;
	
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
}

