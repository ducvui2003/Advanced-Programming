package basics;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestImageIcon extends JFrame {
	private ImageIcon usIcon = new ImageIcon(getClass().getResource("..\\images\\american_flag.gif"));
	private ImageIcon caIcon = new ImageIcon(getClass().getResource("..\\images\\canada_flag.gif"));
	private ImageIcon geIcon = new ImageIcon(getClass().getResource("..\\images\\german_flag.gif"));
	private ImageIcon noIcon = new ImageIcon(getClass().getResource("..\\images\\norway_flag.gif"));

	public TestImageIcon() {
		setLayout(new GridLayout(1, 4, 5, 5));
		add(new JLabel(usIcon));
		add(new JLabel(caIcon));
		add(new JLabel(geIcon));
		add(new JLabel(noIcon));
	}

	public static void main(String[] args) {
		TestImageIcon frame = new TestImageIcon();
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
