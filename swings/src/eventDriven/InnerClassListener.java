package eventDriven;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class InnerClassListener extends JFrame {
	JButton btnSave, btnCancel;
	JTextField txtNum1, txtNum2, txtResult;

	public InnerClassListener() {
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
		btnSave.setIcon(new ImageIcon(getClass().getResource("..\\images\\save-icon.png")));
		btnCancel.setIcon(new ImageIcon(getClass().getResource("..\\images\\cancel.png")));

//		Add listener
		MyListener lst = new MyListener();
		btnSave.addActionListener(lst);
		btnCancel.addActionListener(lst);
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
		InnerClassListener frame = new InnerClassListener();
		frame.pack();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}

}
