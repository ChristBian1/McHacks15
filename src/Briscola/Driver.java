package Briscola;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Driver {

	public static void main(String []args){
		
		Player one= new Player();
		Player two= new Player();
		Deck deck=new Deck();
		deck.shuffle();
		Board game= new Board(deck);
		one.setHand(deck);
		two.setHand(deck);
		one.setFirst(true);
		
		while(deck.size()>2)
		{
			System.out.println(one.getHand());
			System.out.println(two.getHand());

			game.playRound(one.playCard(0), two.playCard(0));
			if (one.isFirst())
			{
				one.addToHand(deck);
				two.addToHand(deck);
			}
			else
			{
				two.addToHand(deck);
				one.addToHand(deck);
			}
		}
		
		System.out.println(one.getHand());
		System.out.println(two.getHand());
		game.playRound(one.playCard(0), two.playCard(0));
		System.out.println(one.getHand());
		System.out.println(two.getHand());
		game.playRound(one.playCard(0), two.playCard(0));
		System.out.println(one.getHand());
		System.out.println(two.getHand());
		game.playRound(one.playCard(0), two.playCard(0));
		
		
		
		/*
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MainFrame frame = new MainFrame("Briscola|McHacks 2015");
				frame.showGUI();
			}
		});*/
		Network client = new Network();
		client.connect();
		System.out.println("Connected");
		
		
	}
	
	
}
