package basics;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ShowBoxLayout extends JFrame {
	private JLabel jblFlag = new JLabel();
	private ImageIcon imageIconAus = new ImageIcon(getClass().getResource(""));
	private ImageIcon imageIconUs = new ImageIcon(getClass().getResource("..\\images\\\\american_flag.gif"));
	private ImageIcon imageIconCanada = new ImageIcon(getClass().getResource(""));
	private ImageIcon imageIconNorway = new ImageIcon(getClass().getResource(""));
	private ImageIcon imageIconGermany = new ImageIcon(getClass().getResource("..\\images\\\\germanyIcon.png"));
	private ImageIcon imageIconPrint = new ImageIcon(getClass().getResource("..\\images\\print-icon.png"));
	private ImageIcon imageIconSave = new ImageIcon(getClass().getResource("..\\images\\save-icon.png"));

	private JButton jbtUS = new JButton("US");
	private JButton jbtCanada = new JButton("Canada	");
	private JButton jbtAus = new JButton("Australia	");
	private JButton jbtNorway = new JButton("Norway	");
	private JButton jbtGermany = new JButton("Germany	");

	public ShowBoxLayout() {
		JPanel box1 = new JPanel();
		BoxLayout bl1 = new BoxLayout(box1, BoxLayout.X_AXIS);
		box1.setLayout(bl1);

		JPanel box2 = new JPanel();
		BoxLayout bl2 = new BoxLayout(box2, BoxLayout.Y_AXIS);
		box2.setLayout(bl2);

		jblFlag.setLayout(new BoxLayout(jblFlag, BoxLayout.X_AXIS));

		box1.add(new JButton(imageIconPrint));
		box1.add(new JButton(imageIconSave));
		
		box2.add(jbtUS);
		box2.add(jbtCanada);
		box2.add(jbtAus);
		box2.add(jbtNorway);
		box2.add(jbtGermany);
		box1.setBorder(new javax.swing.border.LineBorder(Color.red));
		box2.setBorder(new javax.swing.border.LineBorder(Color.black));

//		jblFlag.add(new JButton(imageIconAus));
		jblFlag.add(new JButton(imageIconUs));
//		jblFlag.add(new JButton(imageIconCanada));
//		jblFlag.add(new JButton(imageIconNorway));
//		jblFlag.add(new JButton(imageIconGermany));

		add(box1, BorderLayout.NORTH);
		add(box2, BorderLayout.EAST);
		add(jblFlag, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		ShowBoxLayout frame = new ShowBoxLayout();

		frame.setTitle("Jframe Demo");
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
