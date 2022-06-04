package excerses;

import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Ex13 extends JFrame {
	String[] day = new String[31];
	String[] month = new String[12];
	String[] year = new String[1000];

	public Ex13() {
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu file = new JMenu("File");
		menuBar.add(file);
		setLayout(new GridLayout(6, 1));
		add(new Label("LY LICH HOC SINH"));
//	pn1
		JPanel pn1 = new JPanel();
		add(pn1);
		pn1.add(new JLabel("Ho va ten"));
		pn1.add(new JTextField(20));
//	pn2
		JPanel pn2 = new JPanel();
		add(pn2);
		pn2.add(new JLabel("Ngay sinh"));
//	Day field
		for (int i = 0; i < day.length; i++) {
			int number = i + 1;
			day[i] = "" + number;
		}
		JComboBox dayField = new JComboBox(day);
		pn2.add(dayField);
//	Month Field	
		for (int i = 0; i < month.length; i++) {
			int number = i + 1;
			month[i] = "" + number;
		}
		JComboBox monthField = new JComboBox(month);
		pn2.add(monthField);
//	Year Field	
		for (int i = 0; i < year.length; i++) {
			int number = i + 1950;
			year[i] = "" + number;
		}
		JComboBox yearField = new JComboBox(year);
		pn2.add(yearField);

//	pn3
		JPanel pn3 = new JPanel();
		add(pn3);
		pn3.add(new JLabel("Gioi tinh"));
		JRadioButton male = new JRadioButton("Nam");
		pn3.add(male);
		JRadioButton famale = new JRadioButton("Nu");
		pn3.add(famale);
		ButtonGroup btnGrGender = new ButtonGroup();
		btnGrGender.add(famale);
		btnGrGender.add(male);

//	pn4
		JPanel pn4 = new JPanel();
		add(pn4);
		pn4.add(new JLabel("So thich"));
		JCheckBox food, song, shoping, travel;
		JPanel subPn4 = new JPanel(new GridLayout(2, 2));
		pn4.add(subPn4);
		subPn4.add(food = new JCheckBox("An uong"));
		subPn4.add(song = new JCheckBox("Ca hat"));
		subPn4.add(shoping = new JCheckBox("Mua sam"));
		subPn4.add(travel = new JCheckBox("Du lich"));
		ButtonGroup btnFavour = new ButtonGroup();
		btnFavour.add(travel);
		btnFavour.add(food);
		btnFavour.add(song);
		btnFavour.add(shoping);

//	pn5
		JPanel pn5 = new JPanel();
		add(pn5);
		JButton open, save, exit;
		pn5.add(open = new JButton("Open"));
		pn5.add(save = new JButton("Save"));
		pn5.add(exit = new JButton("Exit"));
	}

	public static void main(String[] args) {
		Ex13 frame = new Ex13();
		frame.setTitle("Ly Lich Sv");
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.pack();
	}
}
