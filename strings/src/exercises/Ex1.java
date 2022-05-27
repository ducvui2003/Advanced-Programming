package exercises;

public class Ex1 {
	public static void main(String[] args) {
		String s = "Welcome to Java";
		System.out.print("-Number letter of String: ");
		countLetter(s);	
		System.out.println("-Print a leter in 1 line: ");
		toCharArray(s);
	}

	private static void countLetter(String s) {
		String[] tokens = s.split(" ");
		System.out.println(tokens.length);
	}

	private static void toCharArray(String s) {
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			System.out.println("\t" + chars[i]);
		}
	}

	private static void reverseString(String s) {
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length/2; i++) {
		char temp;
		temp = chars[chars.length-i];
		
		}
		
	}

}
