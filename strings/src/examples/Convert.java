package examples;

public class Convert {
	public static void main(String[] args) {
		// Convert String to Char Array
		System.out.print("String to Char array: ");
		char[] chars = "Java".toCharArray();
		for (int i = 0; i < chars.length; i++) {
			System.out.print(chars[i] + ", ");
		}
//		Convert Char array to String
		String s = String.valueOf(chars);
		System.out.print("\nChar array to String: " + s);
	}

}
