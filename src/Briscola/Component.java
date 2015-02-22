package Briscola;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Component extends JPanel{

	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	private JLabel picLabel;
	private BufferedImage image;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);   
		g.setColor(Color.lightGray); 
		g.fillRect((int)(screenSize.getWidth()*0.32),(int)(screenSize.getHeight()*0.04),
				(int)(screenSize.getWidth()*0.35),(int)(screenSize.getHeight()*0.25)); 
		g.setColor(Color.green);
		g.fillRect((int)(screenSize.getWidth()*0.33),(int)(screenSize.getHeight()*0.05),
				(int)(screenSize.getWidth()*0.335),(int)(screenSize.getHeight()*0.225));  
		g.setColor(Color.lightGray); 
		g.fillRect((int)(screenSize.getWidth()*0.32),(int)(screenSize.getHeight() - 
				(screenSize.getHeight()*0.08 + screenSize.getHeight()*0.25)), (int)(screenSize.getWidth()*0.35),
				(int)(screenSize.getHeight()*0.25)); 
		g.setColor(Color.green);
		g.fillRect((int)(screenSize.getWidth()*0.33),(int)(screenSize.getHeight() - 
				(screenSize.getHeight()*0.07 + screenSize.getHeight()*0.25)), (int)(screenSize.getWidth()*0.335),
				(int)(screenSize.getHeight()*0.225)); 

		
		try {
			image = ImageIO.read(new File("/res/Lk7Zjf0a.png"));
		} catch (IOException e) {
			System.out.println("OHHHHH");
		}
	    g.drawImage(image,(int)(screenSize.getHeight()/2),(int)(screenSize.getHeight()/2),null);      
	}
}

