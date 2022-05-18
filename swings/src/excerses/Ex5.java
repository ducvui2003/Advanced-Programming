
package excerses;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Ex5 extends JFrame {
	JTextField name, money, showName, showGender, showMoney;
	JRadioButton male, famale;

	public Ex5(String title) {
		super(title);
		setLayout(new GridLayout(3, 1));

//	Name
		JPanel containerName = new JPanel(new FlowLayout());
		add(containerName);
		containerName.add(new Label("Họ tên"));
		containerName.add(name = new JTextField(10));
		containerName.add(showName = new JTextField(10));
		showName.setEditable(false);

//	Gender
		JPanel containerGender = new JPanel();
		add(containerGender);
		containerGender.add(new Label("Nam"));
		containerGender.add(male = new JRadioButton(""));
		containerGender.add(new Label("Nữ"));
		containerGender.add(famale = new JRadioButton(""));
		ButtonGroup gbtn = new ButtonGroup();
		gbtn.add(male);
		gbtn.add(famale);
		containerGender.add(showGender = new JTextField(10));
//	Set size for component	
		showGender.setPreferredSize(new Dimension(20, 20));
		showGender.setEditable(false);

//	Money
		JPanel containerMoney = new JPanel();
		add(containerMoney);
		containerMoney.add(new JLabel("Số tiền"));
		containerMoney.add(money = new JTextField(10));
		containerMoney.add(showMoney = new JTextField(10));
		showMoney.setEditable(false);
//	Handle Event	
		showMoney.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				String result = String.format("%,.2f");
				Double.parseDouble(money.getText());
				showMoney.setText(result);
			}
		});
	}

	public static void main(String[] args) {
		Ex5 frame = new Ex5("Khảo sát thông tin");
		frame.pack();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
