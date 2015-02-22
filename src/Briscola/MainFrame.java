package Briscola;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	
	private Component com;
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	
	public MainFrame(String title){
		super(title);
		
		com = new Component();
		this.add(com, BorderLayout.CENTER);
		com.setBackground(Color.green);
	}
	
	public void showGUI(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
		this.setSize(screenSize);
	}
}
