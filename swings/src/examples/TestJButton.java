package examples;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TestJButton extends JFrame {
	ImageIcon usIcon = new ImageIcon(
			"D:\\University\\Year_1\\Advanced Programming\\Advanced\\swings\\src\\images\\american_flag.gif");
	ImageIcon caIcon = new ImageIcon(
			"D:\\University\\Year_1\\Advanced Programming\\Advanced\\swings\\src\\images\\canada_flag.gif");
	ImageIcon geIcon = new ImageIcon(
			"D:\\University\\Year_1\\Advanced Programming\\Advanced\\swings\\src\\images\\german_flag.gif");

//	Constructer
	public TestJButton() {
		JButton jbtClick = new JButton("Click it", usIcon);
		jbtClick.setPressedIcon(caIcon);
		jbtClick.setRolloverIcon(geIcon);
		add(jbtClick);
	}

	public static void main(String[] args) {
		TestJButton frame = new TestJButton();
		frame.setTitle("Button Icon demo");
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
}
