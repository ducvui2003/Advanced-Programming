package eventDriven;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HandleEvent extends JFrame {
	public HandleEvent() {
		JButton btnOK = new JButton("OK");
		JButton btnCancel = new JButton("Cancel");

		JPanel pnlButton = new JPanel();
		pnlButton.add(btnOK);
		pnlButton.add(btnCancel);
		add(pnlButton);

//		Registry listeners
		OKListenerClass okLis = new OKListenerClass();
		CancelListenerClass canLis = new CancelListenerClass();
		btnOK.addActionListener(okLis);
		btnCancel.addActionListener(canLis);
	}

	public static void main(String[] args) {
		HandleEvent frame = new HandleEvent();
		frame.setSize(200, 200);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
}
