package exercises;

public class Exx6 {

	public static void main(String[] args) {
		int k = 2;
		int l = 3;
		StringBuilder string = new StringBuilder(exercises.RandomStrings.getString());
		System.out.println("String: " + string);
		System.out.println("Encode String: " + encodeString(k, l, string));
	}

	private static StringBuilder encodeString(int k, int l, StringBuilder s) {
		StringBuilder encodeString = new StringBuilder("");
		String[] stringArray = s.toString().split(" ");
		if (stringArray.length <= 4) {
			for (int i = 0; i < stringArray.length; i++) {
				if (i == 0 || i == 2)
					encodeString.append(increaseValueCharsInString(k, stringArray[i]));

				if (i == 1 || i == 3)
					encodeString.append(increaseValueCharsInString(-l, stringArray[i]));

			}

		} else {
			return encodeString.append("Can't encode");
		}

		return encodeString;

	}

	private static StringBuilder increaseValueCharsInString(int number, String s) {
		StringBuilder newString = new StringBuilder("");
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (rangeEncode(chars[i], number)) {
				chars[i] = (char) (chars[i] + number);
			}
		}

		return newString.append(new String(chars)+" ");
	}

	private static boolean rangeEncode(char character, int number) {
		return (int) character + number >= 48 && (int) character + number <= 57
				|| (int) character + number >= 65 && (int) character + number <= 90
				|| (int) character + number >= 97 && (int) character + number <= 122;
	}
}
