package exercises;

public class Ex1 {
	public static void main(String[] args) {
		String s = "Welcome to Java";
		System.out.print("-Number letter of String: ");
		countLetter(s);
		System.out.println("-Print a leter in 1 line: ");
		toCharArray(s);
		System.out.println("Reverse String: "+reverseString(s));
		
	}

	private static void countLetter(String s) {
		String[] tokens = s.split(" ");
		System.out.println(tokens.length);
	}

	private static void toCharArray(String s) {
		String[] tokens = s.split(" ");
		for (int i = 0; i < tokens.length; i++) {
			System.out.println("\t" + tokens[i]);
		}
	}

	private static StringBuilder reverseString(String s) {
//	Convert String -> String builder to use reverse method		
		StringBuilder string = new StringBuilder(s);
		return string.reverse();
	}

}
