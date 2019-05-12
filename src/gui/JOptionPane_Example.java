package gui;

import javax.swing.JOptionPane;

import square_equation.*;

public class JOptionPane_Example {

	public static void main(String[] args) {
//		JOptionPane.showMessageDialog(null, "Hello World!");//null co nghia lam truc tiep tren lop JOptionPane,
//		String name = JOptionPane.showInputDialog(null, "What is your name");
//		JOptionPane.showMessageDialog(null,"My name is "+name);
//		int a = JOptionPane.showC0onfirmDialog(null, "Do you love me?");
//		if(a == JOptionPane.YES_OPTION)
//			 JOptionPane.showMessageDialog(null, "I'm so happy");
//		else if(a == JOptionPane.NO_OPTION)
//			JOptionPane.showMessageDialog(null, "I hate you , too");
//		else if(a == JOptionPane.CANCEL_OPTION)
//			JOptionPane.showMessageDialog(null, "Bye bye");
		
		// giai phuong trinh bac 2
		int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a : "));
		int b = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter b : "));
		int c = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter c : "));
		//Square tmp = new Square(a,b,c);
		JOptionPane.showMessageDialog(null,(new SquareEquation(a,b,c)).solve2());
		
		
		
		
	}
}

