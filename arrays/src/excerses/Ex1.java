package excerses;

import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ex1 extends JFrame {
	public static void main(String[] args) {
//	Create Random and size array
		Random rd = new Random();
		int sizeArray = rd.nextInt(10) + 5;
		int[] myList = createArray(sizeArray);
		printArray(myList);

		int max = getMax(myList);
		int min = getMin(myList);

		System.out.println("\n-Max number of array: " + max);
		System.out.println("-Index of max: " + getIndex(myList, max));
		System.out.println("-Min number of array: " + min);
		System.out.println("-Index of min: " + getIndex(myList, min));
		System.out.println("-Total of array: " + totalArray(myList));

		Ex1 frame = new Ex1(sizeArray, myList);
		frame.setTitle("Ex1");
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.pack();
		;
	}

	public static int[] createArray(int n) {
//		1. Declare and create array
		int[] myList = new int[n];
		Random rd = new Random();
//		2. Assign value for array
		System.out.println("-Number of element in array is: " + n);
		for (int i = 0; i < n; i++) {
			myList[i] = rd.nextInt(20);
		}
		return myList;
	}

	private static StringBuilder printArray(int[] array) {
		System.out.print("-Elements: ");
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			s.append(array[i]);
			s.append(" ");
		}
		return s;
	}

	public static int getMin(int[] args) {
		int min = args[0];
		for (int i = 1; i < args.length; i++) {
			if (args[i] < min) {
				min = args[i];
			}
		}
		return min;
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

	public static int getIndex(int[] array, int number) {
		int index = 0;
		for (index = 0; index < array.length; index++) {
			if (number == array[index]) {
				return index;
			}
		}
		return index;
	}

	public static int totalArray(int[] args) {
		int total = 0;
		for (int i = 0; i < args.length; i++) {
			total += args[i];
		}
		return total;
	}

	public Ex1(int sizeArray, int[] array) {
		JLabel showQuantityOfArray, showArrays, showMaxNumber, showMinNumber, showIndexMax, showIndexMin,
				showTotalArrays;
		setLayout(new GridLayout(0, 2, 15, 5));
		add(new JLabel("Số phần tử của mảng"));
		add(showQuantityOfArray = new JLabel("" + sizeArray));
//		add(new JTextField(""+printArray(createArray(sizeArray))));
		add(new JLabel("Các phần tử của mảng"));
		add(showTotalArrays = new JLabel("" + printArray(createArray(sizeArray))));
		add(new JLabel("Số lớn nhất"));
		add(showMaxNumber = new JLabel("" + getMax(array)));
		add(new JLabel("So be nhat"));
		add(showMinNumber = new JLabel("" + getMin(array)));
		add(new JLabel("Vi tri so lon nhat"));
		add(showIndexMin = new JLabel("" + getIndex(array, getMax(array))));
		add(new JLabel("Vi tri so be nhat"));
		add(showIndexMin = new JLabel("" + getIndex(array, getMin(array))));
		add(new JLabel("Tong chuoi"));
		add(showTotalArrays = new JLabel("" + totalArray(array)));
	}

}
