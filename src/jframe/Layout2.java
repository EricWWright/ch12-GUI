package jframe;
import java.awt.*; 
import javax.swing.*;

public class Layout2 {
	JFrame myFrame;
	JLabel myLabel;
	JButton appleButton;
	JButton orangeButton;
	JButton pearButton;
	JButton bananaButton;

	public static void main(String[] args) {
		new Layout2();

	}

	public Layout2() {
		myFrame = new JFrame();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(200, 200);
		myFrame.setLocation(200, 200);
		
		JPanel myPanel = (JPanel)myFrame.getContentPane();
		myPanel.setLayout(new BoxLayout(myPanel,BoxLayout.Y_AXIS));
		
		JPanel topPanel = new JPanel();
		topPanel.setLayout(new FlowLayout());
		topPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
		myLabel = new JLabel("What is your favorite fruit?");
		topPanel.add(myLabel);
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setLayout(new GridLayout(2,2,2,2));
		bottomPanel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		
		bottomPanel.add(new JButton("Apple"));
		bottomPanel.add(new JButton("Orange"));
		bottomPanel.add(new JButton("Pear"));
		bottomPanel.add(new JButton("Banana"));
		
		myPanel.add(topPanel);
		myPanel.add(bottomPanel);

		myFrame.setVisible(true); 
	}

}
