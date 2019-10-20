package testerproject;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class testclass1 extends JFrame {
	private JPanel buttonPanel;
	private JButton addButton;
	private JButton subtractButton;
	
	public testclass1() {
		setTitle("This is a test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildButtonPanel();
		add(buttonPanel);
		
		pack();
		setVisible(true);
		
	}
	private void buildButtonPanel() {
		buttonPanel = new JPanel();
		addButton = new JButton("Add");
		subtractButton = new JButton("Subtract");
		
		subtractButton.addActionListener(new SubtractButtonListener());
		addButton.addActionListener(new AddButtonListener());
		
		buttonPanel.add(addButton);
		buttonPanel.add(subtractButton);
	}
	private class SubtractButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null,  "subtract 1");
		}
	}
	private class AddButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null,  "add 1");
		}
	}
}
