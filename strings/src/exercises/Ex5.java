package exercises;

public class Ex5 {
	public static void main(String[] args) {
		int k = 3;
		StringBuilder string = new StringBuilder(exercises.RandomStrings.getString());
		System.out.println("String: " + string);
		System.out.println("Encode String: " + encodeString(3, string));
	}

	private static StringBuilder encodeString(int k, StringBuilder s) {
		StringBuilder encodeString = new StringBuilder("");
		char[] charsArray = s.toString().toCharArray();

		for (int i = 0; i < charsArray.length; i++) {
			if (rangeEncode(charsArray[i], k)) {
				charsArray[i] = (char) (charsArray[i] + k);
			}
		}

		return encodeString.append(new String(charsArray));

	}

//	private static StringBuilder increaseValueCharsInString(int number, String s) {
//		for (int i = 0; i < chars.length; i++) {
//			if (rangeEncode(chars[i], number)) {
//				chars[i] = (char) (chars[i] + number);
//				newString.append(chars[i]);
//			}
//		}
//
//		return newString;
//	}

	private static boolean rangeEncode(char character, int number) {
		return (int) character + number >= 48 && (int) character + number <= 57
				|| (int) character + number >= 65 && (int) character + number <= 90
				|| (int) character + number >= 97 && (int) character + number <= 122;
	}
}
