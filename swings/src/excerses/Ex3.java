package excerses;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class Ex3 extends JFrame {
	JMenuItem subMenuAdd, subMenuSubtract, subMenuMultiply, subMenuDivide;
	JButton addBtn, subtractBtn, multiplyBtn, divideBtn;
	JTextField field1, field2, fieldResult;

	public Ex3() {
		JMenuBar bar = new JMenuBar();
		setJMenuBar(bar);
		JMenu operation = new JMenu("Operation");
		bar.add(operation);
		JMenu exit = new JMenu("Exit");
		bar.add(exit);

		operation.add(subMenuAdd = new JMenuItem("Add"));
		subMenuAdd.setIcon(new ImageIcon(getClass().getResource("..\\images\\addIcon.png")));
		operation.add(subMenuSubtract = new JMenuItem("Subtract"));
		subMenuSubtract.setIcon(new ImageIcon(getClass().getResource("..\\images\\subtractIcon.png")));
		operation.add(subMenuMultiply = new JMenuItem("Multiply"));
		subMenuMultiply.setIcon(new ImageIcon(getClass().getResource("..\\images\\multiplyIcon.png")));
		operation.add(subMenuDivide = new JMenuItem("Divide"));
		subMenuDivide.setIcon(new ImageIcon(getClass().getResource("..\\images\\divideIcon.png")));

		operation.setMnemonic('O');
		exit.setMnemonic('E');
		subMenuAdd.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
		subMenuSubtract.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		subMenuMultiply.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
		subMenuDivide.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));

		setLayout(new GridLayout(2, 1));

		JPanel p1 = new JPanel(new FlowLayout());
		add(p1);
		JLabel number1 = new JLabel("Number 1");
		p1.add(number1);
		field1 = new JTextField(5);
		p1.add(field1);
		JLabel number2 = new JLabel("Number 2");
		p1.add(number2);
		field2 = new JTextField(5);
		p1.add(field2);
		JLabel result = new JLabel("Result");
		p1.add(result);
		fieldResult = new JTextField(5);
		p1.add(fieldResult);
		fieldResult.setEditable(false);

		JPanel p2 = new JPanel(new FlowLayout());
		add(p2);
		addBtn = new JButton("Add", new ImageIcon(getClass().getResource("..\\images\\addIcon.png")));
		p2.add(addBtn);
		subtractBtn = new JButton("Subtract", new ImageIcon(getClass().getResource("..\\images\\subtractIcon.png")));
		p2.add(subtractBtn);
		multiplyBtn = new JButton("Multiply", new ImageIcon(getClass().getResource("..\\images\\multiplyIcon.png")));
		p2.add(multiplyBtn);
		divideBtn = new JButton("Divide", new ImageIcon(getClass().getResource("..\\images\\divideIcon.png")));
		p2.add(divideBtn);

//		Listener
		MyListener event = new MyListener();
		addBtn.addActionListener(event);
		subtractBtn.addActionListener(event);
		multiplyBtn.addActionListener(event);
		divideBtn.addActionListener(event);

	}

	class MyListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == addBtn) {
				double number1 = Double.parseDouble(field1.getText());
				double number2 = Double.parseDouble(field2.getText());
				fieldResult.setText((number1 + number2) + "");
			}
			if (e.getSource() == subtractBtn) {
				double number1 = Double.parseDouble(field1.getText());
				double number2 = Double.parseDouble(field2.getText());
				fieldResult.setText((number1 - number2) + "");
			}
			if (e.getSource() == multiplyBtn) {
				double number1 = Double.parseDouble(field1.getText());
				double number2 = Double.parseDouble(field2.getText());
				fieldResult.setText((number1 * number2) + "");
			}
			if (e.getSource() == divideBtn) {
				double number1 = Double.parseDouble(field1.getText());
				double number2 = Double.parseDouble(field2.getText());
				fieldResult.setText((number1 / number2) + "");
			}
		}
	}

	public static void main(String[] args) {
		Ex3 frame = new Ex3();
		frame.setTitle("Calculator Using Menu");
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}
}
