package excerses;

import java.util.Random;

public class Ex5 {
	public static void main(String[] args) {
		Random rd = new Random();
		int sizeArray = rd.nextInt(10) + 5;
		double number = Math.round(rd.nextDouble() * 100.0) / 10.0;

		double[] myList = createArrays(sizeArray);
		printArray(myList);
		System.out.println("\n-Number: " + number);
		System.out.println();
		System.out.println("-Is number appear in array?\n" + "-->" + determinedNumber(myList, number));
		System.out.println();
		System.out.println("-Times of number " + number + " appear: " + times(myList, number));
		System.out.println("-->At position: " + position(myList, number));
		System.out.println();
		arrayWithoutNumber(myList, number);
	}

	public static double[] createArrays(int n) {
		Random rd = new Random();
		System.out.println("-Quantity elements of array:" + n);
		double[] array = new double[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = Math.round(rd.nextDouble() * 100.0) / 10.0;
		}
		return array;
	}

	public static void printArray(double[] array) {
		System.out.print("-Elements: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
	}

//	Is number appear in array?
	public static boolean determinedNumber(double[] array, double number) {
		for (int i = 0; i < array.length; i++) {
			if (number == array[i]) {
				return true;
			}
		}
		return false;

	}

//	Count times of number and determinate number position

//	Count times of number
	public static int times(double[] array, double number) {
		int times = 0;
		for (int i = 0; i < array.length; i++) {
			if (number == array[i]) {
				times += 1;
			}
		}
		return times;
	}

//	determinate number position
	public static String position(double[] array, double number) {
		String index = "";
		for (int i = 0; i < array.length; i++) {
			if (number == array[i]) {
				index += i;
			}
		}
		return index;
	}

	public static void arrayWithoutNumber(double[] array, double number) {
		System.out.println("-Array has number " + number + ":");
		printArray(array);
		System.out.print("\n-Array without number " + number + ":\n-Elements: ");

		String[] arrayWithoutNumber = new String[array.length];
		for (int i = 0; i < arrayWithoutNumber.length; i++) {
//	Copy array to arrayWithoutNumber
//	Convert number -> String (make arrayWithoutNumber)		
			String text = String.valueOf(array[i]);
			arrayWithoutNumber[i] = text;
			if (array[i] == number) {
				arrayWithoutNumber[i] = "";
			}
			System.out.print(arrayWithoutNumber[i] + "\t");
		}
	}
}
