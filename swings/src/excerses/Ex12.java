package excerses;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ex12 extends JFrame {
	JRadioButton btnRed, btnBlue, btnYellow;

	public static void main(String[] args) {
		Ex12 frame = new Ex12();
		frame.setTitle("Traffic light program");
		frame.pack();

		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public Ex12() {
		setLayout(new GridLayout(2, 1, 50, 50));
		JPanel pn1 = new JPanel(new GridLayout(1,3));
		JPanel pn2 = new JPanel(new FlowLayout());
		add(pn1);
		pn1.add(new PaintCircle());
		pn1.add(new PaintCircle());
		pn1.add(new PaintCircle());
	
		add(pn2);
		pn2.add(new JLabel("Choose traffic light: "));
		pn2.add(btnRed = new JRadioButton());
		pn2.add(btnBlue = new JRadioButton());
		pn2.add(btnYellow = new JRadioButton());

		ButtonGroup btnGr = new ButtonGroup();
		btnGr.add(btnBlue);
		btnGr.add(btnYellow);
		btnGr.add(btnRed);
	}

	class PaintCircle extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {

			super.paintComponent(g);
			g.fillOval(0, 0, 100, 100);
		}
	}
}
