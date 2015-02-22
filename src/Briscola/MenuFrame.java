package Briscola;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class MenuFrame extends Frame {
	
	public MenuFrame(String s){
		super(s);
	}
	public void paint(Graphics g){
		g.setColor(Color.GRAY);
		Font font = new Font("Serif", Font.PLAIN, 24);;
		g.setFont(font);
		if(this.getTitle().equals("Briscola"))
		{
		g.drawString("BRISCOLAAA",510,75);
		g.drawString("DECK",515,225);
		g.drawString("BRISK", 605, 225);
		g.drawString("Player 1", 160, 640);
		g.drawString("Player 2", 860, 640);
		 Rectangle2D shape = new Rectangle2D.Float();
		 //Deck
	      shape.setFrame(500, 150, 100,150);
	      Graphics2D g2 = (Graphics2D) g; 
	      g2.draw (shape);
	      //Brisk
	      shape.setFrame(550, 175, 150, 100);
	      g2.draw (shape);
	      //Player1
	      shape.setFrame(50, 400, 100, 150);
	      g2.draw (shape);
	      shape.setFrame(155, 400, 100, 150);
	      g2.draw (shape);
	      shape.setFrame(260, 400, 100, 150);
	      g2.draw (shape);
	      //Pile
	      shape.setFrame(125, 580, 150, 100);
	      g2.draw (shape);
	      
	      //Player2
	      shape.setFrame(750, 400, 100, 150);
	      g2.draw (shape);
	      shape.setFrame(855, 400, 100, 150);
	      g2.draw (shape);
	      shape.setFrame(960, 400, 100, 150);
	      g2.draw (shape);
	    //Pile
	      shape.setFrame(825, 580, 150, 100);
	      g2.draw (shape);
		}
	}

}
