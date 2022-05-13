package eventDriven;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AnonymousListener extends JFrame {
	public AnonymousListener() {
		JButton btnNew = new JButton("New");
		JButton btnOpen = new JButton("OK");
		JPanel jButtons = new JPanel();
		jButtons.add(btnNew);
		jButtons.add(btnOpen);
		add(jButtons);

//		Create and register anonymous inner-class listener
		btnNew.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("New button is just clicked");
			}
		});
		btnOpen.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Open button is just clicked");
			}
		});
	}

	public static void main(String[] args) {
		AnonymousListener frame = new AnonymousListener();
		frame.setTitle("Anonymous Class Listener Demo");
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
