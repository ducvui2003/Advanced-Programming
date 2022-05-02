package basics;

import javax.swing.JFrame;

public class MyFrame {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Demo Frame");
		frame.setSize(400, 300);
		frame.setLocationRelativeTo(null);//center frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);//show frame
	}
}
