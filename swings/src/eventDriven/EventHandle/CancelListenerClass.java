package eventDriven.EventHandle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class CancelListenerClass implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Cancel Button click");

	}
}