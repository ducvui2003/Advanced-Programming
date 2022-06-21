package exercisesGrapics;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex3 extends JFrame {
	public Ex3() {

		add(new DrawArc());
	}

	class DrawArc extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.red);
			g.fillArc(20, 20, 200, 200, 0, 45);
			g.fillArc(20, 20, 200, 200, 90, 45);
			g.fillArc(20, 20, 200, 200, 180, 45);
			g.fillArc(20, 20, 200, 200, -90, 45);

		}
	}

	public static void main(String[] args) {
		Ex3 frame = new Ex3();
		frame.setVisible(true);
		frame.setSize(300, 200);
		;
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setTitle("");
		frame.setLocationRelativeTo(null);

	}
}
