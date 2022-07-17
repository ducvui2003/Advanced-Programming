package practice;

public class Ex2 {
	public static String removeNumber(String s) {
		char[] arrayString = s.toCharArray();
		for (int i = 0; i < arrayString.length; i++) {
			if ((int) arrayString[i] >= 48 && (int) arrayString[i] <= 57) {
				arrayString[i] = '\u0000';
			}
		}
		return new String(arrayString);
	}

	public static void main(String[] args) {
		String s = "Khoa CNTT 2017";
		System.out.println(s);
		System.out.println(removeNumber(s));
	}
}
