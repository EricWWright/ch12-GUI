package jframe;

import java.awt.*; 
import javax.swing.*;
import javax.swing.border.*;
//import java.awt.event.*;

public class Layouts {
	JFrame myFrame;
	JButton appleButton;
	JButton orangeButton;
	JButton pearButton;
	JButton bananaButton;

	public Layouts() {
		myFrame = new JFrame();
		
		JPanel myPanel = (JPanel)myFrame.getContentPane();
		
		FlowLayout layout = new FlowLayout();
		
		Border myBorder = BorderFactory.createMatteBorder(20, 10, 20, 10, Color.red);
		myPanel.setBorder(myBorder);
		
		//GridLayout layout = new GridLayout(3,2);
		
		//GridLayout layout = new GridLayout(3,2,5,100);
		//layout.setHgap(35);
		//layout.setVgap(35);
		
		//BorderLayout layout = new BorderLayout(5,10);
		
		//BoxLayout layout = new BoxLayout(myPanel, BoxLayout.Y_AXIS);
		
		myPanel.setLayout(layout);
		myFrame.setSize(550, 150);
	    myFrame.setLocation(200, 300);

	    // make sure program terminates when window is closed
	    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		appleButton = new JButton("Apple");
		myPanel.add(appleButton); //BorderLayout .PAGE_START .NORTH
		myFrame.setContentPane(myPanel);
		orangeButton = new JButton("Orange");
		myPanel.add(orangeButton); //BorderLayout .PAGE_END .SOUTH
		pearButton = new JButton("Pear");
		myPanel.add(pearButton); //BorderLayout .LINE_START .EAST
		bananaButton = new JButton("Banana");
		myPanel.add(bananaButton); //BorderLayout .LINE_END .WEST
		
		//appleButton.setAlignmentX(Component.RIGHT_ALIGNMENT);
		//pearButton.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		//bananaButton.setAlignmentY(Component.CENTER_ALIGNMENT);
		
		myFrame.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Layouts();

	}

}