package gui;

import java.awt.*;
import javax.swing.*;
public class BoxLayoutTex2 {
   public static void main(String[] a) {
      JFrame myFrame = new JFrame("BoxLayout Test");
      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Container myPane = myFrame.getContentPane();
      myPane.setLayout(new BoxLayout(myPane,BoxLayout.Y_AXIS));
      myPane.add(getFieldPanel());
      myPane.add(getButtonPanel());
      myFrame.pack();
      myFrame.setVisible(true);
   }
   private static JPanel getFieldPanel() {
      JPanel p = new JPanel();
      p.setLayout(new BoxLayout(p,BoxLayout.X_AXIS));
      p.setBorder(BorderFactory.createTitledBorder("Details"));
      p.add(getLabelPanel());
      p.add(getValuePanel());
      return p;
   }
   private static JPanel getButtonPanel() {
      JPanel p = new JPanel();
      p.setLayout(new BoxLayout(p,BoxLayout.X_AXIS));
      p.add(new JButton("OK"));
      p.add(new JButton("Cancel"));
      return p;
   }
   private static JPanel getLabelPanel() {
      JPanel p = new JPanel();
      p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));
      JLabel l = new JLabel("Name:");
      l.setAlignmentX(Component.RIGHT_ALIGNMENT);
      p.add(l);
      l = new JLabel("System:");
      l.setAlignmentX(Component.RIGHT_ALIGNMENT);
      p.add(l);
      l = new JLabel("Language:");
      l.setAlignmentX(Component.RIGHT_ALIGNMENT);
      p.add(l);
      l = new JLabel("Year:");
      l.setAlignmentX(Component.RIGHT_ALIGNMENT);
      p.add(l);
      return p;
   }
   private static JPanel getValuePanel() {
      JPanel p = new JPanel();
      p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));
      JComponent c = new JTextField(16);
      c.setAlignmentX(Component.LEFT_ALIGNMENT);
      p.add(c);
      JPanel s = getSystemPanel();
      s.setAlignmentX(Component.LEFT_ALIGNMENT);
      p.add(s);
      s = getLanguagePanel();
      s.setAlignmentX(Component.LEFT_ALIGNMENT);
      p.add(s);
      JComboBox<String> b = new JComboBox<String>(
         new String[] {"2021","2022","2023"});
      b.setAlignmentX(Component.LEFT_ALIGNMENT);
      p.add(b);
      return p;
   }
   private static JPanel getSystemPanel() {
      JRadioButton unixButton = new JRadioButton("Unix",true);
      JRadioButton winButton = new JRadioButton("Window",false);
      ButtonGroup systemGroup = new ButtonGroup();
      systemGroup.add(unixButton);
      systemGroup.add(winButton);
      JPanel p = new JPanel();
      p.setLayout(new BoxLayout(p,BoxLayout.X_AXIS));
      p.add(unixButton);
      p.add(winButton);
      return p;
   }
   private static JPanel getLanguagePanel() {
      JPanel p = new JPanel();
      p.setLayout(new BoxLayout(p,BoxLayout.X_AXIS));
      p.add(new JCheckBox("Java",true));
      p.add(new JCheckBox("C++",true));
      p.add(new JCheckBox("Perl",false));
      return p;
   }
}