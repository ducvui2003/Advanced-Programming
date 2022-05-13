package excerses;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex1 extends JFrame {
	public Ex1() {
		setLayout(new GridLayout(5, 1));
		JPanel number1 = new JPanel();
		add(number1);
		number1.setLayout(new FlowLayout());
		number1.add(new Label("Number 1:"));
		number1.add(new JTextField(20));

		JPanel express = new JPanel();
		add(express);
		JButton sum = new JButton(" + ");
		express.add(sum);
		JButton subtract = new JButton(" - ");
		express.add(subtract);
		JButton multiply = new JButton(" * ");
		express.add(multiply);
		JButton devide = new JButton(" / ");
		express.add(devide);

		JPanel number2 = new JPanel();
		add(number2);
		number2.setLayout(new FlowLayout());
		number2.add(new Label("Number 2:"));
		number2.add(new JTextField(20));

		JPanel container = new JPanel();
		add(container);
		JButton equal = new JButton(" = ");
		container.add(equal);

		JPanel result = new JPanel();
		add(result);
		result.setLayout(new FlowLayout());
		result.add(new Label("Result: "));
		result.add(new JTextField(20));
		setVisible(true);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		Ex1 frame = new Ex1();
		frame.setTitle("Calulator");
	}
}
