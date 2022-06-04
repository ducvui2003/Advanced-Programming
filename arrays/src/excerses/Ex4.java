package excerses;

import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex4 extends JFrame {
	static Random rd = new Random();
	static int sizeArray = rd.nextInt(6) + 4;
	static double[] myList = createArrays(sizeArray);

	public static void main(String[] args) {
		System.out.println("-Elements: \n" + printArray(myList));
		if (sizeArray % 2 == 0) {
			System.out.println("-->Symmetric");
			System.out.println(changePosition(myList));
		} else {
			System.out.println("-->Asymmetric");
		}
//Swings
		Ex4 frame = new Ex4();

	}

	public static double[] createArrays(int n) {
		Random rc = new Random();
		System.out.println("-Elements of array:" + n);
		double[] array = new double[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = Math.round(rc.nextDouble() * 1000.0) / 10.0;
		}
		return array;
	}

	public static StringBuilder printArray(double[] array) {
		StringBuilder string = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			string.append(array[i]);
			string.append(" ");
		}
		return string;
	}

	public static StringBuilder changePosition(double[] array) {
		for (int i = 0; i <= array.length / 2; i++) {
			double temp = array[i];
			array[i] = array[array.length - (i + 1)];
			array[array.length - (i + 1)] = temp;
		}
		return printArray(array);
	}

	public Ex4() {
		setLayout(new GridLayout(0, 2, 10, 10));
		add(new JLabel("So phan tu"));
		add (new JLabel("" + sizeArray));
		add(new JLabel("Mang"));
		add(new JLabel("" + printArray(myList)));

		if (sizeArray % 2 == 0) {
			add(new JLabel("Even Arrays ->Change the position of the element"));
			add(new JLabel("" + changePosition(myList)));
		} else {
			add(new JLabel("Odd Arrays -> Can't change the position of the element"));

		}

		setTitle("Ex4");
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
