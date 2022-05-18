package guiComponents;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

public class ScrollBarDemo extends JFrame {
	private ImageIcon img = new ImageIcon(getClass().getResource("..\\images\\flowers.png"));

	public ScrollBarDemo() {
		super("Scroll Bar Demo");
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
		ScrollBarDemo frame = new ScrollBarDemo();
	}
}
