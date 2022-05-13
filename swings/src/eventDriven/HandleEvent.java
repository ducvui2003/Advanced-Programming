package eventDriven;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HandleEvent extends JFrame {
	JButton btnOK = new JButton("OK");
	JButton btnCancel = new JButton("Cancel");

	public HandleEvent() {

		JPanel pnlButton = new JPanel();
		pnlButton.add(btnOK);
		pnlButton.add(btnCancel);
		add(pnlButton);

//		Registry listeners
//		OKListenerClass okLis = new OKListenerClass();
//		CancelListenerClass canLis = new CancelListenerClass();
//		btnOK.addActionListener(okLis);
//		btnCancel.addActionListener(canLis);
		ListenerClass respond = new ListenerClass();
		btnOK.addActionListener(respond);
		btnCancel.addActionListener(respond);
	}

	 class ListenerClass implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnOK)
				System.out.println("OK button click");
			else
				System.out.println("Cancel button click");
		}
	}

	public static void main(String[] args) {
		HandleEvent frame = new HandleEvent();
		frame.setSize(200, 200);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
}
