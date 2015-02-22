package Briscola;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class Component extends JPanel{

	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	
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

	}
}

