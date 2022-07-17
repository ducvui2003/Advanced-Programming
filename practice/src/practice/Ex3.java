package practice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Ex3 extends JFrame {
	JButton recBtn, lineBtn, ovalBtn;
	JRadioButton whiteBtn, blackBtn;
	JCheckBox filledBtn;
	JPanel box1, box2, box3;

	Oval oval = new Oval();
	Line line = new Line();
	Rec rec = new Rec();

	public Ex3() {
//		Menu
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu shapesMenu = new JMenu("Shapes");
		menuBar.add(shapesMenu);
		JMenu infoMenu = new JMenu("Info of actor");
		menuBar.add(infoMenu);
		JMenuItem lineSubMenu = new JMenuItem("Line");
		shapesMenu.add(lineSubMenu);
		JMenuItem recSubMenu = new JMenuItem("Rectangle");
		shapesMenu.add(recSubMenu);
		JMenuItem ovalSubMenu = new JMenuItem("Oval");
		shapesMenu.add(ovalSubMenu);
		JMenuItem infoSubMenu = new JMenuItem("Information");
		infoMenu.add(infoSubMenu);
		JMenuItem exitSubMenu = new JMenuItem("Exit");
		infoMenu.add(exitSubMenu);

		setLayout(new BorderLayout());
		box1 = new JPanel();
		box1.setBorder(new LineBorder(Color.BLACK));
		add(box1, BorderLayout.EAST);
		BoxLayout layout1 = new BoxLayout(box1, BoxLayout.Y_AXIS);
		box1.setLayout(layout1);
		box1.add(lineBtn = new JButton("Line"));
		box1.add(recBtn = new JButton("Rectangle"));
		box1.add(ovalBtn = new JButton("Oval"));

		box2 = new JPanel();
		add(box2, BorderLayout.SOUTH);
		box2.setBorder(new LineBorder(Color.BLACK));
		BoxLayout layout2 = new BoxLayout(box2, BoxLayout.LINE_AXIS);
		box2.add(new JLabel("Color:"));
		box2.add(whiteBtn = new JRadioButton("White"));
		box2.add(blackBtn = new JRadioButton("Black"));
		ButtonGroup btnGr = new ButtonGroup();
		btnGr.add(whiteBtn);
		btnGr.add(blackBtn);
		box2.add(filledBtn = new JCheckBox("Filled"));

		box3 = new JPanel(new BorderLayout());
		add(box3, BorderLayout.CENTER);
		repaint();
//		box3.add(rec);
//		box3.add(line);
//		box3.add(oval);

//		Handle Event
//			Event MenuBar
		infoSubMenu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == infoSubMenu) {
					InfoFrame subFrame = new InfoFrame();
					subFrame.setTitle("Information");
					subFrame.setSize(200, 200);
					subFrame.setVisible(true);
					subFrame.setLocationRelativeTo(null);
					subFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
			}
		});
		exitSubMenu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == exitSubMenu) {
					System.exit(0);
				}
			}
		});

//			Event Btn Shapes
		HandleEventShapes eventShapes = new HandleEventShapes();
		lineBtn.addActionListener(eventShapes);
		recBtn.addActionListener(eventShapes);
		ovalBtn.addActionListener(eventShapes);
	}

	public static void main(String[] args) {
		Ex3 frame = new Ex3();
		frame.setSize(700, 700);
		frame.setTitle("Paint");
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	class Line extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawLine(getWidth() - getWidth() * 3 / 4, getHeight() - getHeight() * 3 / 4, getWidth() - getWidth() / 2,
					getHeight() - getHeight() / 2);
		}
	}

	class Rec extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawRect(getWidth() - getWidth() * 3 / 4, getHeight() - getHeight() * 3 / 4, getWidth() - getWidth() / 2,
					getHeight() - getHeight() / 2);
		}
	}

	class Oval extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawOval(getWidth() - getWidth() * 3 / 4, getHeight() - getHeight() * 3 / 4, getWidth() / 4,
					getHeight() / 4);
		}
	}

	class HandleEventShapes implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == lineBtn) {
				box3.add(line);
				box3.remove(rec);
				box3.remove(oval);
				repaint();
			}
			if (e.getSource() == recBtn) {
				box3.remove(line);
				box3.add(rec);
				box3.remove(oval);
				repaint();
			}
			if (e.getSource() == ovalBtn) {
				box3.remove(line);
				box3.remove(rec);
				box3.add(oval);
				repaint();
			}
		}
	}
}
