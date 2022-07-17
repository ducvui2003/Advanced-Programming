package practice;

public class Ex1 {
	public static boolean amStrong(int number) {
		char[] arrayNumber = ("" + number).toCharArray();
		int equal = 0;
		for (int i = 0; i < arrayNumber.length; i++) {
			int toInt = (int) arrayNumber[i] - 48;
			equal = equal + (toInt * toInt * toInt);
		}
		if (equal == number) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		int case1 = 153;
		if (amStrong(case1)) {
			System.out.println("Right");
		} else {
			System.out.println("False");
		}
		int case2 = 371;
		if (amStrong(case2)) {
			System.out.println("Right");
		} else {
			System.out.println("False");
		}
		
	}
}
