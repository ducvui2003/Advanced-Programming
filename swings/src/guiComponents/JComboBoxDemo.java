package guiComponents;

import java.awt.BorderLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboBoxDemo extends JFrame {
	String[] flagTitles = { "Vietnam", "Austraulia", "Canada", "Denmark", "France", "Germany", "Norway",
			"United Kindom" };
	private JComboBox cbo = new JComboBox(flagTitles);

	public JComboBoxDemo() {
		add(cbo, BorderLayout.NORTH);
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		JComboBoxDemo frame = new JComboBoxDemo();
		frame.setTitle("JComboBox Demo");
	}
}
