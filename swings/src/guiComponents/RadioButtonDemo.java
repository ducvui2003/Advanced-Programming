package guiComponents;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class RadioButtonDemo extends JFrame {
	public RadioButtonDemo(String title) {
		super(title);
		setLayout(new GridLayout(4, 2));
		JLabel sex = new JLabel("Sex");
		add(sex);

		JRadioButton woman = new JRadioButton("Famale");
		add(woman);
		JRadioButton man = new JRadioButton("Male");
		add(man);

		JButton Ok = new JButton("OK");
		add(Ok);

		setVisible(true);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		RadioButtonDemo frame = new RadioButtonDemo("RadioButton Demo");
	}
}
