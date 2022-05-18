package excerses;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex1 extends JFrame {
	private JButton sumBtn, subtractBtn, multiplyBtn, devideBtn, equalBtn;
	private JTextField tfNumber1, tfNumber2, tfEqual;

	public Ex1() {
		setLayout(new GridLayout(5, 1));
		JPanel number1 = new JPanel();
		add(number1);
		number1.setLayout(new FlowLayout());
		number1.add(new Label("Number 1:"));
		number1.add(tfNumber1 = new JTextField(20));

		JPanel express = new JPanel();
		add(express);
		sumBtn = new JButton(" + ");
		express.add(sumBtn);
		subtractBtn = new JButton(" - ");
		express.add(subtractBtn);
		multiplyBtn = new JButton(" * ");
		express.add(multiplyBtn);
		devideBtn = new JButton(" / ");
		express.add(devideBtn);

		JPanel number2 = new JPanel();
		add(number2);
		number2.setLayout(new FlowLayout());
		number2.add(new Label("Number 2:"));
		number2.add(tfNumber2 = new JTextField(20));

		JPanel container = new JPanel();
		add(container);
		equalBtn = new JButton(" = ");
		container.add(equalBtn);

		JPanel result = new JPanel();
		add(result);
		result.setLayout(new FlowLayout());
		result.add(new Label("Result: "));
		result.add(tfEqual = new JTextField(20));
		tfEqual.setEditable(false);

//		Handle Event
		Calculate calculate = new Calculate();
		sumBtn.addActionListener(calculate);
		subtractBtn.addActionListener(calculate);
		multiplyBtn.addActionListener(calculate);
		devideBtn.addActionListener(calculate);
		equalBtn.addActionListener(calculate);

		setVisible(true);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	class Calculate implements ActionListener {
		double equal;//???
		public void actionPerformed(ActionEvent e) {
			double n1 = Double.parseDouble(tfNumber1.getText());
			double n2 = Double.parseDouble(tfNumber2.getText());
			if (e.getSource() == sumBtn)
				equal = n1 + n2;
			else if (e.getSource() == subtractBtn)
				equal = n1 - n2;
			else if (e.getSource() == multiplyBtn)
				equal = n1 * n2;
			else if (e.getSource() == devideBtn)
				equal = n1 / n2;
			
			if (e.getSource() == equalBtn) {
				tfEqual.setText(equal + "");
			}
		}
	}

	public static void main(String[] args) {
		Ex1 frame = new Ex1();
		frame.setTitle("Calulator");
	}
}
