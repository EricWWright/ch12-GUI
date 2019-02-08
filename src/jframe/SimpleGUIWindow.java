package jframe;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;   // new import for event listeners 

public class SimpleGUIWindow implements ActionListener{
	JFrame myFrame = null;
	JButton myButton1 = null;
	JButton myButton2 = null;

	public static void main(String[] args) {
		// create instance of MyProgram that will do all the work!
        new SimpleGUIWindow();
	    
	}
	
	public SimpleGUIWindow() {    //  MyProgram constructor
       JFrame myFrame = new JFrame();        // create the JFrame window
       myFrame.setLayout(new FlowLayout());  // attach manager 
       myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       myButton1 = new JButton("Red");     // create a JButton
       myButton1.addActionListener(this);  // connect button to listener
       myFrame.add(myButton1);             // add JButton to JFrame
      
       myButton2 = new JButton("Blue");    // create a JButton
       myButton2.addActionListener(this);  // connect button to listener
       myFrame.add(myButton2);             // add JButton to JFrame 

       myFrame.pack();
       myFrame.setVisible(true);                
    }

	@Override
	public void actionPerformed(ActionEvent event) {
		Object control = event.getSource();
		  if (control == myButton1) { // if myButton1 was clicked
		     JOptionPane.showMessageDialog(myFrame,"I like Red!");
		  }
		  else if (control == myButton2) { // else if myButton2 was clicked
		     JOptionPane.showMessageDialog(myFrame,"I like Blue!");
		  }
		
	}

}
