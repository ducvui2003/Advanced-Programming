package examples;

import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.*;

public class ShowBorderLayout extends JFrame {
	public ShowBorderLayout(String title) {
		super(title);
		setLayout(new BorderLayout(5, 10));
		add(new JButton("East"), BorderLayout.EAST);
		add(new JButton("South"), BorderLayout.SOUTH);
		add(new JButton("West"), BorderLayout.WEST);
		add(new JButton("West"), BorderLayout.NORTH);
		add(new JButton("Center"), BorderLayout.CENTER);

	}

	public static void main(String[] args) {
		ShowBorderLayout frame = new ShowBorderLayout("Show Border Layout");
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
