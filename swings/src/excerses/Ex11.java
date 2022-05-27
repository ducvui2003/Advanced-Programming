package excerses;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Ex11 extends JFrame {
	String[] numberString = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
			"Elevent", "Twelve" };

	public Ex11(String title) {
		super(title);
		setLayout(new GridLayout(1, 2));
		ButtonGroup btnGroup = new ButtonGroup();
//	pn1
		JPanel pn1 = new JPanel(new GridLayout(13, 1));// 0->12: lenght = 13
		add(pn1);
		pn1.setBackground(Color.WHITE);
		pn1.setBorder(new LineBorder(Color.BLACK));
		for (int i = 0; i < numberString.length; i++) {
			pn1.add(new JLabel(numberString[i]));
		}
//	pn2	
		JPanel pn2 = new JPanel(new GridLayout(13, 1));
		add(pn2);
		for (int i = 0; i < numberString.length; i++) {
			JCheckBox cbox;
			pn2.add(cbox = new JCheckBox("Selection " + i));
			btnGroup.add(cbox);

		}
	}

	public static void main(String[] args) {
		Ex11 frame = new Ex11("Select Number");
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(400, 400);
	}
}
