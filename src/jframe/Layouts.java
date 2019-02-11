package jframe;

import java.awt.*; 
import javax.swing.*;
import java.awt.event.*;

public class Layouts {
	JFrame myFrame;
	JButton appleButton;
	JButton orangeButton;
	JButton pearButton;
	JButton bananaButton;

	public Layouts() {
		myFrame = new JFrame();
		
		JPanel myPanel = (JPanel)myFrame.getContentPane();
		
		//FlowLayout layout = new FlowLayout();
		
		//GridLayout layout = new GridLayout(3,2);
		
		//GridLayout layout = new GridLayout(3,2,5,100);
		//layout.setHgap(35);
		//layout.setVgap(35);
		
		BorderLayout layout = new BorderLayout(5,10);
		
		myPanel.setLayout(layout);
		myFrame.setSize(550, 150);
	    myFrame.setLocation(200, 300);

	    // make sure program terminates when window is closed
	    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		appleButton = new JButton("Apple");
		myPanel.add(appleButton, BorderLayout.PAGE_END);
		myFrame.setContentPane(myPanel);
		orangeButton = new JButton("Orange");
		myPanel.add(orangeButton, BorderLayout.PAGE_START);
		pearButton = new JButton("Pear");
		myPanel.add(pearButton, BorderLayout.LINE_START);
		bananaButton = new JButton("Banana");
		myPanel.add(bananaButton, BorderLayout.PAGE_END);
		
		myFrame.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Layouts();

	}

}
