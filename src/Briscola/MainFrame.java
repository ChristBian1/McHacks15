package Briscola;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame{
	
	private JPanel background, northBG, cardBG;
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	//	private static JTextField score;
	
	public MainFrame(String title){
		super(title);
		background = new JPanel(new GridBagLayout());
		northBG = new JPanel(new GridBagLayout());
		cardBG = new JPanel();
		
//		north Panel
		northBG.setSize((int)(0.4*screenSize.getWidth()), (int)(0.2*screenSize.getHeight()));
		northBG.setBackground(Color.GRAY);
		cardBG.setSize((int)(0.1*screenSize.getWidth()), (int)(0.05*screenSize.getHeight()));
		cardBG.setBackground(Color.YELLOW);
		this.add(background);
		background.add(northBG);
		northBG.add(cardBG);
	}

	public void showGUI(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
		this.setSize(screenSize);
		this.getPanel().setOpaque(true);
		this.getPanel().setBackground(Color.GREEN);		
	}

	public JPanel getPanel() {
		return background;
	}
	
	public void setPanel(JPanel panel) {
		this.background = panel;
	}

	public JPanel getCardBG() {
		return northBG;
	}

	public void setCardBG(JPanel cardBG) {
		this.northBG = cardBG;
	}
	
}
