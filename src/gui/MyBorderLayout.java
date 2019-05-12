package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyBorderLayout extends JFrame{
	private JButton b1,b2,b3,b4,b5;
	public MyBorderLayout(String title)
	{
		
		super(title);
		setSize(300,200);
		super.setLocationRelativeTo(null);//set gui in center the desktop
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//when put the button exit , the system will exit
		super.setVisible(true);
		
		//thiet lap layout cho frame
		//super.setLayout(new BorderLayout());// net BorderLayout // default layout cua JFrame la BorderLayout
		
		
		b1 = new JButton("Press me");
		b2 = new JButton("I'm a button");
		b3 = new JButton("3");
		b4 = new JButton("Button 4");
		b5 = new JButton("Hello 5");
		
		//dua cac components vao container
		super.add(b1,BorderLayout.NORTH);
		super.add(b2,BorderLayout.SOUTH);
		super.add(b3,BorderLayout.CENTER);
		super.add(b4,BorderLayout.EAST);
		super.add(b5,BorderLayout.WEST);
	}
	public static void main(String[] args) {
		MyBorderLayout tmp = new MyBorderLayout("My BounderLayout");
	}
}
