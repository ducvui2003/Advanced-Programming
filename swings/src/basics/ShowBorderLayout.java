package basics;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class ShowBorderLayout extends JFrame {
	public ShowBorderLayout(String title) {
		super(title);
		setLayout(new BorderLayout(5, 10));
		add(new JButton("East"), BorderLayout.EAST);
		add(new JButton("South"), BorderLayout.SOUTH);
		add(new JButton("West"), BorderLayout.WEST);
		add(new JButton("North"), BorderLayout.NORTH);
		add(new JButton("Center"), BorderLayout.CENTER);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		ShowBorderLayout frame = new ShowBorderLayout("Show Border Layout");
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
