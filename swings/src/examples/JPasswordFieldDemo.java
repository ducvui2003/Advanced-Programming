package examples;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class JPasswordFieldDemo extends JFrame {
	public JPasswordFieldDemo() {
		setLayout(new FlowLayout());
		JLabel lbPassword = new JLabel("Password: ");
		add(lbPassword);
		JPasswordField tfPassword = new JPasswordField(20);
		tfPassword.setEchoChar('.');
		add(tfPassword);
		setVisible(true);
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		JPasswordFieldDemo frame = new JPasswordFieldDemo();
		frame.setTitle("JPasswordField Demo");
	}
}
