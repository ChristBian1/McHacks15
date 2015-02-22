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
		
		
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MainFrame frame = new MainFrame("Briscola|McHacks 2015");
				frame.showGUI();
			}
		});
		Network client = new Network();
		client.connect();
		System.out.println("Connected");
		
		try {
			Player you = (Player) client.getOis().readObject();
			Player opponent = (Player) client.getOis().readObject();
			Deck deck = (Deck) client.getOis().readObject();
			Board game = (Board) client.getOis().readObject();
			
			while(deck.size() >= 2){
				game.playRound(you.playCard(0), opponent.playCard(0));//will need to be replaced by implementing the bottom
				/// TODO when user who is first to act, clicks on the card they want to play, it must be chosen accordingly and sent to the server, 
				//the server should then send the card chosen to the other client so that the person who is second to act can see the choice.
				//Once the player who is second to act makes his choice it should be sent back to the server again, and the server should send it back to the first client
				//perhaps some animations
				//and that concludes one interation of this while loop
				if (you.isFirst())
				{
					//TODO fetch the cards directly from the server instead of picking them up on the client
					you.addToHand(deck);
					opponent.addToHand(deck);
				}
				else if (opponent.isFirst())
				{
					//TODO fetch the cards directly from the server instead of picking them (from the deck), on the client
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
