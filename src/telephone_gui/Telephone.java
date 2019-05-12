package telephone_gui;
import java.awt.event.*;
import java.io.PrintStream;

import javax.swing.*;


import java.awt.*; 

public class Telephone extends JFrame implements ActionListener{
	static JTextField t= new JTextField(16);
	static JTextField tn= new JTextField(16);
	String s0 ="",s1="";
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		if(s.equals("Submit"))
		{
			try
			{
			s1 = tn.getText();
			String link = "src/telephone_gui/" + s1+".txt";
			PrintStream p = new PrintStream(link);
			p.append(s0);
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
			s0 = "";
			s1 = "";
			
		}
			
		else s0 = s0.concat(s);
		t.setText(s0);
	}
	
	public static void main(String[] args) {
		
		Telephone tlp = new Telephone();
		
		JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bt,bs;
		
		b1 = new JButton("1");
		b1.addActionListener(tlp);
		b2 = new JButton("2");
		b2.addActionListener(tlp);
		b3 = new JButton("3");
		b3.addActionListener(tlp);
		b4 = new JButton("4");
		b4.addActionListener(tlp);
		b5 = new JButton("5");
		b5.addActionListener(tlp);
		b6 = new JButton("6");
		b6.addActionListener(tlp);
		b7 = new JButton("7");
		b7.addActionListener(tlp);
		b8 = new JButton("8");
		b8.addActionListener(tlp);
		b9 = new JButton("9");
		b9.addActionListener(tlp);
		b0 = new JButton("0");
		b0.addActionListener(tlp);
		bt = new JButton("*");
		bt.addActionListener(tlp);
		bs = new JButton("#");
		bs.addActionListener(tlp);
		JFrame telephone = new JFrame("Telephone");
		telephone.setSize(new Dimension(700,200));;
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new GridLayout(4,3));
		
		centerPanel.add(b1);
		centerPanel.add(b2);
		centerPanel.add(b3);
		
		centerPanel.add(b4);
		centerPanel.add(b5);
		centerPanel.add(b6);
		
		centerPanel.add(b7);
		centerPanel.add(b8);
		centerPanel.add(b9);
		
		centerPanel.add(bt);
		centerPanel.add(b0);
		centerPanel.add(bs);
		
		
		JPanel southPanel = new JPanel(new FlowLayout());
		southPanel.add(new JLabel("Number to dial : "));
		southPanel.add(t);
		JButton submit = new JButton("Submit");
		submit.addActionListener(tlp);
		southPanel.add(new JLabel("Name : "));
		southPanel.add(tn);
		southPanel.add(submit);
		telephone.add(centerPanel,BorderLayout.CENTER);
		telephone.add(southPanel,BorderLayout.SOUTH);
		telephone.show();
	}
}
