package guiComponents;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

public class ScrollBarDemo extends JFrame {
	private ImageIcon img = new ImageIcon(
			"D:\\University\\Year_1\\Advanced Programming\\Advanced\\swings\\src\\images\\flowers.png");
	public ScrollBarDemo(String title) {
		super(title);
		JScrollBar hbar = new JScrollBar(JScrollBar.HORIZONTAL, 30, 20, 0, 200);
		JScrollBar vbar = new JScrollBar(JScrollBar.VERTICAL, 30, 20, 0, 200);
		add(hbar, BorderLayout.SOUTH);
		add(vbar, BorderLayout.EAST);
		add(new JLabel(img), BorderLayout.CENTER);
		
		setVisible(true);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		ScrollBarDemo frame = new ScrollBarDemo("Scroll Bar Demo");
	}
}
