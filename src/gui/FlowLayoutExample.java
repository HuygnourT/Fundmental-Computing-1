package gui;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.FlowLayout;
public class FlowLayoutExample extends JFrame{
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(new Dimension(300,75));
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Flow layout");
		
		frame.setLayout(new FlowLayout());
		//frame.add(new JLabel("Type your ZIP Code : "));
		frame.add(new JTextField(5));
		frame.add(new JButton("Submit"));
		
		
	}

}
