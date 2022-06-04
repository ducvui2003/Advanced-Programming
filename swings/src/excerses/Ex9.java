package excerses;

import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

public class Ex9 extends JFrame {
	private String categories[] = { "Household", "Office", "Extended Family", "Company (US)", "Company (World)", "Team",
			"Will", "Birthday Card List", "High School", "Country", "Continent", "Planet" };
	private JList list = new JList(categories);

	public Ex9() {

		JPanel container = new JPanel();
		container.setLayout(new GridLayout(0, 4));

		container.add(new Panel());
		container.add(new Panel().add(new JLabel("0-1")));
		container.add(new Panel().add(new JLabel("2-5")));
		container.add(new Panel().add(new JLabel("6-10")));
		for (int i = 0; i < categories.length; i++) {
			container.add(new Label(categories[i]));
			JRadioButton btn1, btn2, btn3;
			container.add(btn1 = new JRadioButton());
			container.add(btn2 = new JRadioButton());
			container.add(btn3 = new JRadioButton());
			ButtonGroup btnGr = new ButtonGroup();
			btnGr.add(btn1);
			btnGr.add(btn2);
			btnGr.add(btn3);
		}
		JScrollPane jScPane = new JScrollPane(container);
		add(jScPane);
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
