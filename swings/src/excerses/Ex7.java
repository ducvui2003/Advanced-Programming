package excerses;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Ex7 extends JFrame {
	private String[] color = { "Black", "Blue", "Cyan", "Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Orange",
			"Pink", "Red", "White", "Yellow" };
	private JList lstColor = new JList(color);
	private JPanel contentPane = new JPanel();

	public Ex7(String titile) {
		super(titile);

		add(contentPane);
		contentPane.add(lstColor);
		lstColor.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				int index = lstColor.getSelectedIndex();

				contentPane.setBackground(Color.black);
			}

		});
	}

	public static void main(String[] args) {
		Ex7 frame = new Ex7("Testing JComboBox");
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(400, 400);
	}
}
