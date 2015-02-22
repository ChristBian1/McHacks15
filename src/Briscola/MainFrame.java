package Briscola;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

<<<<<<< HEAD
import javax.swing.ImageIcon;
=======
import javax.swing.JButton;
>>>>>>> 1f693a72c77694ea1062c059d7204c965994e78a
import javax.swing.JFrame;

public class MainFrame extends JFrame{
	
	private Component com;
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	private JButton button;
	    
	public MainFrame(String title){
		super(title);
		
		button = new JButton("Submit");
		com = new Component();
		this.add(com, BorderLayout.CENTER);
		this.add(button, BorderLayout.SOUTH);
		com.setBackground(Color.green);
	}
	
	
	public void showGUI(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
		this.setSize(screenSize);
	}
}
