package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.*;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Calculator extends JFrame implements ActionListener{
	private JButton equal,b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bdot,bplus,bminus,bmultiply,bdivide,bsqrt,bbackspace,bpercent;
	//private JButton b7,b8,b9,bdivide,b4,b5,b6,bmultiply,b1,b2,b3,bminus,b0,bdot,bplus,equal;
	private String s0,s1,s2;
	static JFrame f;
	static JTextField l = new JTextField(200);
	public Calculator(String title)
	{
		
		super(title);
		s1 ="";
		s2 ="";
		s0 ="";
		setSize(new Dimension(250,350));
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		add(l,BorderLayout.NORTH);
		add(addPanelButton(),BorderLayout.CENTER);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	
	public JPanel addPanelButton()
	{
		JPanel panel = new JPanel();
		
		bbackspace = new JButton("←");
		bbackspace.setPreferredSize(new Dimension(105,50));
		bsqrt = new JButton("√");
		bsqrt.setPreferredSize(new Dimension(50,50));
		bpercent = new JButton("%");
		bpercent.setPreferredSize(new Dimension(50,50));
		
		b7 = new JButton("7");
		b7.setPreferredSize(new Dimension(50, 50));
		b8 = new JButton("8");
		b8.setPreferredSize(new Dimension(50, 50));
		b9 = new JButton("9");
		b9.setPreferredSize(new Dimension(50, 50));
		bmultiply = new JButton("*");
		bmultiply.setPreferredSize(new Dimension(50, 50));
		
		b4 = new JButton("4");
		b4.setPreferredSize(new Dimension(50, 50));
		b5 = new JButton("5");
		b5.setPreferredSize(new Dimension(50, 50));
		b6 = new JButton("6");
		b6.setPreferredSize(new Dimension(50, 50));
		bminus = new JButton("-");
		bminus.setPreferredSize(new Dimension(50, 50));
		
		b1 = new JButton("1");
		b1.setPreferredSize(new Dimension(50, 50));
		b2 = new JButton("2");
		b2.setPreferredSize(new Dimension(50, 50));
		b3 = new JButton("3");
		b3.setPreferredSize(new Dimension(50, 50));
		bplus = new JButton("+");
		bplus.setPreferredSize(new Dimension(50, 50));
		
		b0 = new JButton("0");
		b0.setPreferredSize(new Dimension(50, 50));
		equal = new JButton("=");
		equal.setPreferredSize(new Dimension(50, 50));
		bdot = new JButton(".");
		bdot.setPreferredSize(new Dimension(50, 50));
		bdivide = new JButton("/");
		bdivide.setPreferredSize(new Dimension(50, 50));
		
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		equal.addActionListener(this);
		bdot.addActionListener(this);
		bplus.addActionListener(this);
		bminus.addActionListener(this);
		bmultiply.addActionListener(this);
		bdivide.addActionListener(this);
		bsqrt.addActionListener(this);
		bbackspace.addActionListener(this);
		bpercent.addActionListener(this);
		
		panel.add(bbackspace);
		panel.add(bsqrt);
		panel.add(bpercent);
		
		panel.add(b7);
		panel.add(b8);
		panel.add(b9);
		panel.add(bdivide);
		
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);
		panel.add(bmultiply);
		
		
		panel.add(b0);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(bminus);
		
		panel.add(b0);
		panel.add(bdot);
		panel.add(bplus);
		panel.add(equal);
		
		
		return panel;
		
	}
	
//	public void actionPerformed(ActionEvent e) {
//		JButton b = (JButton)e.getSource();
//		
//	}
	public void actionPerformed(ActionEvent e) 
    { 
        String s = e.getActionCommand(); 
        
        
    }
	public static void main(String[] args) {
		f = new Calculator("Calculator");
		
	}

}
