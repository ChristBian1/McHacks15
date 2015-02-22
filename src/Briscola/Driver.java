package Briscola;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Driver {

	public static void main(String []args){
		
	
		Deck deck=new Deck();
		
		System.out.println(deck);
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MainFrame frame = new MainFrame("Briscola|McHacks 2015");
				frame.showGUI();
			}
		});
	}
	

}
