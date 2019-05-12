package sum;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
public class SumGui extends JFrame implements ActionListener,KeyListener{
	private JLabel lbA,lbB,lbResult;
	private JTextField txtA,txtB,txtResult;
	private JButton btnSum,btnReset,btnExit;
	private JPanel pA,pB,pResult,pBtn;
	public SumGui()
	{
		//1.thiet lap cho Frame
		super("Sum Of Two Integer");
		super.setSize(new Dimension(300,200));
		super.setLocationRelativeTo(null);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setVisible(true);
		super.setLayout(new GridLayout(4,1));
		
		//2.Tao cac panels chua component
		pA = new JPanel(new FlowLayout());
		pB = new JPanel(new FlowLayout());
		pResult = new JPanel(new FlowLayout());
		pBtn = new JPanel(new FlowLayout());
		
		//tao cac component
		
		lbA = new JLabel("Enter a: ");
		lbB = new JLabel("Enter b: ");
		lbResult = new JLabel("Result: ");
		
		txtA = new JTextField(10);
		txtB = new JTextField(10);
		txtResult = new JTextField(10);
		
		btnSum = new JButton("Sum");
		btnReset = new JButton("Reset");
		btnExit = new JButton("Exit");
		
		//3.Them cac components vao JFrame
		pA.add(lbA);
		pA.add(txtA);
		
		pB.add(lbB);
		pB.add(txtB);
		
		pResult.add(lbResult);
		pResult.add(txtResult);
		
		pBtn.add(btnSum);
		pBtn.add(btnReset);
		pBtn.add(btnExit);
		
		//4.Them cac panelssuper.add(pA); vao Frame
		super.add(pA);
		super.add(pB);
		super.add(pResult);
		super.add(pBtn);
		//5. dang ki su kien
		btnSum.addActionListener(this);
		btnReset.addActionListener(this);
		btnExit.addActionListener(this);
		
		super.validate();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnSum)
		{
			int a = Integer.parseInt(txtA.getText());
			int b = Integer.parseInt(txtB.getText());
			txtResult.setText(""+(a+b));
		}else if(e.getSource() == btnReset)
		{
			txtA.setText("");
			txtB.setText("");
			txtResult.setText("");
		}else if(e.getSource() == btnExit)
			System.exit(0);
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		SumGui tmp = new SumGui();
	}

}
