package excerses;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Ex8 extends JFrame {
	private String categories[] = { "Household", "Office", "Extended Family", "Company (US)", "Company (World)", "Team",
			"Will", "Birthday Card List", "High School", "Country", "Continent", "Planet" };
	private JList list = new JList(categories);
	private JScrollPane scroolPane = new JScrollPane(list);

	public Ex8() {
//		No Necessary add (List)
//		JScroolPane = List + JScrollBar
		add(scroolPane, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		Ex8 frame = new Ex8();
		frame.setTitle("JScroolPane Demo");
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(400, 200);
	}
}
