package excerses;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex2 extends JFrame {
	public Ex2() {
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(4, 3));

		for (int i = 1; i <= 9; i++) {
			p1.add(new JButton("" + i));

		}
		p1.add(new JButton("0"));
		p1.add(new JButton("Start"));
		p1.add(new JButton("Stop"));

		JPanel p2 = new JPanel(new BorderLayout());
		p2.add(new JTextField("Time to be displayed here"), BorderLayout.NORTH);
		p2.add(p1, BorderLayout.CENTER);

		add(p2, BorderLayout.WEST);
		add(new JButton("Food to placed here"), BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		Ex2 frame = new Ex2();
		frame.setTitle("");
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}
}
