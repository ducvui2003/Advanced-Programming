package excerses;

import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex3 extends JFrame {
//		Create Random 
	static Random rd = new Random();
	static int sizeArray = rd.nextInt(10) + 5;

	static int[] myList = createArray(sizeArray);

	public static void main(String[] args) {
		System.out.print("-Elements: " + printArray(myList));
		System.out.println("\n-Quantity of number 0: " + count0(myList));
		System.out.println("-Quantity of positive number: " + countPositive(myList));
		System.out.println("-Quantity of negative number: " + countNegative(myList));
		System.out.println("-Max Negative number: " + maxNegative(myList));
		System.out.println("-Min Positive number: " + minPositive(myList));
		System.out.println("-Is the total of negative number equal to the total of positive number?\n-->"
				+ totalNegativeEqualPositive(myList));

//		Swings
		Ex3 frame = new Ex3();
	}

// 	Create array
	public static int[] createArray(int n) {
		Random rd = new Random();
		System.out.println("-Size of array: " + n);
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = rd.nextInt(100) - 20;
		}
		return array;
	}

//	Print array
	public static StringBuilder printArray(int[] array) {
		StringBuilder string = new StringBuilder();

		for (int i = 0; i < array.length; i++) {
			string.append(array[i]);
			string.append(" ");
		}
		return string;
	}

//	Count 0, positive and negative number
	public static int count0(int[] array) {
		int count0 = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				count0 += 1;
			}
		}
		return count0;
	}

	public static int countPositive(int[] array) {
		int countPositive = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				countPositive += 1;
			}
		}
		return countPositive;
	}

	public static int countNegative(int[] array) {
		int countNegative = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				countNegative += 1;
			}
		}
		return countNegative;
	}

//	Determinate max negative number
	public static int maxNegative(int[] array) {
//		Tim so am dau tien trong day lam maxNegative de so sanh
		int maxNegative = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				maxNegative = array[i];
				break;
			}
		}
		for (int i = 1; i < array.length; i++) {
			if (array[i] > maxNegative && array[i] < 0) {
				maxNegative = array[i];
			}
		}
		return maxNegative;
	}

//	Determinate min positive number
	public static int minPositive(int[] array) {
		int minPositive = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < minPositive && array[i] > 0) {
				minPositive = array[i];
			}
		}
		return minPositive;
	}

//	|total negative number | == total positive number ??
	public static boolean totalNegativeEqualPositive(int[] array) {
		int totalPositive = 0;
		int totalNegative = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				totalPositive += array[i];
			}
			if (array[i] < 0) {
				totalNegative += array[i];
			}
		}
		if (totalNegative == totalPositive) {
			return true;
		} else
			return false;
	}

	public Ex3() {
		setLayout(new GridLayout(0, 2));
		add(new JLabel("So phan tu"));
		add(new JLabel("" + sizeArray));
		add(new JLabel("Mang"));
		add(new JLabel("" + printArray(myList)));
		add(new JLabel("So phan tu bang 0"));
		add(new JLabel("" + count0(myList)));
		add(new JLabel("So phan tu lon hon 0"));
		add(new JLabel("" + countPositive(myList)));
		add(new JLabel("So phan tu be hon 0"));
		add(new JLabel("" + countNegative(myList)));
		add(new JLabel("So am lon nhat"));
		add(new JLabel("" + maxNegative(myList)));
		add(new JLabel("So duong be nhat"));
		add(new JLabel("" + minPositive(myList)));
		add(new JLabel("tong |phan am| = phan duong?"));
		add(new JLabel("" + (totalNegativeEqualPositive(myList) ? "Co" : "Khong")));

		setTitle("Ex3");
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
