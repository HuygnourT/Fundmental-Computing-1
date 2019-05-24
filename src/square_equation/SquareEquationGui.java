package square_equation;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SquareEquationGui extends JFrame implements ActionListener,ItemListener,KeyListener{
	
	JTextField txtA,txtB,txtC,txtAnswer,title;
	JLabel lblA,lblB,lblC,lblAnswer;
	JRadioButton JRBtnSquare,JRBtnLiner;
	JButton btnSolve,btnReset,btnExit;
	ButtonGroup grpBtn;
	public SquareEquationGui()
	{
		//1.Initialization frame
		super("Solve square equation");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		super.setVisible(true);
		super.setSize(new Dimension(500,700));
		super.setLayout(null);
		
		//2. Initialization component
		
		//set title
		title = new JTextField();
		title.setBounds(new Rectangle(100,10,300,30));
		title.setEnabled(false);
		super.add(title);
		
		lblA = new JLabel("Enter a : ");
		lblA.setBounds(new Rectangle(100,100,50,20));
		super.add(lblA);
		txtA = new JTextField();
		txtA.setBounds(new Rectangle(150,100,50,20));
		txtA.setEnabled(false);
		super.add(txtA);
		
		lblB = new JLabel("Enter b : ");
		lblB.setBounds(new Rectangle(100,170,50,20));
		super.add(lblB);
		txtB = new JTextField();
		txtB.setBounds(new Rectangle(150,170,50,20));
		txtB.setEnabled(false);
		super.add(txtB);
		
		lblC = new JLabel("Enter c : ");
		lblC.setBounds(new Rectangle(100,240,50,20));
		super.add(lblC);
		txtC = new JTextField();
		txtC.setBounds(new Rectangle(150,240,50,20));
		txtC.setEnabled(false);
		super.add(txtC);
		
		lblAnswer = new JLabel("Answer : ");
		lblAnswer.setBounds(new Rectangle(100,310,70,20));
		super.add(lblAnswer);
		
		txtAnswer = new JTextField();
		txtAnswer.setBounds(new Rectangle(150,310,200,50));
		txtAnswer.setEnabled(false);
		super.add(txtAnswer);
		
		
		btnSolve = new JButton("Solve");
		btnSolve.setBounds(new Rectangle(115,400,80,30));
		super.add(btnSolve);
		btnSolve.addActionListener(this);
		btnReset = new JButton("Reset");
		btnReset.setBounds(new Rectangle(210,400,80,30));
		btnReset.addActionListener(this);
		super.add(btnReset);
		btnExit = new JButton("Exit");
		btnExit.setBounds(new Rectangle(305,400,80,30));
		btnExit.addActionListener(this);
		super.add(btnExit);
		
		JRBtnSquare = new JRadioButton("Square Equation");
		JRBtnSquare.setBounds(new Rectangle(250,138,150,10));
		super.add(JRBtnSquare);
		JRBtnSquare.addItemListener(this);
		
		JRBtnLiner = new JRadioButton("Liner Equation");
		JRBtnLiner.setBounds(new Rectangle(250,208,150,10));
		super.add(JRBtnLiner);
		JRBtnLiner.addItemListener(this);
		
		grpBtn = new ButtonGroup();
		grpBtn.add(JRBtnSquare);
		grpBtn.add(JRBtnLiner);
			
		
		txtA.addKeyListener(this);
		txtB.addKeyListener(this);
		txtC.addKeyListener(this);
		btnSolve.addKeyListener(this);
		
		super.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnReset)
		{
			grpBtn.clearSelection();
			txtA.setText("");
			txtB.setText("");
			txtC.setText("");
			txtA.setEnabled(false);
			txtB.setEnabled(false);
			txtC.setEnabled(false);
			title.setText("");
			txtAnswer.setEnabled(false);
			txtAnswer.setText("");
		} else if(e.getSource() == btnExit)
			System.exit(0);
		else if(e.getSource() == btnSolve)
		{
			
			double a = txtA.getText().equals("")?0 : Double.parseDouble(txtA.getText());
			double b = txtB.getText().equals("")?0 : Double.parseDouble(txtB.getText());
			double c = txtC.getText().equals("")?0 : Double.parseDouble(txtC.getText());
			txtAnswer.setEnabled(true);
			txtAnswer.setText(new SquareEquation(a,b,c).solve2());
		}
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(JRBtnLiner.isSelected())
		{
			txtA.setText("");
			title.setEnabled(true);
			title.setText("        "
					+ "                             bx + c = 0");
			txtA.setEnabled(false);
			txtB.setEnabled(true);
			txtC.setEnabled(true);
			txtB.requestFocus();
		}
		else if (JRBtnSquare.isSelected())
		{
			
			title.setEnabled(true);
			title.setText("       "
					+ "                             ax^2 + bx + c = 0");
			txtA.setEnabled(true);
			txtB.setEnabled(true);
			txtC.setEnabled(true);
			txtA.requestFocus();
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getSource() == txtA)
			if(e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_DOWN)
			{
				txtB.requestFocus();
			}
		if(e.getSource() == txtB)
			if(e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_DOWN )
			{
				txtC.requestFocus();
			}
			else if(e.getKeyCode() == KeyEvent.VK_UP)
				txtA.requestFocus();
		if(e.getSource() == txtC)
			if(e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_DOWN )
			{
				btnSolve.requestFocus();
			}
			else if(e.getKeyCode() == KeyEvent.VK_UP)
				txtB.requestFocus();
		if(e.getSource() == btnSolve)
			if(e.getKeyCode() == KeyEvent.VK_ENTER)
			{
			double a = txtA.getText().equals("")?0 : Double.parseDouble(txtA.getText());
			double b = txtB.getText().equals("")?0 : Double.parseDouble(txtB.getText());
			double c = txtC.getText().equals("")?0 : Double.parseDouble(txtC.getText());
			txtAnswer.setEnabled(true);
			txtAnswer.setText(new SquareEquation(a,b,c).solve2());
			}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		
	}
	public static void main(String[] args) {
		SquareEquationGui huy = new SquareEquationGui();
	}
}
