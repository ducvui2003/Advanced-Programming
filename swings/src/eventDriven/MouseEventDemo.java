package eventDriven;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class MouseEventDemo extends JFrame implements MouseListener, MouseMotionListener {
	JTextField tf;

	public MouseEventDemo(String title) {
		super(title);
		tf = new JTextField(60);
		addMouseListener(this);
		addMouseMotionListener(this);
		setLayout(new BorderLayout());
		add(tf, BorderLayout.SOUTH);
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		MouseEventDemo frame = new MouseEventDemo("Mouse Event Demo");
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		String msg = "Mouse clicked";
		tf.setText(msg);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		String msg = "Mouse pressed";
		tf.setText(msg);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		String msg = "Mouse released";
		tf.setText(msg);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		String msg = "Mouse entered components";
		tf.setText(msg);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		String msg = "Mouse excited component";
		tf.setText(msg);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		String msg = "Mouse dragged at " + e.getX() + ", " + e.getY();
		tf.setText(msg);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		String msg = "Mouse moved at " + e.getX() + ", " + e.getY();
		tf.setText(msg);
	}
}
