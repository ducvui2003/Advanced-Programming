
package excerses;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
	JTextField txtName, txtMoney, txtNameShow, txtGenderShow, txtMoneyShow;
	JRadioButton maleBtn, famaleBtn;

	public Ex5(String title) {
		super(title);
		setLayout(new GridLayout(3, 1));

//	Name
		JPanel containerName = new JPanel(new FlowLayout());
		add(containerName);
		containerName.add(new Label("Họ tên"));
		containerName.add(txtName = new JTextField(10));
		containerName.add(txtNameShow = new JTextField(10));
		txtNameShow.setEditable(false);

//	Gender
		JPanel containerGender = new JPanel();
		add(containerGender);
		containerGender.add(new Label("Nam"));
		containerGender.add(maleBtn = new JRadioButton(""));
		containerGender.add(new Label("Nữ"));
		containerGender.add(famaleBtn = new JRadioButton(""));
		ButtonGroup gbtn = new ButtonGroup();
		gbtn.add(maleBtn);
		gbtn.add(famaleBtn);
		containerGender.add(txtGenderShow = new JTextField(10));
//	Set size for component	
		txtGenderShow.setPreferredSize(new Dimension(20, 20));
		txtGenderShow.setEditable(false);

//	Money
		JPanel containerMoney = new JPanel();
		add(containerMoney);
		containerMoney.add(new JLabel("Số tiền"));
		containerMoney.add(txtMoney = new JTextField(10));
		containerMoney.add(txtMoneyShow = new JTextField(10));
//		txtMoneyShow.setPreferredSize(new Dimension(10, 25));
		txtMoneyShow.setEditable(false);
//	Handle Event
		txtName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				String result = String.format("%s", txtName.getText());
				txtNameShow.setText(result);
			}
		});

		txtMoney.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				String result = String.format("%,.2f", Double.parseDouble(txtMoney.getText()));
				txtMoneyShow.setText(result);
			}
		});
		maleBtn.addActionListener(new BtnListener());
		famaleBtn.addActionListener(new BtnListener());
	}

//	Handle for maleBtn and famaleBtn
	class BtnListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == maleBtn) {
				txtGenderShow.setText("Nam");
			}
			if (e.getSource() == famaleBtn) {
				txtGenderShow.setText("Nữ");
			}
		}
	}

	public static void main(String[] args) {
		Ex5 frame = new Ex5("Khảo sát thông tin");
		frame.pack();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
