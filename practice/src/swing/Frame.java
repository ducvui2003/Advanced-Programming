package swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Frame extends JFrame {
	String[] choseeForStudent = { "Phan Ban", "Khong Phan Ban" };
	String[] choseeForCollege = { "Kỷ Thuật", "Xã Hội" };
	String[] choseeForEngineer = { "Co Khi", "CNTT" };

	JComboBox listForStudent = new JComboBox(choseeForStudent);
	JComboBox listForCollege = new JComboBox(choseeForCollege);
	JComboBox listForEngineer = new JComboBox(choseeForEngineer);
	JRadioButton student, college, engineer;
	JCheckBox newspaper, book, music;
	JLabel notify;
	JTextField status1, status2, status3;
	JPanel containList = new JPanel();

	public Frame() {
		setLayout(new GridLayout(2, 1));
		JPanel pn1 = new JPanel(new GridLayout(2, 2, 5, 5));
		add(pn1);
		pn1.add(new JLabel("Nghe Nghiep"));
		containList.add(listForStudent);
		pn1.add(containList);

		JPanel pn2 = new JPanel(new GridLayout(3, 1, 5, 5));
		pn1.add(pn2);
		pn2.add(student = new JRadioButton("Hoc Sinh"));
		pn2.add(college = new JRadioButton("Sinh Vien"));
		pn2.add(engineer = new JRadioButton("Ky Su"));
		ButtonGroup gr = new ButtonGroup();
		gr.add(student);
		gr.add(college);
		gr.add(engineer);

		JPanel pn3 = new JPanel(new GridLayout(3, 1, 5, 5));
		pn1.add(pn3);
		pn3.add(newspaper = new JCheckBox("Doc bao"));
		pn3.add(book = new JCheckBox("Doc sach"));
		pn3.add(music = new JCheckBox("Nghe nhac"));

		add(notify = new JLabel());
		notify.setLayout(new FlowLayout());
		notify.setHorizontalAlignment(SwingConstants.CENTER);
  		notify.setBackground(Color.WHITE);
		notify.add(status1 = new JTextField(5));
		notify.add(status2 = new JTextField(5));
		notify.add(status3 = new JTextField(5));
		status1.setEditable(false);
		status1.setBackground(Color.WHITE);
		status1.setBorder(new LineBorder(Color.WHITE));
		status2.setEditable(false);
		status2.setBorder(new LineBorder(Color.WHITE));
		status2.setBackground(Color.WHITE);
		status3.setBorder(new LineBorder(Color.WHITE));
		status3.setEditable(false);
		status3.setBackground(Color.WHITE);

//		Handle Event
		student.addActionListener(new HandleEventJComboBox());
		college.addActionListener(new HandleEventJComboBox());
		engineer.addActionListener(new HandleEventJComboBox());

		book.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				status1.setText((e.getStateChange() == 1) ? "doc sach" : "");

			}
		});
		newspaper.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				status2.setText((e.getStateChange() == 1) ? "doc bao" : "");

			}
		});
		music.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				status3.setText((e.getStateChange() == 1) ? "doc bao" : "");

			}
		});
	}

	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setTitle("Input Frame");
		frame.setSize(700, 300);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	class HandleEventJComboBox implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == student) {
				listForStudent = new JComboBox(choseeForStudent);
//				containList.remove(listForCollege);
//				containList.remove(listForEngineer);
//				containList.add(listForStudent);
				repaint();
			}
			if (e.getSource() == college) {
				listForStudent = new JComboBox(choseeForCollege);
//				containList.remove(listForStudent);
//				containList.remove(listForEngineer);
//				containList.add(listForCollege);
				repaint();
			}
			if (e.getSource() == engineer) {
				listForStudent = new JComboBox(choseeForEngineer);
//				containList.remove(listForStudent);
//				containList.remove(listForCollege);
//				containList.add(listForEngineer);
				repaint();
			}
		}
	}

//	class HandleEventNotify implements ActionListener {
//		StringBuilder text = new StringBuilder();
//
//		public void actionPerformed(ActionEvent e) {
//			if (e.getSource() == newspaper) {
//				text.append(newspaper.getText());
//				System.out.println(text);
//			}
//			if (e.getSource() == book) {
//				text.append(book.getText());
//				System.out.println(text);
//			}
//			if (e.getSource() == music) {
//				text.append(music.getText());
//				System.out.println(text);
//			}
//			notify.setText(text.toString());
//		}
//	}

}
