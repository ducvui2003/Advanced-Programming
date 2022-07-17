package convertMetreToKilometre;

import javax.swing.JFrame;

public class Test extends JFrame {
	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setTitle("Convert");
		frame.pack();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		Frame.btn.addActionListener(new HandleEvent());
	}
}
