package Briscola;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Driver {

	public static void main(String []args){
		
		System.out.println("Robby knows nothing at all, really.");
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				showGUI();
			}
		});
	}
	
	public static void showGUI(){
		JFrame frame = new JFrame("Briscola|McHacks 2015");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		frame.setVisible(true);		
	}
}
