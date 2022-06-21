package exercisesGrapics;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex2 extends JFrame {
	public void drawRectangleByNumber(int height) {
		int[] array = new int[height];
		StringBuilder string = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			string.append((i + 1) + "     ");

			add(new JLabel(string.toString()));
		}
	}

	public Ex2(int height) {
		setLayout(new GridLayout(height, 0, 10, 10));
		drawRectangleByNumber(height);
		setTitle("");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		pack();
	}

	public static void main(String[] args) {
		Ex2 frame = new Ex2(11);
	}
}
