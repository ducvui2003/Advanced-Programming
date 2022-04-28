package examples;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JTextFieldDemo extends JFrame {
	public JTextFieldDemo(String title) {
		super(title);
		setLayout(new FlowLayout());
		JLabel lb = new JLabel("Sample TextField");
		add(lb);

		JTextField txt = new JTextField(20);
		add(txt);

		setLocationRelativeTo(null);
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		JTextFieldDemo frame = new JTextFieldDemo("JTextField Demo");
	}
}
