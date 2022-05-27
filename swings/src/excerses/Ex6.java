package excerses;

import java.awt.BorderLayout;
import java.awt.Label;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex6 extends JFrame {
	private String[] flagTitles = { "bug1.png", "bug2.png", "bug3.png" };
	private JComboBox cbo = new JComboBox(flagTitles);
	private JPanel pnName = new JPanel();
	private JPanel pnImg = new JPanel();
	private JLabel lbImg = new JLabel(new ImageIcon(getClass().getResource("..\\images\\bug1.png")));
	private ImageIcon bug1 = new ImageIcon(getClass().getResource("..\\images\\bug1.png"));

	public Ex6(String name) {
		super(name);
		setLayout(new BorderLayout());
		add(pnName, BorderLayout.NORTH);
		pnName.add(cbo);
		add(pnImg, BorderLayout.CENTER);
		pnImg.add(lbImg);
	}

	public static void main(String[] args) {
		Ex6 frame = new Ex6("Testing JComboBox");
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(400,400);
	}
}
