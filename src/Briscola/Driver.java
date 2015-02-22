package Briscola;

import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Driver {

	public static void main(String []args){
		
		
		
		
		/*
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
		*/
		
		
	
		/*SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MainFrame frame = new MainFrame("Briscola|McHacks 2015");
				frame.showGUI();
				frame.placeImage();
			}
		});*/
		Network client = new Network();
		client.connect();
		System.out.println("Connected");
		
		try {
			Player you = (Player) client.getOis().readObject();
			Player opponent = (Player) client.getOis().readObject();
			Deck deck = (Deck) client.getOis().readObject();
			Board game = (Board) client.getOis().readObject();
			
			while(deck.size() <= 0){
				game.playRound(you.playCard(0), opponent.playCard(0));///GUI TO CHOOSE CARD HERE
				if (you.isFirst())
				{
					you.addToHand(deck);
					opponent.addToHand(deck);
				}
				else if (opponent.isFirst())
				{
					opponent.addToHand(deck);
					you.addToHand(deck);
				}
				
				
			}
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
