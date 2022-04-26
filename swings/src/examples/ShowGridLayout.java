package examples;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;

public class ShowGridLayout extends JFrame {
	public ShowGridLayout(String title) {

		super(title);
		setLayout(new GridLayout(3, 2, 5, 5));
		// Add labels and text fields to the frame
		add(new JLabel("First Name"));
		add(new JTextField(8));
		add(new JLabel("MI"));
		add(new JTextField(1));
		add(new JLabel("First Name"));
		add(new JTextField(8));
	}

	public static void main(String[] args) {
		ShowGridLayout frame = new ShowGridLayout("Show Gird Layout");
		frame.setSize(300, 180);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
