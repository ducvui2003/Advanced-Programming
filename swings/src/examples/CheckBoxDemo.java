package examples;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxDemo extends JFrame {
	public CheckBoxDemo(String title) {
		super(title);
		setLayout(new GridLayout(5, 2));

		JLabel lblHobbies = new JLabel("Your hobbies");
		add(lblHobbies);
		JCheckBox cboMovie = new JCheckBox("Wahtching Movie");
		add(cboMovie);
		JCheckBox cboListen = new JCheckBox("Listening to Music");
		add(cboListen);
		JCheckBox cboRead = new JCheckBox("Reading book");
		add(cboRead);

		JButton jbtOK = new JButton("OK");
		add(jbtOK);

		setVisible(true);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		CheckBoxDemo frame = new CheckBoxDemo("CheckBox Demo");

	}
}
