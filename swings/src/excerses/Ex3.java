package excerses;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
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
		JTextField field1 = new JTextField(5);
		p1.add(field1);
		JLabel number2 = new JLabel("Number 2");
		p1.add(number2);
		JTextField field2 = new JTextField(5);
		p1.add(field2);
		JLabel result = new JLabel("Result");
		p1.add(result);
		JTextField field3 = new JTextField(5);
		p1.add(field3);
		field3.setEditable(false);

		JPanel p2 = new JPanel(new FlowLayout());
		add(p2);
		JButton add = new JButton("Add", new ImageIcon(getClass().getResource("..\\images\\addIcon.png")));
		p2.add(add);
		JButton subtract = new JButton("Subtract",new ImageIcon(getClass().getResource("..\\images\\subtractIcon.png")));
		p2.add(subtract);
		JButton multiply = new JButton("Multiply",new ImageIcon(getClass().getResource("..\\images\\multiplyIcon.png")));
		p2.add(multiply);
		JButton divide = new JButton("Divide", new ImageIcon(getClass().getResource("..\\images\\divideIcon.png")));
		p2.add(divide);

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
