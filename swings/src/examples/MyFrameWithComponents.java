package examples;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrameWithComponents {
	public static void main(String[] args) {
		JFrame frame = new JFrame("myFrameWithComponents");
//	Add a button into the frame
		JButton jbtOK = new JButton("ok");
		frame.add(jbtOK);

		frame.setSize(400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}
}
