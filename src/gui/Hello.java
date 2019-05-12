package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
public class Hello {

	public static void main(String[] args) {
		JFrame f = new JFrame("Frame 1");
		JPanel p = new JPanel();
		JButton b1 = new JButton("Press me");
		JButton b2 = new JButton("Hit me");
		p.add(b1);
		p.add(b2);
		f.add(p);
		f.setLocationRelativeTo(null);
		f.setSize(500,200);
		f.setVisible(true);
	}

}
