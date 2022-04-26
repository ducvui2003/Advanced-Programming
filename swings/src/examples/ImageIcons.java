package examples;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;

public class ImageIcons extends JFrame {
	private ImageIcon usIcon = new ImageIcon("D:\\University\\Year_1\\Advanced Programming\\picture");
	private ImageIcon caIcon = new ImageIcon();
	private ImageIcon geIcon = new ImageIcon();
	private ImageIcon noIcon = new ImageIcon();

	public ImageIcons() {
		setLayout(new GridLayout(1, 4, 5, 5));
		add(new JLabel(usIcon));
		add(new JLabel(caIcon));
		add(new JLabel(geIcon));
		add(new JLabel(noIcon));
	}

	public static void main(String[] args) {
		ImageIcons frame = new ImageIcons();
		frame.setTitle("Jframe Demo");
		frame.setSize(400, 200);
		frame.setLocation(200, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
