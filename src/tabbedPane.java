import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class tabbedPane extends JFrame {
	private JTabbedPane pane;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JButton panel1button;
	private JButton panel2button;
	private JButton panel3button;
	private JTextField field1;
	private JTextField field2;
	private JTextField field3;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	
	public tabbedPane() {
		super("JTabbedpane Demo");
		
		pane = new JTabbedPane();
		add(pane);
		
		panel1 = new JPanel();
		label1 = new JLabel("Enter First Name Here");
		field1 = new JTextField(20);
		field1.setFont(new Font("Calibri", Font.BOLD, 18));
		field1.setForeground(Color.GREEN);
		panel1button = new JButton("Enter");
		panel1button.addActionListener(
				new ActionListener () {
					public void actionPerformed(ActionEvent event) {
						JOptionPane.showMessageDialog(null, "First Name is " + field1.getText());
					}
				}				
				);
		panel1.add(label1, BorderLayout.NORTH);
		panel1.add(field1, BorderLayout.CENTER);
		panel1.add(panel1button, BorderLayout.SOUTH);
		pane.addTab("First Name", panel1);
		
		
		
		panel2 = new JPanel();
		label2 = new JLabel("Enter Middle Name Here");
		field2 = new JTextField(20);
		field2.setFont(new Font("Calibri", Font.BOLD, 18));
		field2.setForeground(Color.RED);
		panel2button = new JButton("Enter");
		panel2button.addActionListener(
				new ActionListener () {
					public void actionPerformed(ActionEvent event) {
						JOptionPane.showMessageDialog(null, "Middle Name is " + field2.getText());
					}
				}				
				);
		panel2.add(label2, BorderLayout.NORTH);
		panel2.add(field2, BorderLayout.CENTER);
		panel2.add(panel2button, BorderLayout.SOUTH);
		pane.addTab("Middle Name", panel2);
		
		
		
		panel3 = new JPanel();
		label3 = new JLabel("Enter Last Name Here");
		field3 = new JTextField(20);
		field3.setFont(new Font("Calibri", Font.BOLD, 18));
		field3.setForeground(Color.BLUE);
		panel3button = new JButton("Enter");
		panel3button.addActionListener(
				new ActionListener () {
					public void actionPerformed(ActionEvent event) {
						JOptionPane.showMessageDialog(null, "Last Name is " + field3.getText());
					}
				}				
				);
		panel3.add(label3, BorderLayout.NORTH);
		panel3.add(field3, BorderLayout.CENTER);
		panel3.add(panel3button, BorderLayout.SOUTH);
		pane.addTab("Last Name", panel3);
	}
}