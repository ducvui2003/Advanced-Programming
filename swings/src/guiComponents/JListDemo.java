package guiComponents;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

public class JListDemo extends JFrame {
	String[] flagTitles = { "Vietnam", "Austraulia", "Canada", "Denmark", "France", "Germany", "Norway",
			"United Kindom" };
	private JList jLst = new JList(flagTitles);

	public JListDemo() {
		JLabel lb = new JLabel("Please choose a country");
		add(lb, BorderLayout.NORTH);

		add(jLst, BorderLayout.CENTER);

		JButton btn = new JButton("OK");
		add(btn, BorderLayout.SOUTH);
		setVisible(true);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		JListDemo frame = new JListDemo();
		frame.setTitle("List Demo");
	}
}
