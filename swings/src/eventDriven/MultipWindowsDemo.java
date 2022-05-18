package eventDriven;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

import guiComponents.ScrollBarDemo;

public class MultipWindowsDemo extends JFrame {
	private JFrame newFrame1 = new InnerClassListener();
	private JFrame newFrame2 = new ScrollBarDemo();

	public MultipWindowsDemo() {
		setLayout(new FlowLayout());
//	Button
		JButton btnScroll = new JButton("Scroll Bar Demo");
		JButton btnInner = new JButton("My Inner Class Listener Demo");
		add(btnScroll);
		add(btnInner);

//	Create and registry anonymous inner-class listener
		btnScroll.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				newFrame1.setVisible(true);
				newFrame1.setSize(400, 400);
				newFrame1.setLocationRelativeTo(null);
			}
		});
		btnInner.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				newFrame2.setVisible(true);
				newFrame2.setSize(400, 400);
				newFrame2.setLocationRelativeTo(null);
			}
		});

	}

	public static void main(String[] args) {
		MultipWindowsDemo frame = new MultipWindowsDemo();
		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
