package excerses;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Paint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ex12 extends JFrame {
	JPanel pn1, pn2;
	JRadioButton btnRed, btnBlue, btnYellow;
	PaintCircle circle1, circle2, circle3;

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
		pn1 = new JPanel(new GridLayout(1, 3, 5, 5));
		pn2 = new JPanel(new FlowLayout());
		add(pn1);
		pn1.add(circle1 = new PaintCircle(PaintCircle.BLACK));
		pn1.add(circle2 = new PaintCircle(PaintCircle.BLACK));
		pn1.add(circle3 = new PaintCircle(PaintCircle.BLACK));

		add(pn2);
		pn2.add(new JLabel("Choose traffic light: "));
		pn2.add(btnRed = new JRadioButton());
		pn2.add(new JLabel("Red"));
		pn2.add(btnBlue = new JRadioButton());
		pn2.add(new JLabel("Blue"));
		pn2.add(btnYellow = new JRadioButton());
		pn2.add(new JLabel("Yellow"));

		ButtonGroup btnGr = new ButtonGroup();
		btnGr.add(btnBlue);
		btnGr.add(btnYellow);
		btnGr.add(btnRed);

//		Handle Event
		btnRed.addActionListener(new chooseColor());
		btnBlue.addActionListener(new chooseColor());
		btnYellow.addActionListener(new chooseColor());
	}

	class PaintCircle extends JPanel {

		public static final int BLACK = 0;
		public static final int RED = 1;
		public static final int GREEN = 2;
		public static final int YELLOW = 3;
		public int type = 1;

		public PaintCircle(int type) {
			this.type = type;
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			repaint();
			switch (type) {
			case 1:
				g.setColor(Color.red);
				g.fillOval(10, 0, 100, 100);
				
				break;
			case 2:
				g.setColor(Color.green);
				g.fillOval(10, 0, 100, 100);
				break;
			case 3:
				g.setColor(Color.YELLOW);
				g.fillOval(10, 0, 100, 100);
				break;
			default:
				g.setColor(Color.black);
				g.fillOval(10, 0, 100, 100);
				break;
			}
		}
	}

	class chooseColor implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnRed) {
				pn1.add(circle1 = new PaintCircle(PaintCircle.BLACK));
				pn1.add(circle2 = new PaintCircle(PaintCircle.RED));
				pn1.add(circle3 = new PaintCircle(PaintCircle.BLACK));
			}
			if (e.getSource() == btnBlue) {
				circle2 = new PaintCircle(PaintCircle.GREEN);
			}
			if (e.getSource() == btnYellow) {
				circle3 = new PaintCircle(PaintCircle.YELLOW);
			}
		}
	}
}
