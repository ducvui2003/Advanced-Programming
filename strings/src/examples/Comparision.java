package examples;

public class Comparision {

	public static void main(String[] args) {
		String s1 = "Welcome to Java";
		String s2 = "Hello World";
		String s3 = "Hello World";
		compare(s1, s2);
		compare(s2, s3);
		equalString(s1, s2);
		equalString(s2, s3);
		System.out.println(s3.compareTo(s1));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.length());
		System.out.println(s1.charAt(6));
		System.out.println(s1.concat(s3));
	}

	private static void compare(String s1, String s2) {
		if (s1 == s2) {
			System.out.println("S1 and S2 are the same object");
		} else {
			System.out.println("S1 and S2 aren't the same object");
		}

	}

	private static void equalString(String s1, String s2) {
		if (s1.equals(s2)) {
			System.out.println("S1 and S2 are the same object");
		} else {

			System.out.println("S1 and S2 aren't the same object");
		}
	}

}
