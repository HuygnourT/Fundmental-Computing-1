package gui;

import javax.swing.JFrame;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
public class ComponentsExample {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("A frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(300,200);
		frame.setLocationRelativeTo(null);
		JButton b1 = new JButton();
		b1.setText("I'm a button");
		JButton b2 = new JButton("Click me");
		JPanel panel = new JPanel();
		panel.add(b1);
		panel.add(b2);
		frame.add(panel);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}

}
