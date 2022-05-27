package excerses;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

public class Ex9 extends JFrame {
	private String categories[] = { "Household", "Office", "Extended Family", "Company (US)", "Company (World)", "Team",
			"Will", "Birthday Card List", "High School", "Country", "Continent", "Planet" };
	private JList list = new JList(categories);
	private JScrollPane jScPane = new JScrollPane(list);

	public Ex9() {
		add(jScPane);
		for (int i = 0; i < categories.length; i++) {
			setLayout(new FlowLayout());
			JRadioButton btn1, btn2, btn3;
			list.add(btn1 = new JRadioButton());
			list.add(btn2 = new JRadioButton());
			list.add(btn3 = new JRadioButton());
			ButtonGroup gr = new ButtonGroup();
			gr.add(btn1);
			gr.add(btn2);
			gr.add(btn3);
		}

	}

	public static void main(String[] args) {
		Ex9 frame = new Ex9();
		frame.setTitle("JScroolPane Demonstration");
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(400, 200);
	}
}
