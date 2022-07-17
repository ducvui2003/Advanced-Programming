package convertMetreToKilometre;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class HandleEvent extends JFrame implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Frame.btn) {
			try {
				double input = Double.parseDouble(Frame.field.getText());
				Frame.notify.setText("Result: " + Convert.convertMToKm(input) + "km");
			} catch (Exception e2) {
				Frame.notify.setText("Error");
			}
		}
	}
}
