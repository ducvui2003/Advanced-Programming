package excerses;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

public class Ex4 extends JFrame {
	JLabel red, green, yellow;
	JRadioButton signRed, signGreen, signYellow;

	public Ex4() {
		setLayout(new GridLayout(2, 1));
		JPanel p1 = new JPanel(new GridLayout(3, 1));
		p1.setBorder(new TitledBorder("Change sign of traffic light"));
		add(p1);

		p1.add(red = new JLabel("-Red"));
		p1.add(green = new JLabel("-Green"));
		p1.add(yellow = new JLabel("-Yellow"));

		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		add(p2);
		p2.add(new JLabel("Choose sign:"));
		p2.add(signRed = new JRadioButton("Red"));
		p2.add(signGreen = new JRadioButton("Green"));
		p2.add(signYellow = new JRadioButton("Yellow"));

		ButtonGroup btg = new ButtonGroup();
		btg.add(signRed);
		btg.add(signGreen);
		btg.add(signYellow);

		MyListener event = new MyListener();
		signGreen.addActionListener(event);
	}

	class MyListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == signGreen) {
				green = new JLabel("Green: You choose green");
			}

		}
	}

	public static void main(String[] args) {
		Ex4 frame = new Ex4();
		frame.setTitle("Traffic light program");
		frame.setSize(350, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}
}
