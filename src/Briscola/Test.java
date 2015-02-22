package Briscola;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.*;

public class Test {

	private MenuFrame menuFrame,mainFrame;
	private Label header1,header2;
	private Panel controlPanel;
	
	public Test()
	{
		setupGUI();
		showGUI();
	}
	
	private void setupGUI(){
		menuFrame= new MenuFrame("Main Menu");
		menuFrame.setSize(1200,700);
		
		menuFrame.setLayout(new GridLayout(3, 1));
	    menuFrame.addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent windowEvent){
	            System.exit(0);
	         }        
	      });  
	    controlPanel = new Panel();
	    controlPanel.setLayout(new FlowLayout());
	    menuFrame.add(controlPanel);
	}
	
	public void showGUI(){
		Button connectButton = new Button("Connect");
		connectButton.setActionCommand("Connect");
		connectButton.addActionListener(new ButtonClickListener());
		controlPanel.add(connectButton);
		menuFrame.setVisible(true);
	}
	
	private class ButtonClickListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String command=e.getActionCommand();
			if(command.equals("Connect"))
			{
				setupBriskTable();
			}
		}
	}
	
	private void setupBriskTable()
	{
		menuFrame.setTitle("Briscola");
		menuFrame.remove(controlPanel);
		menuFrame.paint(menuFrame.getGraphics());
	}
	
	
}

