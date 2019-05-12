package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JButton;
public class SimpleEventDemo extends JFrame implements ActionListener{
	private JButton button1,button2;
	public SimpleEventDemo()
	{
		button1 = new JButton("OK");
		button2 = new JButton("Fine");
		add(button1);
		button1.addActionListener(this);
		add(button2);
		button2.addActionListener(this);
	}
	public static void main(String[] args) {
		SimpleEventDemo frame = new SimpleEventDemo();
		frame.setTitle("Simple Event Demo");
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		frame.setSize(250,80);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
	}
	//this method is invoked when a button is clicked
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b == button1)
			System.out.println("It's OK");
		else if(b == button2)
			System.out.println("It's FINE");
	}

}
