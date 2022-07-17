package convertMetreToKilometre;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Frame extends JFrame {
	public static JTextField field = new JTextField();
	public static JLabel notify;
	public static JButton btn;

	public Frame() {
		setLayout(new GridLayout(2, 1, 5, 5));
		JPanel pn = new JPanel(new FlowLayout());
		add(pn);
		pn.add(new JLabel("Convert Metre to Kilometre"));
		pn.add(field = new JTextField(20));
		pn.add(btn = new JButton("Convert"));
		add(notify = new JLabel());
		notify.setVerticalAlignment(SwingConstants.CENTER);
		notify.setHorizontalAlignment(SwingConstants.CENTER);
	}

}
