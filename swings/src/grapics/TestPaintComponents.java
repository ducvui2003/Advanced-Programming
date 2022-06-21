package grapics;

import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestPaintComponents extends JFrame {
	public TestPaintComponents() {
//		setLayout(new FlowLayout());

		add(new NewPanel());
		setTitle("Test Paint Component");
		setSize(300, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new TestPaintComponents();
	}

	class NewPanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawLine(0, 0, 50, 50);
			g.drawString("Bannen here", 0, 40);

		}

	}

}
