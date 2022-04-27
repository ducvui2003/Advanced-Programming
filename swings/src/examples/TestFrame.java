package examples;

import javax.swing.JFrame;

public class TestFrame {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Jframe Demo");
		frame.setSize(400, 200);
		frame.setLocation(200, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
