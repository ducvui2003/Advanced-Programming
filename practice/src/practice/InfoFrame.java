package practice;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InfoFrame extends JFrame {
	public InfoFrame() {
		setLayout(new GridLayout(2, 1));
		JPanel pn1 = new JPanel();
		add(pn1);
		pn1.setLayout(new GridLayout(3, 3));
		pn1.add(new JLabel("ID: "));
		pn1.add(new JLabel("21130320"));
		pn1.add(new JLabel("Name: "));
		pn1.add(new JLabel("Le Anh Duc"));
		pn1.add(new JLabel("Class: "));
		pn1.add(new JLabel("DH21DTB"));
		JButton btn;
		JPanel pn2 = new JPanel();
		add(pn2);
		pn2.add(btn = new JButton("Close"));
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btn) {
					System.exit(InfoFrame.EXIT_ON_CLOSE);
				}
			}
		});
	}


}
