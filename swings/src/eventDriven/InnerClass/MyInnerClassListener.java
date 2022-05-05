package eventDriven.InnerClass;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import eventDriven.EventHandle.HandleEvent;

public class MyInnerClassListener extends JFrame {
	JButton btnSave, btnCancel;
	JTextField txtNum1, txtNum2, txtResult;

	public MyInnerClassListener() {
		super("My Inner Class Listener Demo");
		setLayout(new FlowLayout());

		add(new JLabel("Number 1: "));
		add(txtNum1 = new JTextField(10));

		add(new JLabel("Number 2: "));
		add(txtNum2 = new JTextField(10));

		add(new JLabel("Result: "));
		add(txtResult = new JTextField(10));
		txtResult.setEditable(false);
//		Buttons
		add(btnSave = new JButton("Save"));
		add(btnCancel = new JButton("Cancel"));
		btnSave.setIcon(new ImageIcon(
				"D:\\University\\Year_1\\Advanced Programming\\Advanced\\swings\\src\\images\\save-icon.png"));
		btnCancel.setIcon(new ImageIcon(
				"D:\\University\\Year_1\\Advanced Programming\\Advanced\\swings\\src\\images\\cancel.png"));
	}

	class MyListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnSave) {
				double n1 = Double.parseDouble(txtNum1.getText());
				double n2 = Double.parseDouble(txtNum2.getText());
				txtResult.setText((n1 + n2) + "");
			} else {
				System.exit(0);
			}
		}
	}

	public static void main(String[] args) {
		MyInnerClassListener frame = new MyInnerClassListener();
		frame.pack();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
}
