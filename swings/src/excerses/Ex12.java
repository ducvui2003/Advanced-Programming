package excerses;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Ex12 extends JFrame {

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.black);
		g.drawOval(150, 150, 100, 100);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("JScroolPane Demo");
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(400, 200);

		frame.paint();
	}
}
