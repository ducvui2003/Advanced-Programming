package excerses;

import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex2 extends JFrame {
//	Create Random and size array
	public static Random rd = new Random();
	public static int sizeArray = rd.nextInt(10) + 5;
//	Create array and apply method
	public static int[] myList = createArray(sizeArray);

	public static void main(String[] args) {
		int max = getMax(myList);
		int times = numberOfTimes(myList, max);
		System.out.println("-Number of element in array is: " + sizeArray);
		System.out.println("-Elements: " + printArray(myList));
		System.out.println("-Max number is: " + max);
		System.out.println("-Times of max number appear in array is " + times);

		Ex2 frame = new Ex2();
		frame.setTitle("Ex2");
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static int[] createArray(int n) {
//		1. Declare and create array
		int[] myList = new int[n];
//		2. Assign value for array
		for (int i = 0; i < n; i++) {
			int temp = rd.nextInt(20);
			myList[i] = temp;
		}
		return myList;
	}

	private static StringBuilder printArray(int[] array) {

		StringBuilder string = new StringBuilder();
		for (int i = 0; i < array.length; i++) {

			string.append(array[i]);
			string.append(" ");
		}
		return string;
	}

	public static int getMax(int[] args) {
		int max = args[0];
		for (int i = 1; i < args.length; i++) {
			if (args[i] > max) {
				max = args[i];
			}
		}
		return max;
	}

	public static int numberOfTimes(int[] args, int number) {
		int times = 0;
		for (int i = 0; i < args.length; i++) {
			if (number == args[i]) {
				times += 1;
			}
		}
		return times;
	}

	public Ex2() {
		setLayout(new GridLayout(0, 2));
		add(new JLabel("So phan tu"));
		add(new JLabel("" + sizeArray));
		add(new JLabel("Mang"));
		add(new JLabel("" + printArray(myList)));
		add(new JLabel("Phan tu lon nhat"));
		add(new JLabel("" + getMax(myList)));
		add(new JLabel("So lan xuat hien"));
		add(new JLabel("" + numberOfTimes(myList, getMax(myList))));
		
	
	}
}
