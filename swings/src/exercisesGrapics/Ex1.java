package exercisesGrapics;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex1 extends JFrame {
	public Ex1() {
		setLayout(new GridLayout(7, 7, 0, 0));
		int[][] array = new int[7][7];
		for (int row = 0; row < array.length; row++) {
			if (row % 2 == 0) {
				for (int column = 0; column < array[row].length; column++) {
					if (column % 2 == 0) {
						add(new Panel().add(new DrawRec()));
					} else {
						add(new Panel().add(new DrawFillRec()));
					}
				}
			} else {
				for (int column = 0; column < array[row].length; column++) {
					if (column % 2 == 0) {
						add(new Panel().add(new DrawFillRec()));
					} else {
						add(new Panel().add(new DrawRec()));
					}
				}
			}
		}
	}

	class DrawRec extends JPanel {

		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawRect(0, 0, 50, 25);

		}
	}

	class DrawFillRec extends JPanel {

		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.fillRect(0, 0, 50, 25);

		}
	}

	public static void main(String[] args) {
		Ex1 frame = new Ex1();
		frame.setTitle("Grid Test");
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.pack();

	}
}
