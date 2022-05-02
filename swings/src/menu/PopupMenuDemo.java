package menu;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class PopupMenuDemo extends JFrame {
	JMenuItem miniNew, miniOpen, miniPrint, miniExit;
	JPopupMenu pmn = new JPopupMenu();

	public PopupMenuDemo() {
		pmn.add(miniNew = new JMenuItem("New"));
		pmn.add(miniOpen = new JMenuItem("Open"));
		pmn.add(miniPrint = new JMenuItem("Print"));
		pmn.add(miniExit = new JMenuItem("Exit"));

//	Xu li su kien click chuot
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				showPopup(arg0);
			}
		});
		setVisible(true);
		setSize(200,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	private void showPopup(MouseEvent e) {
		pmn.show(e.getComponent(), e.getX(), e.getY());
	}

	public static void main(String[] args) {
		new PopupMenuDemo();
		
	}
}
