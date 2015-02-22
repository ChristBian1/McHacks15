package Briscola;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame extends JFrame{
	
	private JPanel panel;
	private static JTextField score;
	
	public MainFrame(String title){
		super(title);
		panel = new JPanel();
	}

	public void showGUI(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
		this.getPanel().setOpaque(true);
		this.getPanel().setBackground(Color.GREEN);		
		this.add(panel);
	}

	public JPanel getPanel() {
		return panel;
	}
	
	public void setPanel(JPanel panel) {
		this.panel = panel;
	}
}
