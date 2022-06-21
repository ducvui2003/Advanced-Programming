package exercises;

import java.util.Random;

public class RandomStrings {
	static Random rd = new Random();

	public static String createString() {
		char[] letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ abcdefghijklmnopqrstuvwxyz 0123456789".toCharArray();
//		So String muon tao

//			So ki tu trong mot chuoi muon tao
		char[] chars = new char[rd.nextInt(10) + 2];
		for (int j = 0; j < chars.length; j++) {
			chars[j] = letters[rd.nextInt(letters.length)];
		}
		String stringRandom = String.valueOf(chars);

		return stringRandom;
	}

	public static String getString() {
		return createString();
		

	}
}
