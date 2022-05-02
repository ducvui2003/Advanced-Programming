package eventDriven;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class OKListenerClass implements ActionListener {
	public void actionPerformed(MouseEvent e) {
		System.out.println("OK Button click");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
