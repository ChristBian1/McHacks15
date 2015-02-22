package Briscola;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SplashPage extends JFrame{
	
	JButton button;
	JPanel panel;
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	
	public SplashPage(String title){
		super(title);
		panel = new JPanel();
		button = new JButton("Connect");

		this.add(panel);
		panel.add(button);
	}
	
	public void showGUI(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
		this.setSize(screenSize);
	}
	
}
