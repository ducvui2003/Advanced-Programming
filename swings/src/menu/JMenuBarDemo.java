package menu;

import java.awt.CheckboxMenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;

public class JMenuBarDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
//		Create MenuBar
		JMenuBar jmb = new JMenuBar();
		frame.setTitle("My Menus");
//		Add MenuBar
		frame.setJMenuBar(jmb);
//		Create Menus	
		JMenu fileMenu = new JMenu("File");
		JMenu helpMenu = new JMenu("Help");
		jmb.add(fileMenu);
		jmb.add(helpMenu);
//		Create MenuItems
		fileMenu.add(new JMenuItem("New"));
		fileMenu.add(new JMenuItem("Open"));
		fileMenu.addSeparator();
		fileMenu.add(new JMenuItem("Print"));
		fileMenu.addSeparator();
		fileMenu.add(new JMenuItem("Exit"));
//		Create SubMenus Items
		JMenu softwareHelpSubMenu = new JMenu("Software");
		JMenu hardwareHelpSubMenu = new JMenu("Hardware");
		helpMenu.add(softwareHelpSubMenu);
		helpMenu.add(hardwareHelpSubMenu);
		softwareHelpSubMenu.add(new JMenuItem("Unix"));
		softwareHelpSubMenu.add(new JMenuItem("Nt"));
		softwareHelpSubMenu.add(new JMenuItem("Win95"));
//		Create check box menu items
		helpMenu.add(new JCheckBoxMenuItem("Check it"));
//		Create check radio-button Menu items
		JMenu colorHelpSubMenu = new JMenu("Color");
		helpMenu.add(colorHelpSubMenu);

		JRadioButtonMenuItem jrmiBlue, jrmiYellow, jrmiRed;
		colorHelpSubMenu.add(jrmiBlue = new JRadioButtonMenuItem("Blue"));
		colorHelpSubMenu.add(jrmiYellow = new JRadioButtonMenuItem("Yellow"));
		colorHelpSubMenu.add(jrmiRed = new JRadioButtonMenuItem("Red"));

//		User only choose 1 of choices 
		ButtonGroup btg = new ButtonGroup();
		btg.add(jrmiBlue);
		btg.add(jrmiYellow);
		btg.add(jrmiRed);
//		Image Icons
		JMenuItem jmiNew, jmiOpen;
		fileMenu.add(jmiNew = new JMenuItem("New"));
		fileMenu.add(jmiOpen = new JMenuItem("Open"));
		jmiNew.setIcon(
				new ImageIcon("D:\\University\\Year_1\\Advanced Programming\\Advanced\\swings\\src\\images\\new.png"));
		jmiOpen.setIcon(
				new ImageIcon("D:\\University\\Year_1\\Advanced Programming\\Advanced\\swings\\src\\images\\open.png"));
//		Mnemonics ALT + mnemonics
		helpMenu.setMnemonic('H');
		fileMenu.setMnemonic('F');
		jmiNew.setMnemonic('N');
		jmiOpen.setMnemonic('O');
//		Accelerators: Ctrl + O
		jmiOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
		frame.setSize(300, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}
}
