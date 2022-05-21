package eventDriven;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;

public class AdapterClassDemo extends JFrame {
	private Point point = new Point();

	public AdapterClassDemo() {
//		Registry listener
//		Handle event mouse
		addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				point = e.getPoint();
				repaint();//Make mouse can paint in area where it went
			}
		});
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		g.fillOval(point.x, point.y, 8, 8);
	}

	public static void main(String[] args) {
		AdapterClassDemo frame = new AdapterClassDemo();
		frame.setTitle("Adapter Class Demo");
	}
}
