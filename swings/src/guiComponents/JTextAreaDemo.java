package guiComponents;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class JTextAreaDemo extends JFrame {
	public JTextAreaDemo(String title) {
		setLayout(new FlowLayout());
		JLabel lb = new JLabel("Description");
		add(lb);

		JTextArea descript = new JTextArea(5, 20);
		add(descript);

		setVisible(true);
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		JTextAreaDemo frame = new JTextAreaDemo("JTextArea Demo");
	}
}
