package graphic_and_radio_box_button;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Graphic extends JFrame implements ActionListener,ItemListener{
	private JLabel title;
	private JTextField txt;
	private JButton btnHello,btnDelete,btnExit,btnBlue,btnRed,btnGreen;
	private JRadioButton jRBtnBlue,jRBtnRed,jRBtnGreen;
	private ButtonGroup btnGrp;
	public Graphic()
	{	
		//1.Initialization frame
		super("Graphic");
		super.setBackground(Color.DARK_GRAY);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//super.setLocationRelativeTo(null);
		super.setVisible(true);
		super.setSize(new Dimension(500,700));
		this.getContentPane().setBackground(Color.WHITE);
		//2. Initialization component
		
		//Label : K24CMUTPM8
		title = new JLabel("   K24CMUTPM8");
		setLayout(null);//set absolute position
		title.setBackground(Color.CYAN);//set color
		title.setOpaque(true);//cho phep hien thi mau
		title.setBounds(new Rectangle(200,100,100,50));
		
		//TextField :
		
		txt = new JTextField();
		txt.setOpaque(true);
		txt.setBounds(new Rectangle(100,200,300,50));
		txt.setBackground(Color.LIGHT_GRAY);
		
		//Button
		
		btnHello = new JButton("Hello");
		btnHello.setOpaque(true);
		btnHello.setBackground(Color.MAGENTA);
		btnHello.setBounds(new Rectangle(115,300,80,50));
		
		btnDelete = new JButton("Delete");
		btnDelete.setOpaque(true);
		btnDelete.setBackground(Color.GRAY);
		btnDelete.setBounds(new Rectangle(210,300,80,50));
		
		btnExit = new JButton("Exit");
		btnExit.setOpaque(true);
		btnExit.setBackground(Color.PINK);
		btnExit.setBounds(new Rectangle(305,300,80,50));
		
		btnBlue = new JButton("Blue");
		btnBlue.setOpaque(true);
		btnBlue.setBackground(Color.BLUE);
		btnBlue.setBounds(new Rectangle(115,400,80,50));
		
		
		btnRed = new JButton("Red");
		btnRed.setOpaque(true);
		btnRed.setBackground(Color.RED);
		btnRed.setBounds(new Rectangle(210,400,80,50));
		
		btnGreen = new JButton("Green");
		btnGreen.setOpaque(true);
		btnGreen.setBackground(Color.GREEN);
		btnGreen.setBounds(new Rectangle(305,400,80,50));
		
		jRBtnBlue = new JRadioButton("Blue");
		jRBtnBlue.setBounds(new Rectangle(115,480,100,10));
		jRBtnGreen = new JRadioButton("Green");
		jRBtnGreen.setBounds(new Rectangle(115,510,100,10));
		jRBtnRed = new JRadioButton("Red");
		jRBtnRed.setBounds(new Rectangle(115,540,100,10));
		
		//set figuration selection 1 of 3
		btnGrp = new ButtonGroup();
		btnGrp.add(jRBtnBlue);
		btnGrp.add(jRBtnGreen);
		btnGrp.add(jRBtnRed);
		//3. Add component
		super.add(title);
		super.add(txt);
		super.add(btnHello);
		super.add(btnDelete);
		super.add(btnExit);
		super.add(btnBlue);
		super.add(btnGreen);
		super.add(btnRed);
		super.add(jRBtnBlue);
		super.add(jRBtnGreen);
		super.add(jRBtnRed);
		
		//4. Add listen
		btnHello.addActionListener(this);
		btnDelete.addActionListener(this);
		btnExit.addActionListener(this);
		btnBlue.addActionListener(this);
		btnGreen.addActionListener(this);
		btnRed.addActionListener(this);
		jRBtnBlue.addItemListener(this);
		jRBtnRed.addItemListener(this);
		jRBtnGreen.addItemListener(this);
	}
	public static void main(String[] args) {
		Graphic huy = new Graphic();
		
		huy.show();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnHello)
			txt.setText("Hello , My Name : Huy");
		else if(e.getSource() == btnDelete)
		{
			txt.setText("");
			txt.setBackground(Color.LIGHT_GRAY);
			this.getContentPane().setBackground(Color.WHITE);
			btnGrp.clearSelection();//delete radio btn
		}
		else if(e.getSource() == btnExit)
			System.exit(0);
		else if(e.getSource() == btnBlue)
			//txt.setBackground(Color.BLUE);
			this.getContentPane().setBackground(Color.BLUE);
		else if(e.getSource() == btnGreen)
			//txt.setBackground(Color.GREEN);
			this.getContentPane().setBackground(Color.GREEN);
		else if(e.getSource() == btnRed)
			//txt.setBackground(Color.RED);
			this.getContentPane().setBackground(Color.RED);
			
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(jRBtnBlue.isSelected())
			this.txt.setBackground(Color.BLUE);
		else if(jRBtnGreen.isSelected())
			this.txt.setBackground(Color.GREEN);
		else if(jRBtnRed.isSelected())
			this.txt.setBackground(Color.RED);
	}
}
