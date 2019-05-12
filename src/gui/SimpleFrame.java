package gui;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SimpleFrame extends JFrame{
	private JButton b1,b2,b3,b4,b5;
	public SimpleFrame()
	{
		
		super("Welcome to simple JFrame");
		setSize(300,200);
		super.setLocationRelativeTo(null);//set gui in center the desktop
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//when put the button exit , the system will exit
		super.setVisible(true);
		
		//thiet lap layout cho frame
		super.setLayout(new FlowLayout());
		
		
		b1 = new JButton("I'm a button 1");
		b2 = new JButton("Click me 2");
		b3 = new JButton("I'm a button 3");
		b4 = new JButton("Click me 4");
		b5 = new JButton("I'm a button 5");
		
		//dua cac components vao container
		super.add(b1);
		super.add(b2);
		super.add(b3);
		super.add(b4);
		super.add(b5);
	}
	
	public static void main(String[] args) {
		SimpleFrame tmp = new SimpleFrame();
	}

}
