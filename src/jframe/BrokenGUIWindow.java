package jframe;
import javax.swing.*;
import java.awt.*;

public class BrokenGUIWindow {

	public static void main(String[] args) {
		while(true) {
			//object creation
			JFrame myFrame = new JFrame();
			FlowLayout myLayout = new FlowLayout();
			JLabel myLabel = new JLabel("This is my label!");
			JButton myButton = new JButton("Click Here");
	    
			//setup
			myFrame.setTitle("JFrame Window");
			myFrame.setLayout(myLayout); 
			// sets width = 400, height = 200
			myFrame.setSize(400, 200);
			// sets upper left column = 200, row = 300 
			myFrame.setLocation(200, 300);
			myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
			//draw / render
			myFrame.add(myLabel);
			myFrame.add(myButton);
	    
			myFrame.pack();
			myFrame.setVisible(true);
			myFrame.setVisible(false);
			myButton.setEnabled(false);
			myButton.setEnabled(true);
		}

	}

}
